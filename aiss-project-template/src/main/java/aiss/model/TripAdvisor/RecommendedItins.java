
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
    "BEST_VALUE_1"
})
public class RecommendedItins {

    @JsonProperty("BEST_VALUE_1")
    private BESTVALUE1 bESTVALUE1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BEST_VALUE_1")
    public BESTVALUE1 getBESTVALUE1() {
        return bESTVALUE1;
    }

    @JsonProperty("BEST_VALUE_1")
    public void setBESTVALUE1(BESTVALUE1 bESTVALUE1) {
        this.bESTVALUE1 = bESTVALUE1;
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
