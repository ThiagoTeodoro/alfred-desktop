
package com.tesourodireto.client.pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BdTxTp",
    "TrsrBondMkt",
    "TrsrBdTradgList",
    "BizSts"
})
public class Response {

    @JsonProperty("BdTxTp")
    public BdTxTp bdTxTp;
    @JsonProperty("TrsrBondMkt")
    public TrsrBondMkt trsrBondMkt;
    @JsonProperty("TrsrBdTradgList")
    public List<TrsrBdTradgList> trsrBdTradgList = null;
    @JsonProperty("BizSts")
    public BizSts bizSts;

}
