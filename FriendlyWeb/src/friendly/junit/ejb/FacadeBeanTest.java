package friendly.junit.ejb;

import javax.naming.Context;
import javax.naming.InitialContext;

import friendly.facade.FacadeLocal;
import junit.framework.TestCase;

public class FacadeBeanTest extends TestCase {
	
	FacadeLocal facade;

	public FacadeBeanTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		Context context = new InitialContext();
		facade=(FacadeLocal)context.lookup("java:app/Friendly/Facade!friendly.facade.FacadeLocal"); 
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		facade = null;
	}
	
	public void testFacadeMethods() throws Exception{
		String city = "Stockholm";
		assertEquals(facade.findByCity(city).getCity(),"Stockholm");
	
	}

}
