package aiss.model.repository;

import java.util.ArrayList;
import java.util.List;

public class Ciudades {
	
	private String id;
	private String titulo;
	private List<Ciudad> ciudades;
	public Ciudades() {}
	
	public Ciudades(String titulo) {
		this.titulo = titulo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Ciudad> getCiudades() {
		return ciudades;
	}
	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
	public Ciudad getCiudad(String idCiudad) {
		if(ciudades == null) {
			return null;
		}
		Ciudad ciudad = null;
		for(Ciudad c: ciudades) {
			if(c.getId().equals(idCiudad)) {
				ciudad = c;
				break;
			}
		}
		return ciudad;
	}
	
	public void addCiudad(Ciudad c) {
		if(ciudades == null) {
			ciudades = new ArrayList<Ciudad>();
		}
		ciudades.add(c);
	}
	
	public void deleteCiudad(Ciudad c) {
		ciudades.remove(c);
	}
	
	public void deleteCiudad(String idCiudad) {
		Ciudad c = getCiudad(idCiudad);
		if(c != null) {
			ciudades.remove(c);
		}
	}
}
