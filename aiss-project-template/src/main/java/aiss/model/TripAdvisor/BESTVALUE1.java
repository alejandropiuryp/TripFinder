
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
    "key",
    "ac",
    "l",
    "f",
    "impressionId",
    "fs",
    "od",
    "fsl"
})
public class BESTVALUE1 {

    @JsonProperty("key")
    private String key;
    @JsonProperty("ac")
    private String ac;
    @JsonProperty("l")
    private List<L> l = null;
    @JsonProperty("f")
    private List<F_> f = null;
    @JsonProperty("impressionId")
    private String impressionId;
    @JsonProperty("fs")
    private Double fs;
    @JsonProperty("od")
    private String od;
    @JsonProperty("fsl")
    private String fsl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("ac")
    public String getAc() {
        return ac;
    }

    @JsonProperty("ac")
    public void setAc(String ac) {
        this.ac = ac;
    }

    @JsonProperty("l")
    public List<L> getL() {
        return l;
    }

    @JsonProperty("l")
    public void setL(List<L> l) {
        this.l = l;
    }

    @JsonProperty("f")
    public List<F_> getF() {
        return f;
    }

    @JsonProperty("f")
    public void setF(List<F_> f) {
        this.f = f;
    }

    @JsonProperty("impressionId")
    public String getImpressionId() {
        return impressionId;
    }

    @JsonProperty("impressionId")
    public void setImpressionId(String impressionId) {
        this.impressionId = impressionId;
    }

    @JsonProperty("fs")
    public Double getFs() {
        return fs;
    }

    @JsonProperty("fs")
    public void setFs(Double fs) {
        this.fs = fs;
    }

    @JsonProperty("od")
    public String getOd() {
        return od;
    }

    @JsonProperty("od")
    public void setOd(String od) {
        this.od = od;
    }

    @JsonProperty("fsl")
    public String getFsl() {
        return fsl;
    }

    @JsonProperty("fsl")
    public void setFsl(String fsl) {
        this.fsl = fsl;
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
