package friendly.eao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import friendly.ejb.FriendlyUser;

@Stateless
public class FriendlyUserEAO implements FriendlyUserEAOLocal {

	@PersistenceContext(unitName = "FriendlyEJBSql")
	private EntityManager em;
    public FriendlyUserEAO() {
        
    }
    
    public FriendlyUser findByUsername(String username) {
		return em.find(FriendlyUser.class, username);
	}
    public FriendlyUser createFriendlyUser(FriendlyUser friendlyUser) {
    	em.persist(friendlyUser);
    	return friendlyUser;
    }
    
    public FriendlyUser updateFriendlyUser(FriendlyUser friendlyUser) {
    	em.merge(friendlyUser);
    	return friendlyUser;
    }
    
    public void deleteFriendlyUser(String username) {
    	FriendlyUser u = findByUsername(username);
    	if (u != null) {
    		em.remove(u);
    	}
    }
    public List<FriendlyUser> getAllFriendlyUsers() {
    	TypedQuery<FriendlyUser> query = em.createNamedQuery("FriendlyUser.getAllFriendlyUsers", FriendlyUser.class);
    	List<FriendlyUser> result = query.getResultList();
    	return result;
    }
}
