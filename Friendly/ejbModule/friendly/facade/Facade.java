package friendly.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import friendly.eao.FieldOfProfessionEAOLocal;
import friendly.eao.FriendlyUserEAOLocal;
import friendly.eao.LocationEAOLocal;
import friendly.eao.PurposeEAOLocal;
import friendly.eao.FriendlyUserLocationPurposeEAOLocal;
import friendly.ejb.FieldOfProfession;
import friendly.ejb.FriendlyUser;
import friendly.ejb.Location;
import friendly.ejb.Purpose;
import friendly.ejb.FriendlyUserLocationPurpose;
import friendly.ejb.FriendlyUserLocationPurposeKey;

@Stateless
public class Facade implements FacadeLocal {

	@EJB
	private FriendlyUserEAOLocal friendlyUserEAO;
	@EJB
	private FieldOfProfessionEAOLocal fieldOfProfessionEAO;
	@EJB
	private LocationEAOLocal locationEAO;
	@EJB
	private PurposeEAOLocal purposeEAO;
	@EJB
	private FriendlyUserLocationPurposeEAOLocal userLocationPurposeEAO;
    public Facade() {
    }

    public FriendlyUser findByUsername(String username) {
    	return friendlyUserEAO.findByUsername(username);
    }
    public FriendlyUser createFriendlyUser(FriendlyUser friendlyUser) {
    	return friendlyUserEAO.createFriendlyUser(friendlyUser);
    }
    public FriendlyUser updateFriendlyUser(FriendlyUser friendlyUser) {
    	return friendlyUserEAO.updateFriendlyUser(friendlyUser);
    }
    public void deleteFriendlyUser(String username) {
    	friendlyUserEAO.deleteFriendlyUser(username);
    }
    public List<FriendlyUser> getAllFriendlyUsers() {
    	return friendlyUserEAO.getAllFriendlyUsers();
    }
    
    public FieldOfProfession findByIndustry(String industry) {
    	return fieldOfProfessionEAO.findByIndustry(industry);
    }
    public FieldOfProfession createFieldOfProfession(FieldOfProfession fieldOfProfession) {
    	return fieldOfProfessionEAO.createFieldOfProfession(fieldOfProfession);
    }
    
    public FieldOfProfession updateFieldOfProfession(FieldOfProfession fieldOfProfession) {
    	return fieldOfProfessionEAO.updateFieldOfProfession(fieldOfProfession);
    }
    
    public void deleteFieldOfProfession(String industry) {
    	fieldOfProfessionEAO.deleteFieldOfProfession(industry);
    }
    
    public List<FieldOfProfession> getAllIndustries() {
    	return fieldOfProfessionEAO.getAllIndustries();
    }
    
    public Location createLocation(Location location) {
		return locationEAO.createLocation(location);
	}

	public Location findByCity(String city) {
		return locationEAO.findByCity(city);
	}

	public Location updateLocation(Location location) {
		return locationEAO.updateLocation(location);
	}

	public void deleteLocation(String city) {
		locationEAO.deleteLocation(city);
	}

	public List<Location> getAllCities() {
		return locationEAO.getAllCities();
	}
	
	public Purpose createPurpose(Purpose purpose) {
		return purposeEAO.createPurpose(purpose);
	}

	public Purpose findByPurposetype(String purposetype) {
		return purposeEAO.findByPurposetype(purposetype);
	}

	public Purpose updatePurpose(Purpose purpose) {
		return purposeEAO.updatePurpose(purpose);
	}

	public void deletePurpose(String purposetype) {
		purposeEAO.deletePurpose(purposetype);
	}

	public List<Purpose> getAllPurposetypes() {
		return purposeEAO.getAllPurposetypes();
	}
	
	public FriendlyUserLocationPurpose createUserLocationPurpose(FriendlyUserLocationPurpose friendlyUserLocationPurpose) {
		return userLocationPurposeEAO.createFriendlyUserLocationPurpose(friendlyUserLocationPurpose);
	}
	
	public FriendlyUserLocationPurpose findByUserLocationPurposeId(FriendlyUserLocationPurposeKey friendlyUserLocationPurposeKey) {
    	return userLocationPurposeEAO.findByFriendlyUserLocationPurposeKey(friendlyUserLocationPurposeKey);
    }
	
	public List<FriendlyUserLocationPurpose> getAllUserLocationPurposes() {
	    	return userLocationPurposeEAO.getAllUserLocationPurposes();
	}
	 
}
