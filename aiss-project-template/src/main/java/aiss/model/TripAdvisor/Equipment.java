
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
    "i",
    "n",
    "t"
})
public class Equipment {

    @JsonProperty("i")
    private String i;
    @JsonProperty("n")
    private String n;
    @JsonProperty("t")
    private String t;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("i")
    public String getI() {
        return i;
    }

    @JsonProperty("i")
    public void setI(String i) {
        this.i = i;
    }

    @JsonProperty("n")
    public String getN() {
        return n;
    }

    @JsonProperty("n")
    public void setN(String n) {
        this.n = n;
    }

    @JsonProperty("t")
    public String getT() {
        return t;
    }

    @JsonProperty("t")
    public void setT(String t) {
        this.t = t;
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
