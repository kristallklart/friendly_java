package friendly.eao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import friendly.ejb.Purpose;

@Stateless
public class PurposeEAO implements PurposeEAOLocal {

	@PersistenceContext(unitName = "FriendlyEJBSql")
	private EntityManager em;
    public PurposeEAO() {
    }

	public Purpose createPurpose(Purpose purpose) {
		em.persist(purpose);
		return purpose;
	}

	public Purpose findByPurposetype(String purposetype) {
		return em.find(Purpose.class, purposetype);
	}

	public Purpose updatePurpose(Purpose purpose) {
		em.merge(purpose);
		return purpose;
	}

	public void deletePurpose(String purposetype) {
		Purpose p = findByPurposetype(purposetype);
		if (p != null) {
			em.remove(p);
		}
	}

	public List<Purpose> getAllPurposetypes() {
		TypedQuery<Purpose> query = em.createNamedQuery("Purpose.getAllPurposetypes", Purpose.class);
		List<Purpose> result = query.getResultList();
		return result;
	}
}
