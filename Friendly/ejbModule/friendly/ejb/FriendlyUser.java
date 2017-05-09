package friendly.ejb;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "FriendlyUser.getAllFriendlyUsers", query = "SELECT u FROM FriendlyUser u")
@Table(name = "Users")
public class FriendlyUser implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private String firstname;
	private String lastname;
	private Date birthdate;
	private byte[] picture;
	private String profession;
	private String Password;
	private String about;
	private FieldOfProfession industry;
	private List<FriendlyUserLocationPurpose> userLocationPurposes;
	
	@Id
	@Column(name = "Username")
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "FirstName")
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name = "LastName")
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Column(name = "Birthdate")
	public Date getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	@Column(name = "Picture")
	public byte[] getPicture() {
		return picture;
	}
	
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
	@Column(name = "Profession")
	public String getProfession() {
		return profession;
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	@Column(name = "Password")
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	@Column(name = "About")
	public String getAbout() {
		return about;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	@ManyToOne
	@JoinColumn(name = "Industry", referencedColumnName = "Industry")
	public FieldOfProfession getIndustry() {
		return industry;
	}
	
	public void setIndustry(FieldOfProfession industry) {
		this.industry = industry;
	}
	
	@OneToMany(mappedBy = "friendlyUser", fetch = FetchType.EAGER)
	public List<FriendlyUserLocationPurpose> getUserLocationPurposes() {
		return userLocationPurposes;
	}
	
	public void setUserLocationPurposes(List<FriendlyUserLocationPurpose> userLocationPurposes) {
		this.userLocationPurposes = userLocationPurposes;
	}

}
