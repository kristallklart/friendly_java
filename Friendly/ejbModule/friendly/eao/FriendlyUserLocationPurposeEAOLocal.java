package friendly.eao;

import java.util.List;

import javax.ejb.Local;

import friendly.ejb.FriendlyUserLocationPurpose;
import friendly.ejb.FriendlyUserLocationPurposeKey;

@Local
public interface FriendlyUserLocationPurposeEAOLocal {

	 public FriendlyUserLocationPurpose createFriendlyUserLocationPurpose(FriendlyUserLocationPurpose userLocationPurpose);
	 
	 public FriendlyUserLocationPurpose findByFriendlyUserLocationPurposeKey(FriendlyUserLocationPurposeKey userLocationPurposeKey);
	 
	 public List<FriendlyUserLocationPurpose> getAllUserLocationPurposes();
}
