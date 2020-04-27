package aiss.model.repository;

public class Aereopuerto {
	private String code;
	private String name;
	private String cityName;
	
	public Aereopuerto() {}
	public Aereopuerto(String code, String name, String cityName) {
		this.code = code;
		this.name = name;
		this.cityName = cityName;
	}
	
	public Aereopuerto(String name, String cityName) {
		this.name = name;
		this.cityName = cityName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
