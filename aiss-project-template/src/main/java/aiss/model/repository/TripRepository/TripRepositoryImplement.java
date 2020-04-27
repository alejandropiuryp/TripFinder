package aiss.model.repository.TripRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import aiss.model.repository.Aereopuerto;
import aiss.model.repository.Ciudad;
import aiss.model.repository.Ciudades;
import aiss.model.repository.Imagen;

public class TripRepositoryImplement implements TripRepository{
	
	Map<String, Ciudades> ciudadesMap;
	Map<String, Ciudad> ciudadMap;
	private static TripRepositoryImplement instance = null;
	private int index=0;
	
	public static TripRepositoryImplement getInstance() {
		if(instance==null) {
			instance = new TripRepositoryImplement();
			instance.init();
		}
		return instance;
	}
	
	public void init() {
		ciudadesMap = new HashMap<String, Ciudades>();
		ciudadMap = new HashMap<String, Ciudad>();
		// Create Aereopuertos
		Aereopuerto madrid1 = new Aereopuerto("1", "Barajas Adolfo Suárez", "Madrid");
		Aereopuerto madrid2 = new Aereopuerto("2", "Cuatro Vientos (LECU)", "Madrid");
		Aereopuerto sevilla1 = new Aereopuerto("3", "San Pablo", "Sevilla");
		Aereopuerto barcelona1 = new Aereopuerto("4", "Aeropuerto El Prat de Llobregat", "Barcelona");
		Aereopuerto barcelona2 = new Aereopuerto("5", "Aeropuerto de Girona", "Barcelona");
		Aereopuerto paris1 = new Aereopuerto("6", "Aeropuerto Charles de Gaulle", "París");
		Aereopuerto paris2 = new Aereopuerto("7", "Aeropuerto de Orly", "París");
		Aereopuerto paris3 = new Aereopuerto("8", "Aeropuerto de Beauvais – Tillé", "París");
		Aereopuerto jerez1 = new Aereopuerto("9", "Aeropuerto de Jerez", "Jerez");
		List<Aereopuerto> aeMadrid = new ArrayList<>();
		aeMadrid.add(madrid1);
		aeMadrid.add(madrid2);
		List<Aereopuerto> aeSevilla = new ArrayList<>();
		aeSevilla.add(sevilla1);
		List<Aereopuerto> aeBarcelona = new ArrayList<>();
		aeBarcelona.add(barcelona1);
		aeBarcelona.add(barcelona2);
		List<Aereopuerto> aeParis = new ArrayList<>();
		aeParis.add(paris1);
		aeParis.add(paris2);
		aeParis.add(paris3);
		List<Aereopuerto> aeJerez = new ArrayList<>();
		aeJerez.add(jerez1);
		
		// Create Imagenes
		Imagen imMadrid1 = new Imagen("1","https://tmblr.co/Z1eLXs2iHlFfd", "560x600");
		Imagen imMadrid2 = new Imagen("2","https://tmblr.co/ZVR4gX2lblwdK", "1080x920");
		Imagen imSevilla1 = new Imagen("3","https://tmblr.co/Z1eLXs2VEm2M-", "1080x920");
		Imagen imBarcelona1 = new Imagen("4","https://tmblr.co/Z1eLXs2Yh8X7R", "1080x920");
		Imagen imBarcelona2 = new Imagen("5","https://tmblr.co/Z1eLXs2Wzb4Ur", "1080x920");
		Imagen imparis1 = new Imagen("6","https://tmblr.co/Zx1w4XY75c4WmW00", "1080x920");
		Imagen imjerez1 = new Imagen("7","https://jr-pictures.tumblr.com/image/158852277194", "1080x920");
		List<Imagen> imaMadrid = new ArrayList<>();
		imaMadrid.add(imMadrid1);
		imaMadrid.add(imMadrid2);
		List<Imagen> imaSevilla = new ArrayList<>();
		imaSevilla.add(imSevilla1);
		List<Imagen> imaBarcelona = new ArrayList<>();
		imaBarcelona.add(imBarcelona1);
		imaBarcelona.add(imBarcelona2);
		List<Imagen> imaParis = new ArrayList<>();
		imaParis.add(imparis1);
		List<Imagen> imaJerez = new ArrayList<>();
		imaJerez.add(imjerez1);
		
		// Create Ciudad
		Ciudad madrid = new Ciudad("Madrid", "España", aeMadrid, imaMadrid);
		addCiudad(madrid);
		Ciudad sevilla = new Ciudad("Sevilla", "España", aeSevilla, imaSevilla);
		addCiudad(sevilla);
		Ciudad barcelona = new Ciudad("Barcelona", "España", aeBarcelona, imaBarcelona);
		addCiudad(barcelona);
		Ciudad paris = new Ciudad("Paris", "Francia", aeParis, imaParis);
		addCiudad(paris);
		Ciudad jerez = new Ciudad("Jerez", "España", aeJerez, imaJerez);
		addCiudad(jerez);
		
		// Create Ciudades
		Ciudades ciudadesEspana = new Ciudades("Ciudades en España");
		addCiudades(ciudadesEspana);
		Ciudades mejoresCiudades = new Ciudades("Ciudades a visitar");
		addCiudades(mejoresCiudades);
		
		//Add ciudad a ciudades
		addCiudad(ciudadesEspana.getId(), madrid.getId());
		addCiudad(ciudadesEspana.getId(), sevilla.getId());
		addCiudad(ciudadesEspana.getId(), barcelona.getId());
		addCiudad(ciudadesEspana.getId(), jerez.getId());
		
		addCiudad(mejoresCiudades.getId(), madrid.getId());
		addCiudad(mejoresCiudades.getId(), sevilla.getId());
		addCiudad(mejoresCiudades.getId(), barcelona.getId());
		addCiudad(mejoresCiudades.getId(), paris.getId());
	}
	//Aereopuertos ================================================================================================
	@Override
	public Collection<Aereopuerto> getAllAereopuertos() {
		// TODO Auto-generated method stub
		Collection<Aereopuerto> aereopuertos = new HashSet<Aereopuerto>();
		for(Ciudad c: getAllCiudad()) {
			aereopuertos.addAll(c.getAereopuertos());
		}
		return aereopuertos;
	}

	@Override
	public Collection<Aereopuerto> getAereopuertoByCityName(String ciudad) {
		// TODO Auto-generated method stub
		Collection<Aereopuerto> aereopuertos = new HashSet<Aereopuerto>();
		Collection<Ciudad> ciudades = getAllCiudad();
		for(Ciudad c : ciudades) {
			if(c.getNombre().toLowerCase().equals(ciudad.toLowerCase())) {
				aereopuertos.addAll(c.getAereopuertos());
				break;
			}
		}
		return aereopuertos;
	}

	@Override
	public Aereopuerto getAereopuertoByName(String name) {
		// TODO Auto-generated method stub
		Aereopuerto result = null;
		for(Aereopuerto a : getAllAereopuertos()) {
			if(a.getName().toLowerCase().equals(name.toLowerCase())) {
				result = a;
				break;
			}
		}
		return result;
	}

	@Override
	public Aereopuerto getAereopuertoByCode(String code) {
		// TODO Auto-generated method stub
		Aereopuerto result = null;
		for(Aereopuerto a : getAllAereopuertos()) {
			if(a.getCode().equals(code)) {
				result = a;
				break;
			}
		}
		return result;
	}
	
	//Imagenes ================================================================================================
	@Override
	public Collection<Imagen> getAllImagenes() {
		// TODO Auto-generated method stub
		Collection<Imagen> imagenes = new HashSet<Imagen>();
		for(Ciudad c: getAllCiudad()) {
			imagenes.addAll(c.getImagenes());
		}
		return imagenes;
	}

	@Override
	public Imagen getImagenesById(String id) {
		// TODO Auto-generated method stub
		Imagen result = null;
		for(Imagen i : getAllImagenes()) {
			if(i.getId().equals(id)) {
				result = i;
				break;
			}
		}
		return result;
	}
    //Ciudad ================================================================================================
	@Override
	public Collection<Ciudad> getAllCiudad() {
		// TODO Auto-generated method stub
		return ciudadMap.values();
	}
	@Override
	public Ciudad getCiudadById(String id) {
		return ciudadMap.get(id);
	}
	@Override
	public void addCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		String id = "c" + index++;
		ciudad.setId(id);
		ciudadMap.put(id, ciudad);
	}

	@Override
	public void updateCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		Ciudad c = ciudadMap.get(ciudad.getId());
		c.setNombre(ciudad.getNombre());
		c.setPais(ciudad.getPais());
		c.setImagenes(ciudad.getImagenes());
		c.setAereopuertos(ciudad.getAereopuertos());
	}

	@Override
	public void deleteCiudad(String id) {
		// TODO Auto-generated method stub
		ciudadMap.remove(id);
	}
	
    //Ciudades ================================================================================================
	@Override
	public Collection<Ciudades> getAllCiudades() {
		// TODO Auto-generated method stub
		return ciudadesMap.values();
	}

	@Override
	public Ciudades getCiudadesById(String ciudadesId) {
		// TODO Auto-generated method stub
		return ciudadesMap.get(ciudadesId);
	}

	@Override
	public void addCiudades(Ciudades c) {
		// TODO Auto-generated method stub
		String id = "ciudades" + index++;
		c.setId(id);
		ciudadesMap.put(id, c);
	}

	@Override
	public void updateCiudades(Ciudades c) {
		// TODO Auto-generated method stub
		ciudadesMap.put(c.getId(), c);
	}

	@Override
	public void deleteCiudades(String ciudadesId) {
		// TODO Auto-generated method stub
		ciudadesMap.remove(ciudadesId);
	}
	
	@Override
	public Collection<Ciudad> getAll(String ciudadesId) {
		// TODO Auto-generated method stub
		return getCiudadesById(ciudadesId).getCiudades();
	}

	@Override
	public void addCiudad(String ciudadesId, String idCiudad) {
		// TODO Auto-generated method stub
		Ciudades ciudades = getCiudadesById(ciudadesId);
		ciudades.addCiudad(ciudadMap.get(idCiudad));
	}

	@Override
	public void removeCiudad(String ciudadesId, String idCiudad) {
		// TODO Auto-generated method stub
		getCiudadesById(ciudadesId).deleteCiudad(idCiudad);
	}

}
