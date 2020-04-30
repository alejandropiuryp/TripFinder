package aiss.model.repository.TripRepository;

import java.util.Collection;

import aiss.model.repository.Aereopuerto;
import aiss.model.repository.Ciudad;
import aiss.model.repository.Ciudades;
import aiss.model.repository.Imagen;

public interface TripRepository {

	//Aereopuerto
	public Collection<Aereopuerto> getAllAereopuertos();
	public Collection<Aereopuerto> getAereopuertoByCityName(String ciudad);
	public Aereopuerto getAereopuertoByName(String name);
	public Aereopuerto getAereopuertoByCode(String code);
	
	//Imagen
	public Collection<Imagen> getAllImagenes();
	public Imagen getImagenesById(String id);
	
	//Ciudad
	public Collection<Ciudad> getAllCiudad();
	public Ciudad getCiudadById(String id);
	public void addCiudad(Ciudad ciudad);
	public void updateCiudad(Ciudad ciudad);
	public void deleteCiudad(String id);
	
	//Lista de Ciudad (Ciudades)
	public Collection<Ciudades> getAllCiudades();
	public Ciudades getCiudadesById(String ciudadesId);
	public void addCiudades(Ciudades c);
	public void updateCiudades(Ciudades c);
	public void deleteCiudades(String ciudadesId);
	public Collection<Ciudad> getAll(String ciudadesId);
	public void addCiudad(String ciudadesId,String idCiudad);
	public void removeCiudad(String ciudadesId, String idCiudad);
}
