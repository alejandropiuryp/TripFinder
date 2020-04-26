
package aiss.model.TripAdvisor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "summary",
    "equipment",
    "amenities",
    "carriers",
    "providers",
    "airports",
    "air_watch_info",
    "disclaimers",
    "fly_score_info",
    "recommended_itins",
    "search_params"
})
public class FlightPoll {

    @JsonProperty("summary")
    private Summary summary;
    @JsonProperty("equipment")
    private List<Equipment> equipment = null;
    @JsonProperty("amenities")
    private List<Amenity> amenities = null;
    @JsonProperty("carriers")
    private List<Carrier> carriers = null;
    @JsonProperty("providers")
    private List<Provider> providers = null;
    @JsonProperty("airports")
    private List<Airport> airports = null;
    @JsonProperty("air_watch_info")
    private AirWatchInfo airWatchInfo;
    @JsonProperty("disclaimers")
    private List<Disclaimer> disclaimers = null;
    @JsonProperty("fly_score_info")
    private FlyScoreInfo flyScoreInfo;
    @JsonProperty("recommended_itins")
    private RecommendedItins recommendedItins;
    @JsonProperty("search_params")
    private SearchParams searchParams;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @JsonProperty("equipment")
    public List<Equipment> getEquipment() {
        return equipment;
    }

    @JsonProperty("equipment")
    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    @JsonProperty("amenities")
    public List<Amenity> getAmenities() {
        return amenities;
    }

    @JsonProperty("amenities")
    public void setAmenities(List<Amenity> amenities) {
        this.amenities = amenities;
    }

    @JsonProperty("carriers")
    public List<Carrier> getCarriers() {
        return carriers;
    }

    @JsonProperty("carriers")
    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

    @JsonProperty("providers")
    public List<Provider> getProviders() {
        return providers;
    }

    @JsonProperty("providers")
    public void setProviders(List<Provider> providers) {
        this.providers = providers;
    }

    @JsonProperty("airports")
    public List<Airport> getAirports() {
        return airports;
    }

    @JsonProperty("airports")
    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    @JsonProperty("air_watch_info")
    public AirWatchInfo getAirWatchInfo() {
        return airWatchInfo;
    }

    @JsonProperty("air_watch_info")
    public void setAirWatchInfo(AirWatchInfo airWatchInfo) {
        this.airWatchInfo = airWatchInfo;
    }

    @JsonProperty("disclaimers")
    public List<Disclaimer> getDisclaimers() {
        return disclaimers;
    }

    @JsonProperty("disclaimers")
    public void setDisclaimers(List<Disclaimer> disclaimers) {
        this.disclaimers = disclaimers;
    }

    @JsonProperty("fly_score_info")
    public FlyScoreInfo getFlyScoreInfo() {
        return flyScoreInfo;
    }

    @JsonProperty("fly_score_info")
    public void setFlyScoreInfo(FlyScoreInfo flyScoreInfo) {
        this.flyScoreInfo = flyScoreInfo;
    }

    @JsonProperty("recommended_itins")
    public RecommendedItins getRecommendedItins() {
        return recommendedItins;
    }

    @JsonProperty("recommended_itins")
    public void setRecommendedItins(RecommendedItins recommendedItins) {
        this.recommendedItins = recommendedItins;
    }

    @JsonProperty("search_params")
    public SearchParams getSearchParams() {
        return searchParams;
    }

    @JsonProperty("search_params")
    public void setSearchParams(SearchParams searchParams) {
        this.searchParams = searchParams;
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
