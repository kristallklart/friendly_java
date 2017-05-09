package friendly.eao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import friendly.ejb.Location;

@Stateless
public class LocationEAO implements LocationEAOLocal {

	@PersistenceContext(unitName = "FriendlyEJBSql")
	private EntityManager em;
    public LocationEAO() {
    }
    
    public Location createLocation(Location location) {
		em.persist(location);
		return location;
	}

	public Location findByCity(String city) {
		return em.find(Location.class, city);
	}

	public Location updateLocation(Location location) {
		em.merge(location);
		return location;
	}

	public void deleteLocation(String city) {
		Location l = findByCity(city);
		if (l != null) {
			em.remove(l);
		}
	}

	public List<Location> getAllCities() {
		TypedQuery<Location> query = em.createNamedQuery("Location.getAllCities", Location.class);
		List<Location> result = query.getResultList();
		return result;
	}

}
