package aiss.model.repository;

public class Imagen {
	
	private String id;
	private String url;
	private String size;
	
	
	public Imagen() {}
	public Imagen(String id, String url, String size) {
		this.id = id;
		this.url = url;
		this.size = size;
	}
	public Imagen(String url, String size) {
		this.url = url;
		this.size = size;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	
}
