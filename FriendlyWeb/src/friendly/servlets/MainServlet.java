package friendly.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLSyntaxErrorException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import friendly.ejb.FieldOfProfession;
import friendly.ejb.FriendlyUser;
import friendly.ejb.FriendlyUserLocationPurpose;
import friendly.ejb.Location;
import friendly.ejb.Purpose;
import friendly.facade.FacadeLocal;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	FacadeLocal facade;
	
    public MainServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = null;
		String operation = request.getParameter("operation");
		ArrayList<Location> cities = (ArrayList<Location>) facade.getAllCities();
		ArrayList<Purpose> purposes = (ArrayList<Purpose>) facade.getAllPurposetypes();
		HttpSession session = request.getSession(true);
		session.setAttribute("cities", cities);
		session.setAttribute("purposes", purposes);
		PrintWriter out = response.getWriter();
		boolean ajax = false;
		
		if (operation.equals("profile")) {
			String username = request.getParameter("username");
			FriendlyUser u = facade.findByUsername(username);
			
			if (u != null) {
				session.setAttribute("user", u);
				url = "/Profile.jsp";
			} else {
				url = "/Index.jsp";
			}
		} else if (operation.equals("index")) {			
			FriendlyUser u = new FriendlyUser();
			int day = Integer.parseInt(request.getParameter("day"));
			int month = Integer.parseInt(request.getParameter("month"));
			int year = Integer.parseInt(request.getParameter("year"));
			Date date = new Date((year - 1900), (month - 1), day);
			
			u.setUsername(request.getParameter("username"));
			u.setPassword(request.getParameter("password"));
			u.setFirstname(request.getParameter("firstName"));
			u.setLastname(request.getParameter("lastName"));
			u.setBirthdate(date);
			facade.createFriendlyUser(u);
			
			url = "/Index.jsp";
		} else if (operation.equals("updateLocations")) {
			String username = request.getParameter("uname");
			String city = request.getParameter("location");
			String purp = request.getParameter("purp");
			String toDate = request.getParameter("tDate");
			String fromDate = request.getParameter("fDate");	
			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		
			try {
				Date tDate = format.parse(toDate);
				Date fDate = format.parse(fromDate);
				FriendlyUserLocationPurpose ulp = new FriendlyUserLocationPurpose();
				FriendlyUser u = facade.findByUsername(username);
				Location location = facade.findByCity(city);
				Purpose purpose = facade.findByPurposetype(purp);
				
				if (u != null && location != null && purpose != null) {
					ulp.setFriendlyUser(u);
					ulp.setLocation(location);
					ulp.setPurpose(purpose);
					ulp.setToDate(tDate);
					ulp.setFromDate(fDate);
					try {
						facade.createUserLocationPurpose(ulp);
						
					} catch (Exception e){
						out.println("500");
					}
					ajax = true;					
				}
				
			} catch (ParseException e) {
				
			}
			
		} else {
			url = "/Index.jsp";
		}
		if (!ajax) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
	}
}
