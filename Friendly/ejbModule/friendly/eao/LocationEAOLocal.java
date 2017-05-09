package friendly.eao;

import java.util.List;

import javax.ejb.Local;

import friendly.ejb.Location;

@Local
public interface LocationEAOLocal {

    public Location createLocation(Location location);

	public Location findByCity(String city);

	public Location updateLocation(Location location);

	public void deleteLocation(String city);

	public List<Location> getAllCities();
}
