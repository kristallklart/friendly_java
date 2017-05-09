package friendly.eao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import friendly.ejb.FriendlyUserLocationPurpose;
import friendly.ejb.FriendlyUserLocationPurposeKey;

@Stateless
public class FriendlyUserLocationPurposeEAO implements FriendlyUserLocationPurposeEAOLocal {

	@PersistenceContext(unitName = "FriendlyEJBSql")
	private EntityManager em;
    public FriendlyUserLocationPurposeEAO() {
    }
    
    public FriendlyUserLocationPurpose createFriendlyUserLocationPurpose(FriendlyUserLocationPurpose userLocationPurpose) {
		em.persist(userLocationPurpose);
		return userLocationPurpose;
	}
    
    public FriendlyUserLocationPurpose findByFriendlyUserLocationPurposeKey(FriendlyUserLocationPurposeKey userLocationPurposeKey) {
    	return em.find(FriendlyUserLocationPurpose.class, userLocationPurposeKey);
    }
    
    public List<FriendlyUserLocationPurpose> getAllUserLocationPurposes() {
    	TypedQuery<FriendlyUserLocationPurpose> query = em.createNamedQuery("FriendlyUserLocationPurpose.getAllUserLocationPurposes", FriendlyUserLocationPurpose.class);
    	List<FriendlyUserLocationPurpose> result = query.getResultList();
    	return result;
    }


}
