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
@NamedQuery(name = "FieldOfProfession.getAllIndustries", query = "SELECT i from FieldOfProfession i")
@Table(name = "FieldOfProfessions")
public class FieldOfProfession implements Serializable {

	private static final long serialVersionUID = 1L;
	private String industry;
	private List<FriendlyUser> friendlyUsers;
	
	@Id
	@Column(name = "Industry")
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	
	@OneToMany(mappedBy = "industry", fetch = FetchType.EAGER)
	public List<FriendlyUser> getFriendlyUsers() {
		return friendlyUsers;
	}
	public void setFriendlyUsers(List<FriendlyUser> friendlyUsers) {
		this.friendlyUsers = friendlyUsers;
	}
	
}
