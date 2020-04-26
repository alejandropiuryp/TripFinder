
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
    "d",
    "c",
    "i",
    "g",
    "cc",
    "cn",
    "n",
    "tz",
    "st"
})
public class Airport {

    @JsonProperty("d")
    private String d;
    @JsonProperty("c")
    private String c;
    @JsonProperty("i")
    private Integer i;
    @JsonProperty("g")
    private G g;
    @JsonProperty("cc")
    private String cc;
    @JsonProperty("cn")
    private String cn;
    @JsonProperty("n")
    private String n;
    @JsonProperty("tz")
    private String tz;
    @JsonProperty("st")
    private String st;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("d")
    public String getD() {
        return d;
    }

    @JsonProperty("d")
    public void setD(String d) {
        this.d = d;
    }

    @JsonProperty("c")
    public String getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(String c) {
        this.c = c;
    }

    @JsonProperty("i")
    public Integer getI() {
        return i;
    }

    @JsonProperty("i")
    public void setI(Integer i) {
        this.i = i;
    }

    @JsonProperty("g")
    public G getG() {
        return g;
    }

    @JsonProperty("g")
    public void setG(G g) {
        this.g = g;
    }

    @JsonProperty("cc")
    public String getCc() {
        return cc;
    }

    @JsonProperty("cc")
    public void setCc(String cc) {
        this.cc = cc;
    }

    @JsonProperty("cn")
    public String getCn() {
        return cn;
    }

    @JsonProperty("cn")
    public void setCn(String cn) {
        this.cn = cn;
    }

    @JsonProperty("n")
    public String getN() {
        return n;
    }

    @JsonProperty("n")
    public void setN(String n) {
        this.n = n;
    }

    @JsonProperty("tz")
    public String getTz() {
        return tz;
    }

    @JsonProperty("tz")
    public void setTz(String tz) {
        this.tz = tz;
    }

    @JsonProperty("st")
    public String getSt() {
        return st;
    }

    @JsonProperty("st")
    public void setSt(String st) {
        this.st = st;
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
