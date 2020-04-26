
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
    "TERRIBLE",
    "AVERAGE",
    "POOR",
    "EXCELLENT",
    "VERY_GOOD"
})
public class FlyScoreInfo {

    @JsonProperty("TERRIBLE")
    private String tERRIBLE;
    @JsonProperty("AVERAGE")
    private String aVERAGE;
    @JsonProperty("POOR")
    private String pOOR;
    @JsonProperty("EXCELLENT")
    private String eXCELLENT;
    @JsonProperty("VERY_GOOD")
    private String vERYGOOD;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TERRIBLE")
    public String getTERRIBLE() {
        return tERRIBLE;
    }

    @JsonProperty("TERRIBLE")
    public void setTERRIBLE(String tERRIBLE) {
        this.tERRIBLE = tERRIBLE;
    }

    @JsonProperty("AVERAGE")
    public String getAVERAGE() {
        return aVERAGE;
    }

    @JsonProperty("AVERAGE")
    public void setAVERAGE(String aVERAGE) {
        this.aVERAGE = aVERAGE;
    }

    @JsonProperty("POOR")
    public String getPOOR() {
        return pOOR;
    }

    @JsonProperty("POOR")
    public void setPOOR(String pOOR) {
        this.pOOR = pOOR;
    }

    @JsonProperty("EXCELLENT")
    public String getEXCELLENT() {
        return eXCELLENT;
    }

    @JsonProperty("EXCELLENT")
    public void setEXCELLENT(String eXCELLENT) {
        this.eXCELLENT = eXCELLENT;
    }

    @JsonProperty("VERY_GOOD")
    public String getVERYGOOD() {
        return vERYGOOD;
    }

    @JsonProperty("VERY_GOOD")
    public void setVERYGOOD(String vERYGOOD) {
        this.vERYGOOD = vERYGOOD;
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
