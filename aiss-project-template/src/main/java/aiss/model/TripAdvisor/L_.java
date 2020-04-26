
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
    "da",
    "aa",
    "c",
    "m",
    "o",
    "e",
    "f",
    "si",
    "n",
    "dd",
    "ad",
    "tt",
    "stf",
    "di",
    "ac"
})
public class L_ {

    @JsonProperty("da")
    private String da;
    @JsonProperty("aa")
    private String aa;
    @JsonProperty("c")
    private Integer c;
    @JsonProperty("m")
    private String m;
    @JsonProperty("o")
    private String o;
    @JsonProperty("e")
    private String e;
    @JsonProperty("f")
    private String f;
    @JsonProperty("si")
    private Integer si;
    @JsonProperty("n")
    private Integer n;
    @JsonProperty("dd")
    private String dd;
    @JsonProperty("ad")
    private String ad;
    @JsonProperty("tt")
    private String tt;
    @JsonProperty("stf")
    private Boolean stf;
    @JsonProperty("di")
    private Double di;
    @JsonProperty("ac")
    private List<String> ac = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("da")
    public String getDa() {
        return da;
    }

    @JsonProperty("da")
    public void setDa(String da) {
        this.da = da;
    }

    @JsonProperty("aa")
    public String getAa() {
        return aa;
    }

    @JsonProperty("aa")
    public void setAa(String aa) {
        this.aa = aa;
    }

    @JsonProperty("c")
    public Integer getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(Integer c) {
        this.c = c;
    }

    @JsonProperty("m")
    public String getM() {
        return m;
    }

    @JsonProperty("m")
    public void setM(String m) {
        this.m = m;
    }

    @JsonProperty("o")
    public String getO() {
        return o;
    }

    @JsonProperty("o")
    public void setO(String o) {
        this.o = o;
    }

    @JsonProperty("e")
    public String getE() {
        return e;
    }

    @JsonProperty("e")
    public void setE(String e) {
        this.e = e;
    }

    @JsonProperty("f")
    public String getF() {
        return f;
    }

    @JsonProperty("f")
    public void setF(String f) {
        this.f = f;
    }

    @JsonProperty("si")
    public Integer getSi() {
        return si;
    }

    @JsonProperty("si")
    public void setSi(Integer si) {
        this.si = si;
    }

    @JsonProperty("n")
    public Integer getN() {
        return n;
    }

    @JsonProperty("n")
    public void setN(Integer n) {
        this.n = n;
    }

    @JsonProperty("dd")
    public String getDd() {
        return dd;
    }

    @JsonProperty("dd")
    public void setDd(String dd) {
        this.dd = dd;
    }

    @JsonProperty("ad")
    public String getAd() {
        return ad;
    }

    @JsonProperty("ad")
    public void setAd(String ad) {
        this.ad = ad;
    }

    @JsonProperty("tt")
    public String getTt() {
        return tt;
    }

    @JsonProperty("tt")
    public void setTt(String tt) {
        this.tt = tt;
    }

    @JsonProperty("stf")
    public Boolean getStf() {
        return stf;
    }

    @JsonProperty("stf")
    public void setStf(Boolean stf) {
        this.stf = stf;
    }

    @JsonProperty("di")
    public Double getDi() {
        return di;
    }

    @JsonProperty("di")
    public void setDi(Double di) {
        this.di = di;
    }

    @JsonProperty("ac")
    public List<String> getAc() {
        return ac;
    }

    @JsonProperty("ac")
    public void setAc(List<String> ac) {
        this.ac = ac;
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
