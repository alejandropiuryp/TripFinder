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
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;
import org.restlet.resource.Delete;

import aiss.model.repository.Ciudad;
import aiss.model.repository.Ciudades;
import aiss.model.repository.TripRepository.TripRepository;
import aiss.model.repository.TripRepository.TripRepositoryImplement;

@Path("/lists")
public class CiudadesResource {
	
	public static CiudadesResource _instance = null;
	TripRepository repository;
	
	public CiudadesResource() {
		repository = TripRepositoryImplement.getInstance();
	}
	
	public static CiudadesResource getInstance() {
		if(_instance == null) {
			_instance = new CiudadesResource();
		}
		return _instance;
	}
	
	// Método que devuelve todas las listas de ciudades
	@GET
	@Produces("application/json")
	public Collection<Ciudades> getAllLists(){
		return repository.getAllCiudades();
	}
	// Método que devuelve  la listas dada su id
	@GET
	@Path("{id}")
	@Produces("application/json")
	public Ciudades getCiudadesById(@PathParam("id") String id) {
		Ciudades list = repository.getCiudadesById(id);
		if(list == null) {
			throw new NotFoundException("La lista con id=" + id + " no fue encontrada");
		}
		return list;
	}
	// Método que añade una lista de ciudades
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addList(@Context UriInfo uriInfo, Ciudades lista) {
		if(lista.getTitulo() == null || "".equals(lista.getTitulo())) {
			throw new BadRequestException("El título de la lista no debe ser nulo");
		}
		if(lista.getCiudades() != null) {
			throw new BadRequestException("La lista de ciudades no está vacía");
		}
		repository.addCiudades(lista);
		
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path("/lists");
		URI uri = ub.build(lista.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(lista);
		return resp.build();
	}
	// Método que actualiza una lista de ciudades
	@PUT
	@Consumes("application/json")
	public Response updateCiudades(Ciudades ciudades) {
		Ciudades list = repository.getCiudadesById(ciudades.getId());
		if(list == null) {
			throw new NotFoundException("La lista de ciudades"+ ciudades.getId() +" no fue encontrada");	
		}
		repository.updateCiudades(ciudades);
		return Response.noContent().build();
	}
	// Método para eliminar una lista de ciudades
	@DELETE
	@Path("/{id}")
	public Response removeCiudades(@PathParam("id") String id) {
		Ciudades list = repository.getCiudadesById(id);
		if(list == null) {
			throw new NotFoundException("La lista de ciudades"+ list.getId() +" no fue encontrada");
		}else {
			repository.deleteCiudades(id);
		}
		return Response.noContent().build();
	}
	// Método para añadir una ciudad a una lista
	@POST	
	@Path("/{listId}/{ciudadId}")
	@Consumes("text/plain")
	@Produces("application/json")
	public Response addCiudad(@Context UriInfo uriInfo,@PathParam("listId") String listId,@PathParam("ciudadId") String ciudadId) {
		Ciudades list = repository.getCiudadesById(listId);
		Ciudad ciudad = repository.getCiudadById(ciudadId);
		if(list == null) {
			throw new NotFoundException("La lista de ciudades"+ listId +" no fue encontrada");	
		}
		if(ciudad == null) {
			throw new NotFoundException("La ciudad con id=" + ciudadId + " no fue encontrada");
		}
		if(list.getCiudad(ciudadId) != null) {
			throw new BadRequestException("La ciudad ya está incluida en la lista");
		}
		repository.addCiudad(listId, ciudadId);
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path("/lists");
		URI uri = ub.build(listId);
		ResponseBuilder resp = Response.created(uri);
		resp.entity(list);
		return resp.build();
	}
	// Método para eliminar una ciudad de la lista
	@DELETE
	@Path("/{listId}/{ciudadId}")
	public Response removeCiudad(@PathParam("listId") String listId,@PathParam("ciudadId") String ciudadId) {
		Ciudades list = repository.getCiudadesById(listId);
		Ciudad ciudad = repository.getCiudadById(ciudadId);
		if(list == null) {
			throw new NotFoundException("La lista de ciudades"+ listId +" no fue encontrada");	
		}
		if(ciudad == null) {
			throw new NotFoundException("La ciudad con id=" + ciudadId + " no fue encontrada");
		}
		repository.removeCiudad(listId, ciudadId);
		return Response.noContent().build();
	}
	
}
