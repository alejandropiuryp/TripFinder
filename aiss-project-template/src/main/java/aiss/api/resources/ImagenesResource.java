package aiss.api.resources;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.jboss.resteasy.spi.BadRequestException;

import aiss.model.repository.Imagen;
import aiss.model.repository.TripRepository.TripRepository;
import aiss.model.repository.TripRepository.TripRepositoryImplement;

@Path("/img")
public class ImagenesResource {
	
	public static ImagenesResource _instance = null;
	TripRepository repository;
	
	public ImagenesResource() {
		repository = TripRepositoryImplement.getInstance();
	}
	
	public static ImagenesResource getInstance() {
		if(_instance == null) {
			_instance = new ImagenesResource();
		}
		return _instance;
	}
	
	// Método que devuelve todas las imagenes
	@GET
	@Produces("application/json")
	public Collection<Imagen> getAllImagenes(){
		return repository.getAllImagenes();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Imagen getImagenesById(@PathParam("id") String id){
		Imagen img = repository.getImagenesById(id);
		if(img == null) {
			throw new BadRequestException("La imagen no existe");
		}
		return img;
	}

}
