
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
    "pvid",
    "et",
    "so",
    "t",
    "s",
    "sid",
    "c",
    "n",
    "st",
    "it",
    "o",
    "f"
})
public class SearchParams {

    @JsonProperty("pvid")
    private String pvid;
    @JsonProperty("et")
    private Integer et;
    @JsonProperty("so")
    private String so;
    @JsonProperty("t")
    private T t;
    @JsonProperty("s")
    private List<S> s = null;
    @JsonProperty("sid")
    private String sid;
    @JsonProperty("c")
    private Integer c;
    @JsonProperty("n")
    private Integer n;
    @JsonProperty("st")
    private String st;
    @JsonProperty("it")
    private String it;
    @JsonProperty("o")
    private Integer o;
    @JsonProperty("f")
    private F f;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pvid")
    public String getPvid() {
        return pvid;
    }

    @JsonProperty("pvid")
    public void setPvid(String pvid) {
        this.pvid = pvid;
    }

    @JsonProperty("et")
    public Integer getEt() {
        return et;
    }

    @JsonProperty("et")
    public void setEt(Integer et) {
        this.et = et;
    }

    @JsonProperty("so")
    public String getSo() {
        return so;
    }

    @JsonProperty("so")
    public void setSo(String so) {
        this.so = so;
    }

    @JsonProperty("t")
    public T getT() {
        return t;
    }

    @JsonProperty("t")
    public void setT(T t) {
        this.t = t;
    }

    @JsonProperty("s")
    public List<S> getS() {
        return s;
    }

    @JsonProperty("s")
    public void setS(List<S> s) {
        this.s = s;
    }

    @JsonProperty("sid")
    public String getSid() {
        return sid;
    }

    @JsonProperty("sid")
    public void setSid(String sid) {
        this.sid = sid;
    }

    @JsonProperty("c")
    public Integer getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(Integer c) {
        this.c = c;
    }

    @JsonProperty("n")
    public Integer getN() {
        return n;
    }

    @JsonProperty("n")
    public void setN(Integer n) {
        this.n = n;
    }

    @JsonProperty("st")
    public String getSt() {
        return st;
    }

    @JsonProperty("st")
    public void setSt(String st) {
        this.st = st;
    }

    @JsonProperty("it")
    public String getIt() {
        return it;
    }

    @JsonProperty("it")
    public void setIt(String it) {
        this.it = it;
    }

    @JsonProperty("o")
    public Integer getO() {
        return o;
    }

    @JsonProperty("o")
    public void setO(Integer o) {
        this.o = o;
    }

    @JsonProperty("f")
    public F getF() {
        return f;
    }

    @JsonProperty("f")
    public void setF(F f) {
        this.f = f;
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
