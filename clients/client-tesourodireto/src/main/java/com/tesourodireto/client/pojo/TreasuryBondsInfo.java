
package com.tesourodireto.client.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "responseStatus",
    "responseStatusText",
    "statusInfo",
    "response"
})
public class TreasuryBondsInfo {

    @JsonProperty("responseStatus")
    public Integer responseStatus;
    @JsonProperty("responseStatusText")
    public String responseStatusText;
    @JsonProperty("statusInfo")
    public String statusInfo;
    @JsonProperty("response")
    public Response response;
}
