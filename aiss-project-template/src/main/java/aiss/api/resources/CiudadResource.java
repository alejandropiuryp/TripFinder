package aiss.api.resources;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.model.repository.Ciudad;
import aiss.model.repository.TripRepository.TripRepository;
import aiss.model.repository.TripRepository.TripRepositoryImplement;

@Path("/ciudad")
public class CiudadResource {
	public static CiudadResource _instance = null;
	TripRepository repository;
	
	public CiudadResource() {
		repository = TripRepositoryImplement.getInstance();
	}
	
	public static CiudadResource getInstance() {
		if(_instance == null) {
			_instance = new CiudadResource();
		}
		return _instance;
	}
	
	// Método que devuelve todas las ciudades
	@GET
	@Produces("application/json")
	public Collection<Ciudad> getAllCiudad(){
		return repository.getAllCiudad();
	}
	// Método que devuelve la ciudad buscada por su id
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Ciudad getCiudadByName(@PathParam("id") String id){
		Ciudad c = repository.getCiudadById(id);
		if(c == null) {
			throw new NotFoundException("No se encuentra ninguna ciudad");
		}
		return c;
	}
	// Método que añade una ciudad
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addCiudad(@Context UriInfo uriInfo, Ciudad ciudad) {
		
		if(ciudad.getNombre() == null || ciudad.getNombre() == "") {
			throw new BadRequestException("Ciudad  no valida");
		}
		repository.addCiudad(ciudad);
		
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path("/ciudad");
		URI uri = ub.build(ciudad.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(ciudad);
		return resp.build();
	}
	// Método para actualizar una ciudad
	@PUT
	@Consumes("application/json")
	public Response updateCiudad(Ciudad ciudad) {
		Ciudad oldCiudad = repository.getCiudadById(ciudad.getId());
		if(oldCiudad == null) {
			throw new NotFoundException("La ciudad con id=" + ciudad.getId() + " no fue encontrada");
		}else {
			repository.updateCiudad(ciudad);
		}
		return Response.noContent().build();
	}
	// Método para eliminar una ciudad
	@DELETE
	@Path("/{id}")
	public Response removeCiudad(@PathParam("id") String id) {
		Ciudad ciudad = repository.getCiudadById(id);
		if(ciudad == null) {
			throw new NotFoundException("La ciudad con id=" + id + " no fue encontrada");
		}else {
			repository.deleteCiudad(id);
		}
		return Response.noContent().build();
	}
	
}
