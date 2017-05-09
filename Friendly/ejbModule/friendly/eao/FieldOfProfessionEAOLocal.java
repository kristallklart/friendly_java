package friendly.eao;

import java.util.List;

import javax.ejb.Local;

import friendly.ejb.FieldOfProfession;

@Local
public interface FieldOfProfessionEAOLocal {
	
	public FieldOfProfession findByIndustry(String industry);

    public FieldOfProfession createFieldOfProfession(FieldOfProfession fieldOfProfession);
    
    public FieldOfProfession updateFieldOfProfession(FieldOfProfession fieldOfProfession);
    
    public void deleteFieldOfProfession(String industry);
    
    public List<FieldOfProfession> getAllIndustries();
}
