
package aiss.model.TripAdvisor;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "country_code",
    "name",
    "city_name",
    "state",
    "display_name",
    "display_title",
    "display_sub_title",
    "location_id",
    "time_zone_name",
    "latitude",
    "longitude",
    "parent_code"
})
public class AirportSearch {

    @JsonProperty("code")
    private String code;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("state")
    private String state;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("display_title")
    private String displayTitle;
    @JsonProperty("display_sub_title")
    private String displaySubTitle;
    @JsonProperty("location_id")
    private Integer locationId;
    @JsonProperty("time_zone_name")
    private String timeZoneName;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("parent_code")
    private String parentCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("display_title")
    public String getDisplayTitle() {
        return displayTitle;
    }

    @JsonProperty("display_title")
    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    @JsonProperty("display_sub_title")
    public String getDisplaySubTitle() {
        return displaySubTitle;
    }

    @JsonProperty("display_sub_title")
    public void setDisplaySubTitle(String displaySubTitle) {
        this.displaySubTitle = displaySubTitle;
    }

    @JsonProperty("location_id")
    public Integer getLocationId() {
        return locationId;
    }

    @JsonProperty("location_id")
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @JsonProperty("time_zone_name")
    public String getTimeZoneName() {
        return timeZoneName;
    }

    @JsonProperty("time_zone_name")
    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("parent_code")
    public String getParentCode() {
        return parentCode;
    }

    @JsonProperty("parent_code")
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    	
    

}
