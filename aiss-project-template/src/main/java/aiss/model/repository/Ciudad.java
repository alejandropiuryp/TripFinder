package aiss.model.repository;

import java.util.List;



public class Ciudad {
	
	private String id;
	private String nombre;
	private String pais;
	private List<Aereopuerto> aereopuertos;
	private List<Imagen> imagenes;
	
	public Ciudad() {}
	
	public Ciudad(String id, String nombre, String pais, List<Aereopuerto> aereopuertos, List<Imagen> imagenes) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.aereopuertos = aereopuertos;
		this.imagenes = imagenes;
	}
	
	public Ciudad(String nombre,String pais, List<Aereopuerto> aereopuertos, List<Imagen> imagenes) {
		this.nombre = nombre;
		this.pais = pais;
		this.aereopuertos = aereopuertos;
		this.imagenes = imagenes;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public List<Aereopuerto> getAereopuertos() {
		return aereopuertos;
	}
	public void setAereopuertos(List<Aereopuerto> aereopuertos) {
		this.aereopuertos = aereopuertos;
	}
	public List<Imagen> getImagenes() {
		return imagenes;
	}
	public void setImagenes(List<Imagen> imagenes) {
		this.imagenes = imagenes;
	}
	
	
	
}
