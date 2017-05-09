package friendly.facade;

import java.util.List;

import javax.ejb.Local;

import friendly.ejb.FieldOfProfession;
import friendly.ejb.FriendlyUser;
import friendly.ejb.Location;
import friendly.ejb.Purpose;
import friendly.ejb.FriendlyUserLocationPurpose;
import friendly.ejb.FriendlyUserLocationPurposeKey;

@Local
public interface FacadeLocal {

	public FriendlyUser findByUsername(String username);
	
	public FriendlyUser createFriendlyUser(FriendlyUser friendlyUser);
	
	public FriendlyUser updateFriendlyUser(FriendlyUser friendlyUser);
	
	public void deleteFriendlyUser(String username);
	
	public List<FriendlyUser> getAllFriendlyUsers();
	
	public FieldOfProfession findByIndustry(String industry);
	
	public FieldOfProfession createFieldOfProfession(FieldOfProfession fieldOfProfession);
	
	public FieldOfProfession updateFieldOfProfession(FieldOfProfession fieldOfProfession);
	
	public void deleteFieldOfProfession(String industry);
	
	public List<FieldOfProfession> getAllIndustries();
	
	public Location createLocation(Location location);

	public Location findByCity(String city);

	public Location updateLocation(Location location);

	public void deleteLocation(String city);

	public List<Location> getAllCities();
	
	public Purpose createPurpose(Purpose purpose);

	public Purpose findByPurposetype(String purposetype);

	public Purpose updatePurpose(Purpose purpose);

	public void deletePurpose(String purposetype);

	public List<Purpose> getAllPurposetypes();
	
	public FriendlyUserLocationPurpose createUserLocationPurpose(FriendlyUserLocationPurpose friendlyUserLocationPurpose);
	 
	public FriendlyUserLocationPurpose findByUserLocationPurposeId(FriendlyUserLocationPurposeKey friendlyUserLocationPurposeKey);

	public List<FriendlyUserLocationPurpose> getAllUserLocationPurposes();
}

