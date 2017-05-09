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
@NamedQuery(name = "Purpose.getAllPurposetypes", query = "SELECT p from Purpose p")
@Table(name = "Purposes")
public class Purpose implements Serializable {

	private static final long serialVersionUID = 1L;
	private String purposeType;
	private List<FriendlyUserLocationPurpose> userLocationPurposes;

	@Id
	@Column(name = "Purposetype")
	public String getPurposeType() {
		return purposeType;
	}

	public void setPurposeType(String purposeType) {
		this.purposeType = purposeType;
	}

	@OneToMany(mappedBy = "purpose", fetch = FetchType.EAGER)
	public List<FriendlyUserLocationPurpose> getUserLocationPurposes() {
		return userLocationPurposes;
	}

	public void setUserLocationPurposes(List<FriendlyUserLocationPurpose> userLocationPurposes) {
		this.userLocationPurposes = userLocationPurposes;
	}
}