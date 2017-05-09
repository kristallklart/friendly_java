package friendly.eao;

import java.util.List;

import javax.ejb.Local;

import friendly.ejb.Purpose;

@Local
public interface PurposeEAOLocal {

	public Purpose createPurpose(Purpose purpose);

	public Purpose findByPurposetype(String purposetype);

	public Purpose updatePurpose(Purpose purpose);

	public void deletePurpose(String purposetype);

	public List<Purpose> getAllPurposetypes();
}
