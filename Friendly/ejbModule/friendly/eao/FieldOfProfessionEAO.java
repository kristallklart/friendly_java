package friendly.eao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import friendly.ejb.FieldOfProfession;

@Stateless
public class FieldOfProfessionEAO implements FieldOfProfessionEAOLocal {

	@PersistenceContext(unitName = "FriendlyEJBSql")
	private EntityManager em;
    public FieldOfProfessionEAO() {
    }
    
    public FieldOfProfession findByIndustry(String industry) {
    	return em.find(FieldOfProfession.class, industry);
    }
    
    public FieldOfProfession createFieldOfProfession(FieldOfProfession fieldOfProfession) {
    	em.persist(fieldOfProfession);
    	return fieldOfProfession;
    }
    
    public FieldOfProfession updateFieldOfProfession(FieldOfProfession fieldOfProfession) {
    	em.merge(fieldOfProfession);
    	return fieldOfProfession;
    }
    
    public void deleteFieldOfProfession(String industry) {
    	FieldOfProfession f = findByIndustry(industry);
    	if (f != null) {
    		em.remove(f);
    	}
    }
    
    public List<FieldOfProfession> getAllIndustries() {
    	TypedQuery<FieldOfProfession> query = em.createNamedQuery("FieldOfProfession.getAllIndustries", FieldOfProfession.class);
    	List<FieldOfProfession> result = query.getResultList();
    	return result;
    }
}
