
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
    "c",
    "l",
    "n"
})
public class Carrier {

    @JsonProperty("i")
    private Integer i;
    @JsonProperty("c")
    private String c;
    @JsonProperty("l")
    private String l;
    @JsonProperty("n")
    private String n;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("i")
    public Integer getI() {
        return i;
    }

    @JsonProperty("i")
    public void setI(Integer i) {
        this.i = i;
    }

    @JsonProperty("c")
    public String getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(String c) {
        this.c = c;
    }

    @JsonProperty("l")
    public String getL() {
        return l;
    }

    @JsonProperty("l")
    public void setL(String l) {
        this.l = l;
    }

    @JsonProperty("n")
    public String getN() {
        return n;
    }

    @JsonProperty("n")
    public void setN(String n) {
        this.n = n;
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
