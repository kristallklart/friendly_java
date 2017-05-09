package friendly.ejb;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQuery(name = "Location.getAllCities", query = "SELECT l from Location l")
@Table(name = "Locations")
public class Location implements Serializable {

	private static final long serialVersionUID = 1L;
	private String city;
	private List<FriendlyUserLocationPurpose> userLocationPurposes;

	@Id
	@Column(name = "City")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@OneToMany(mappedBy = "location", fetch = FetchType.EAGER)
	public List<FriendlyUserLocationPurpose> getUserLocationPurposes() {
		return userLocationPurposes;
	}

	public void setUserLocationPurposes(List<FriendlyUserLocationPurpose> userLocationPurposes) {
		this.userLocationPurposes = userLocationPurposes;
	}

}