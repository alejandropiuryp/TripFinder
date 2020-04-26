
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
    "pr",
    "id",
    "m",
    "impressionId",
    "s",
    "pl"
})
public class L {

    @JsonProperty("pr")
    private Pr pr;
    @JsonProperty("id")
    private String id;
    @JsonProperty("m")
    private String m;
    @JsonProperty("impressionId")
    private String impressionId;
    @JsonProperty("s")
    private String s;
    @JsonProperty("pl")
    private List<Object> pl = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pr")
    public Pr getPr() {
        return pr;
    }

    @JsonProperty("pr")
    public void setPr(Pr pr) {
        this.pr = pr;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("m")
    public String getM() {
        return m;
    }

    @JsonProperty("m")
    public void setM(String m) {
        this.m = m;
    }

    @JsonProperty("impressionId")
    public String getImpressionId() {
        return impressionId;
    }

    @JsonProperty("impressionId")
    public void setImpressionId(String impressionId) {
        this.impressionId = impressionId;
    }

    @JsonProperty("s")
    public String getS() {
        return s;
    }

    @JsonProperty("s")
    public void setS(String s) {
        this.s = s;
    }

    @JsonProperty("pl")
    public List<Object> getPl() {
        return pl;
    }

    @JsonProperty("pl")
    public void setPl(List<Object> pl) {
        this.pl = pl;
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
