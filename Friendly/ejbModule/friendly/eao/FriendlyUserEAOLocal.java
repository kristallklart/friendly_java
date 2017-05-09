package friendly.eao;

import java.util.List;

import javax.ejb.Local;

import friendly.ejb.FriendlyUser;

@Local
public interface FriendlyUserEAOLocal {

	public FriendlyUser findByUsername(String username);
	
	public FriendlyUser createFriendlyUser(FriendlyUser friendlyUser);
	
	public FriendlyUser updateFriendlyUser(FriendlyUser friendlyUser);
	
	public void deleteFriendlyUser(String username);
	
	public List<FriendlyUser> getAllFriendlyUsers();
}
