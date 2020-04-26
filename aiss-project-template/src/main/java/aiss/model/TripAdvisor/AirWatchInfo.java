
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
    "sw",
    "ws"
})
public class AirWatchInfo {

    @JsonProperty("sw")
    private Boolean sw;
    @JsonProperty("ws")
    private Boolean ws;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sw")
    public Boolean getSw() {
        return sw;
    }

    @JsonProperty("sw")
    public void setSw(Boolean sw) {
        this.sw = sw;
    }

    @JsonProperty("ws")
    public Boolean getWs() {
        return ws;
    }

    @JsonProperty("ws")
    public void setWs(Boolean ws) {
        this.ws = ws;
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
