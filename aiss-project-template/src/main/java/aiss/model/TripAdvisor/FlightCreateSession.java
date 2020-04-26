
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
    "carriers",
    "airports",
    "error",
    "air_watch_info",
    "disclaimers",
    "search_url",
    "fly_score_info",
    "search_params"
})
public class FlightCreateSession {

    @JsonProperty("summary")
    private Summary summary;
    @JsonProperty("carriers")
    private List<Carrier> carriers = null;
    @JsonProperty("airports")
    private List<Airport> airports = null;
    @JsonProperty("error")
    private Error error;
    @JsonProperty("air_watch_info")
    private AirWatchInfo airWatchInfo;
    @JsonProperty("disclaimers")
    private List<Disclaimer> disclaimers = null;
    @JsonProperty("search_url")
    private String searchUrl;
    @JsonProperty("fly_score_info")
    private FlyScoreInfo flyScoreInfo;
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

    @JsonProperty("carriers")
    public List<Carrier> getCarriers() {
        return carriers;
    }

    @JsonProperty("carriers")
    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

    @JsonProperty("airports")
    public List<Airport> getAirports() {
        return airports;
    }

    @JsonProperty("airports")
    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    @JsonProperty("error")
    public Error getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
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

    @JsonProperty("search_url")
    public String getSearchUrl() {
        return searchUrl;
    }

    @JsonProperty("search_url")
    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl;
    }

    @JsonProperty("fly_score_info")
    public FlyScoreInfo getFlyScoreInfo() {
        return flyScoreInfo;
    }

    @JsonProperty("fly_score_info")
    public void setFlyScoreInfo(FlyScoreInfo flyScoreInfo) {
        this.flyScoreInfo = flyScoreInfo;
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
