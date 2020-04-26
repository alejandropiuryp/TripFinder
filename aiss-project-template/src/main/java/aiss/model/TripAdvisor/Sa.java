
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
    "k",
    "min",
    "max",
    "tz"
})
public class Sa {

    @JsonProperty("k")
    private String k;
    @JsonProperty("min")
    private String min;
    @JsonProperty("max")
    private String max;
    @JsonProperty("tz")
    private String tz;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("k")
    public String getK() {
        return k;
    }

    @JsonProperty("k")
    public void setK(String k) {
        this.k = k;
    }

    @JsonProperty("min")
    public String getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(String min) {
        this.min = min;
    }

    @JsonProperty("max")
    public String getMax() {
        return max;
    }

    @JsonProperty("max")
    public void setMax(String max) {
        this.max = max;
    }

    @JsonProperty("tz")
    public String getTz() {
        return tz;
    }

    @JsonProperty("tz")
    public void setTz(String tz) {
        this.tz = tz;
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
