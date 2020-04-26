
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
    "p",
    "f",
    "dp",
    "df"
})
public class Pr {

    @JsonProperty("p")
    private Double p;
    @JsonProperty("f")
    private Double f;
    @JsonProperty("dp")
    private String dp;
    @JsonProperty("df")
    private String df;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("p")
    public Double getP() {
        return p;
    }

    @JsonProperty("p")
    public void setP(Double p) {
        this.p = p;
    }

    @JsonProperty("f")
    public Double getF() {
        return f;
    }

    @JsonProperty("f")
    public void setF(Double f) {
        this.f = f;
    }

    @JsonProperty("dp")
    public String getDp() {
        return dp;
    }

    @JsonProperty("dp")
    public void setDp(String dp) {
        this.dp = dp;
    }

    @JsonProperty("df")
    public String getDf() {
        return df;
    }

    @JsonProperty("df")
    public void setDf(String df) {
        this.df = df;
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
