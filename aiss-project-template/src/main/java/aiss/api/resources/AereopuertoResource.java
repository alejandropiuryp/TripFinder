package aiss.api.resources;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.model.repository.Aereopuerto;
import aiss.model.repository.TripRepository.TripRepository;
import aiss.model.repository.TripRepository.TripRepositoryImplement;

@Path("/aereopuertos")
public class AereopuertoResource {
	public static AereopuertoResource _instance = null;
	
	TripRepository repository;
	
	public AereopuertoResource() {
		repository = TripRepositoryImplement.getInstance();
	}
	
	public static AereopuertoResource getInstance() {
		if(_instance == null) {
			_instance = new AereopuertoResource();
		}
		return _instance;
	}
	
	// Método que devuelve todos los aereopuertos
	@GET
	@Produces("application/json")
	public Collection<Aereopuerto> getAllAereopuertos(){
		return repository.getAllAereopuertos();
	}
	
	// Método que devuelve todos los aereopuertos de una ciudad dada
	@GET
	@Path("/ciudad")
	@Produces("application/json")
	public Collection<Aereopuerto> getAereopuertoByCityName(@QueryParam("ciudad") String ciudad){
		Collection<Aereopuerto> result = repository.getAereopuertoByCityName(ciudad);
		if(result == null) {
			throw new NotFoundException("No se encuentra ningún aereopuerto.");
		}
		return result;
	}
	
	// Método que devuelve el aereopuerto dado el nombre del mismo.
	@GET
	@Path("/nombre")
	@Produces("application/json")
	public Aereopuerto getAereopuertoByName(@QueryParam("nombre")String nombre) {
		Aereopuerto aereopuerto = repository.getAereopuertoByName(nombre);
		if(aereopuerto == null) {
			throw new BadRequestException("El aereopuerto no existe");
		}
		return aereopuerto;
	}
	
	// Método que devuelve el aereopuerto dado el codigo del mismo.
	@GET
	@Path("/{codigo}")
	@Produces("application/json")
	public Aereopuerto getAereopuertoByCode(@PathParam("codigo")String codigo) {
		Aereopuerto aereopuerto = repository.getAereopuertoByCode(codigo);
		if(aereopuerto == null) {
			throw new BadRequestException("El aereopuerto no existe");
		}
		return aereopuerto;
	}
}
