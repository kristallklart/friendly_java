package friendly.ejb;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@IdClass(FriendlyUserLocationPurposeKey.class)
@NamedQuery(name = "FriendlyUserLocationPurpose.getAllUserLocationPurposes", query = "SELECT ulp from FriendlyUserLocationPurpose ulp")
@Table(name = "User_Location_Purpose")
public class FriendlyUserLocationPurpose implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String city;
	private String purposeType;
	private Date fromDate;
	private Date toDate;
	
	private Purpose purpose;
	private Location location;
	private FriendlyUser friendlyUser;
	
	public FriendlyUserLocationPurpose() {	}
	
	public FriendlyUserLocationPurpose(Purpose purpose, Location location, FriendlyUser friendlyUser, Date fromDate, Date toDate) {
		this.purpose = purpose;
		this.location = location;
		this.friendlyUser = friendlyUser;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.username = friendlyUser.getUsername();
		this.city = location.getCity();
		this.purposeType = purpose.getPurposeType();
	}
	
	@Id
	@Column(name = "Username", insertable = false, updatable = false)
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Id
	@Column(name = "City", insertable = false, updatable = false)
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Id
	@Column(name = "Purposetype", insertable = false, updatable = false)
	public String getPurposeType() {
		return purposeType;
	}
	
	public void setPurposeType(String purposeType) {
		this.purposeType = purposeType;
	}
	
	@Id
	@Column(name = "FromDate")
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	
	@Id
	@Column(name = "ToDate")
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	@ManyToOne
	@JoinColumn(name = "Purposetype", referencedColumnName = "Purposetype")
	public Purpose getPurpose() {
		return purpose;
	}
	public void setPurpose(Purpose purpose) {
		this.purpose = purpose;
	}
	
	@ManyToOne
	@JoinColumn(name = "City", referencedColumnName = "City")
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	@ManyToOne
	@JoinColumn(name = "Username", referencedColumnName = "Username")
	public FriendlyUser getFriendlyUser() {
		return friendlyUser;
	}
	public void setFriendlyUser(FriendlyUser friendlyUser) {
		this.friendlyUser = friendlyUser;
	}

}