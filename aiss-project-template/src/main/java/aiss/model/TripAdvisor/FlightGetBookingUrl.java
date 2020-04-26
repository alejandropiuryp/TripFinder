
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
    "partner_url",
    "is_complete",
    "error",
    "is_app_deep_link",
    "app_id"
})
public class FlightGetBookingUrl {

    @JsonProperty("partner_url")
    private String partnerUrl;
    @JsonProperty("is_complete")
    private Boolean isComplete;
    @JsonProperty("error")
    private Object error;
    @JsonProperty("is_app_deep_link")
    private Boolean isAppDeepLink;
    @JsonProperty("app_id")
    private Object appId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("partner_url")
    public String getPartnerUrl() {
        return partnerUrl;
    }

    @JsonProperty("partner_url")
    public void setPartnerUrl(String partnerUrl) {
        this.partnerUrl = partnerUrl;
    }

    @JsonProperty("is_complete")
    public Boolean getIsComplete() {
        return isComplete;
    }

    @JsonProperty("is_complete")
    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
    }

    @JsonProperty("error")
    public Object getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Object error) {
        this.error = error;
    }

    @JsonProperty("is_app_deep_link")
    public Boolean getIsAppDeepLink() {
        return isAppDeepLink;
    }

    @JsonProperty("is_app_deep_link")
    public void setIsAppDeepLink(Boolean isAppDeepLink) {
        this.isAppDeepLink = isAppDeepLink;
    }

    @JsonProperty("app_id")
    public Object getAppId() {
        return appId;
    }

    @JsonProperty("app_id")
    public void setAppId(Object appId) {
        this.appId = appId;
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
