
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
    "a",
    "s",
    "c"
})
public class T {

    @JsonProperty("a")
    private Integer a;
    @JsonProperty("s")
    private Integer s;
    @JsonProperty("c")
    private List<Integer> c = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("a")
    public Integer getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(Integer a) {
        this.a = a;
    }

    @JsonProperty("s")
    public Integer getS() {
        return s;
    }

    @JsonProperty("s")
    public void setS(Integer s) {
        this.s = s;
    }

    @JsonProperty("c")
    public List<Integer> getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(List<Integer> c) {
        this.c = c;
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
