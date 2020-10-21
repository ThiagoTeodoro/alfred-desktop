
package com.tesourodireto.client.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "opngDtTm",
    "clsgDtTm",
    "qtnDtTm",
    "stsCd",
    "sts"
})
public class TrsrBondMkt {

    @JsonProperty("opngDtTm")
    public String opngDtTm;
    @JsonProperty("clsgDtTm")
    public String clsgDtTm;
    @JsonProperty("qtnDtTm")
    public String qtnDtTm;
    @JsonProperty("stsCd")
    public Integer stsCd;
    @JsonProperty("sts")
    public String sts;

}
