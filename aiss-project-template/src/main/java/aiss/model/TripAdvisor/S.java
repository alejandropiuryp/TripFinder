
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
    "dd",
    "o",
    "d",
    "no",
    "nd"
})
public class S {

    @JsonProperty("dd")
    private String dd;
    @JsonProperty("o")
    private String o;
    @JsonProperty("d")
    private String d;
    @JsonProperty("no")
    private Boolean no;
    @JsonProperty("nd")
    private Boolean nd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dd")
    public String getDd() {
        return dd;
    }

    @JsonProperty("dd")
    public void setDd(String dd) {
        this.dd = dd;
    }

    @JsonProperty("o")
    public String getO() {
        return o;
    }

    @JsonProperty("o")
    public void setO(String o) {
        this.o = o;
    }

    @JsonProperty("d")
    public String getD() {
        return d;
    }

    @JsonProperty("d")
    public void setD(String d) {
        this.d = d;
    }

    @JsonProperty("no")
    public Boolean getNo() {
        return no;
    }

    @JsonProperty("no")
    public void setNo(Boolean no) {
        this.no = no;
    }

    @JsonProperty("nd")
    public Boolean getNd() {
        return nd;
    }

    @JsonProperty("nd")
    public void setNd(Boolean nd) {
        this.nd = nd;
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
