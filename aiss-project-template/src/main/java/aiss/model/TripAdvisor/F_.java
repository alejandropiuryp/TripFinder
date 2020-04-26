
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
    "l",
    "lo",
    "od"
})
public class F_ {

    @JsonProperty("l")
    private List<L_> l = null;
    @JsonProperty("lo")
    private List<Object> lo = null;
    @JsonProperty("od")
    private List<Object> od = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("l")
    public List<L_> getL() {
        return l;
    }

    @JsonProperty("l")
    public void setL(List<L_> l) {
        this.l = l;
    }

    @JsonProperty("lo")
    public List<Object> getLo() {
        return lo;
    }

    @JsonProperty("lo")
    public void setLo(List<Object> lo) {
        this.lo = lo;
    }

    @JsonProperty("od")
    public List<Object> getOd() {
        return od;
    }

    @JsonProperty("od")
    public void setOd(List<Object> od) {
        this.od = od;
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
