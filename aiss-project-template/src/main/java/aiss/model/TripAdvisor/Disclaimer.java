
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
    "st",
    "lt",
    "dt",
    "ct",
    "lk"
})
public class Disclaimer {

    @JsonProperty("st")
    private String st;
    @JsonProperty("lt")
    private String lt;
    @JsonProperty("dt")
    private String dt;
    @JsonProperty("ct")
    private String ct;
    @JsonProperty("lk")
    private String lk;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("st")
    public String getSt() {
        return st;
    }

    @JsonProperty("st")
    public void setSt(String st) {
        this.st = st;
    }

    @JsonProperty("lt")
    public String getLt() {
        return lt;
    }

    @JsonProperty("lt")
    public void setLt(String lt) {
        this.lt = lt;
    }

    @JsonProperty("dt")
    public String getDt() {
        return dt;
    }

    @JsonProperty("dt")
    public void setDt(String dt) {
        this.dt = dt;
    }

    @JsonProperty("ct")
    public String getCt() {
        return ct;
    }

    @JsonProperty("ct")
    public void setCt(String ct) {
        this.ct = ct;
    }

    @JsonProperty("lk")
    public String getLk() {
        return lk;
    }

    @JsonProperty("lk")
    public void setLk(String lk) {
        this.lk = lk;
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
