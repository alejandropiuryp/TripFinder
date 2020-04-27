package aiss.api.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class TripFinderApplication extends Application {
	private Set<Object> items = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();
	
	public TripFinderApplication() {
		items.add(AereopuertoResource.getInstance());
		items.add(ImagenesResource.getInstance());
		items.add(CiudadResource.getInstance());
		items.add(CiudadesResource.getInstance());
	}
	
	public Set<Class<?>> getClasses() {
		return classes;
	}

	public Set<Object> getSingletons() {
		return items;
	}
}
