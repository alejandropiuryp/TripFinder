
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
    "cu",
    "et",
    "fi",
    "pd",
    "dp",
    "ap",
    "sd",
    "sa",
    "su",
    "a",
    "cp",
    "ocp",
    "pp",
    "sp",
    "dn",
    "dx",
    "da",
    "c",
    "f",
    "p",
    "sh",
    "op",
    "nr",
    "so"
})
public class Summary {

    @JsonProperty("cu")
    private String cu;
    @JsonProperty("et")
    private Integer et;
    @JsonProperty("fi")
    private Integer fi;
    @JsonProperty("pd")
    private String pd;
    @JsonProperty("dp")
    private List<Object> dp = null;
    @JsonProperty("ap")
    private List<Object> ap = null;
    @JsonProperty("sd")
    private List<Object> sd = null;
    @JsonProperty("sa")
    private List<Object> sa = null;
    @JsonProperty("su")
    private List<Object> su = null;
    @JsonProperty("a")
    private List<Object> a = null;
    @JsonProperty("cp")
    private List<Object> cp = null;
    @JsonProperty("ocp")
    private List<Object> ocp = null;
    @JsonProperty("pp")
    private List<Object> pp = null;
    @JsonProperty("sp")
    private List<Object> sp = null;
    @JsonProperty("dn")
    private Integer dn;
    @JsonProperty("dx")
    private Integer dx;
    @JsonProperty("da")
    private Double da;
    @JsonProperty("c")
    private Boolean c;
    @JsonProperty("f")
    private Boolean f;
    @JsonProperty("p")
    private Double p;
    @JsonProperty("sh")
    private String sh;
    @JsonProperty("op")
    private List<Object> op = null;
    @JsonProperty("nr")
    private Integer nr;
    @JsonProperty("so")
    private List<So> so = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cu")
    public String getCu() {
        return cu;
    }

    @JsonProperty("cu")
    public void setCu(String cu) {
        this.cu = cu;
    }

    @JsonProperty("et")
    public Integer getEt() {
        return et;
    }

    @JsonProperty("et")
    public void setEt(Integer et) {
        this.et = et;
    }

    @JsonProperty("fi")
    public Integer getFi() {
        return fi;
    }

    @JsonProperty("fi")
    public void setFi(Integer fi) {
        this.fi = fi;
    }

    @JsonProperty("pd")
    public String getPd() {
        return pd;
    }

    @JsonProperty("pd")
    public void setPd(String pd) {
        this.pd = pd;
    }

    @JsonProperty("dp")
    public List<Object> getDp() {
        return dp;
    }

    @JsonProperty("dp")
    public void setDp(List<Object> dp) {
        this.dp = dp;
    }

    @JsonProperty("ap")
    public List<Object> getAp() {
        return ap;
    }

    @JsonProperty("ap")
    public void setAp(List<Object> ap) {
        this.ap = ap;
    }

    @JsonProperty("sd")
    public List<Object> getSd() {
        return sd;
    }

    @JsonProperty("sd")
    public void setSd(List<Object> sd) {
        this.sd = sd;
    }

    @JsonProperty("sa")
    public List<Object> getSa() {
        return sa;
    }

    @JsonProperty("sa")
    public void setSa(List<Object> sa) {
        this.sa = sa;
    }

    @JsonProperty("su")
    public List<Object> getSu() {
        return su;
    }

    @JsonProperty("su")
    public void setSu(List<Object> su) {
        this.su = su;
    }

    @JsonProperty("a")
    public List<Object> getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(List<Object> a) {
        this.a = a;
    }

    @JsonProperty("cp")
    public List<Object> getCp() {
        return cp;
    }

    @JsonProperty("cp")
    public void setCp(List<Object> cp) {
        this.cp = cp;
    }

    @JsonProperty("ocp")
    public List<Object> getOcp() {
        return ocp;
    }

    @JsonProperty("ocp")
    public void setOcp(List<Object> ocp) {
        this.ocp = ocp;
    }

    @JsonProperty("pp")
    public List<Object> getPp() {
        return pp;
    }

    @JsonProperty("pp")
    public void setPp(List<Object> pp) {
        this.pp = pp;
    }

    @JsonProperty("sp")
    public List<Object> getSp() {
        return sp;
    }

    @JsonProperty("sp")
    public void setSp(List<Object> sp) {
        this.sp = sp;
    }

    @JsonProperty("dn")
    public Integer getDn() {
        return dn;
    }

    @JsonProperty("dn")
    public void setDn(Integer dn) {
        this.dn = dn;
    }

    @JsonProperty("dx")
    public Integer getDx() {
        return dx;
    }

    @JsonProperty("dx")
    public void setDx(Integer dx) {
        this.dx = dx;
    }

    @JsonProperty("da")
    public Double getDa() {
        return da;
    }

    @JsonProperty("da")
    public void setDa(Double da) {
        this.da = da;
    }

    @JsonProperty("c")
    public Boolean getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(Boolean c) {
        this.c = c;
    }

    @JsonProperty("f")
    public Boolean getF() {
        return f;
    }

    @JsonProperty("f")
    public void setF(Boolean f) {
        this.f = f;
    }

    @JsonProperty("p")
    public Double getP() {
        return p;
    }

    @JsonProperty("p")
    public void setP(Double p) {
        this.p = p;
    }

    @JsonProperty("sh")
    public String getSh() {
        return sh;
    }

    @JsonProperty("sh")
    public void setSh(String sh) {
        this.sh = sh;
    }

    @JsonProperty("op")
    public List<Object> getOp() {
        return op;
    }

    @JsonProperty("op")
    public void setOp(List<Object> op) {
        this.op = op;
    }

    @JsonProperty("nr")
    public Integer getNr() {
        return nr;
    }

    @JsonProperty("nr")
    public void setNr(Integer nr) {
        this.nr = nr;
    }

    @JsonProperty("so")
    public List<So> getSo() {
        return so;
    }

    @JsonProperty("so")
    public void setSo(List<So> so) {
        this.so = so;
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
