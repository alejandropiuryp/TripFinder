
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
    "ss",
    "ns",
    "oc",
    "da",
    "aa",
    "ca",
    "plp",
    "al",
    "tt",
    "mc",
    "am"
})
public class F {

    @JsonProperty("ss")
    private List<Object> ss = null;
    @JsonProperty("ns")
    private List<Object> ns = null;
    @JsonProperty("oc")
    private List<Object> oc = null;
    @JsonProperty("da")
    private List<Object> da = null;
    @JsonProperty("aa")
    private List<Object> aa = null;
    @JsonProperty("ca")
    private List<Object> ca = null;
    @JsonProperty("plp")
    private List<Object> plp = null;
    @JsonProperty("al")
    private List<Object> al = null;
    @JsonProperty("tt")
    private List<Object> tt = null;
    @JsonProperty("mc")
    private List<Object> mc = null;
    @JsonProperty("am")
    private List<Object> am = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ss")
    public List<Object> getSs() {
        return ss;
    }

    @JsonProperty("ss")
    public void setSs(List<Object> ss) {
        this.ss = ss;
    }

    @JsonProperty("ns")
    public List<Object> getNs() {
        return ns;
    }

    @JsonProperty("ns")
    public void setNs(List<Object> ns) {
        this.ns = ns;
    }

    @JsonProperty("oc")
    public List<Object> getOc() {
        return oc;
    }

    @JsonProperty("oc")
    public void setOc(List<Object> oc) {
        this.oc = oc;
    }

    @JsonProperty("da")
    public List<Object> getDa() {
        return da;
    }

    @JsonProperty("da")
    public void setDa(List<Object> da) {
        this.da = da;
    }

    @JsonProperty("aa")
    public List<Object> getAa() {
        return aa;
    }

    @JsonProperty("aa")
    public void setAa(List<Object> aa) {
        this.aa = aa;
    }

    @JsonProperty("ca")
    public List<Object> getCa() {
        return ca;
    }

    @JsonProperty("ca")
    public void setCa(List<Object> ca) {
        this.ca = ca;
    }

    @JsonProperty("plp")
    public List<Object> getPlp() {
        return plp;
    }

    @JsonProperty("plp")
    public void setPlp(List<Object> plp) {
        this.plp = plp;
    }

    @JsonProperty("al")
    public List<Object> getAl() {
        return al;
    }

    @JsonProperty("al")
    public void setAl(List<Object> al) {
        this.al = al;
    }

    @JsonProperty("tt")
    public List<Object> getTt() {
        return tt;
    }

    @JsonProperty("tt")
    public void setTt(List<Object> tt) {
        this.tt = tt;
    }

    @JsonProperty("mc")
    public List<Object> getMc() {
        return mc;
    }

    @JsonProperty("mc")
    public void setMc(List<Object> mc) {
        this.mc = mc;
    }

    @JsonProperty("am")
    public List<Object> getAm() {
        return am;
    }

    @JsonProperty("am")
    public void setAm(List<Object> am) {
        this.am = am;
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
