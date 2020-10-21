
package com.tesourodireto.client.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cd",
    "nm",
    "featrs",
    "mtrtyDt",
    "minInvstmtAmt",
    "untrInvstmtVal",
    "invstmtStbl",
    "semiAnulIntrstInd",
    "rcvgIncm",
    "anulInvstmtRate",
    "anulRedRate",
    "minRedQty",
    "untrRedVal",
    "minRedVal",
    "isinCd",
    "FinIndxs",
    "wdwlDt"
})
public class TrsrBd {

    @JsonProperty("cd")
    public Integer cd;
    @JsonProperty("nm")
    public String nm;
    @JsonProperty("featrs")
    public String featrs;
    @JsonProperty("mtrtyDt")
    public String mtrtyDt;
    @JsonProperty("minInvstmtAmt")
    public Double minInvstmtAmt;
    @JsonProperty("untrInvstmtVal")
    public Double untrInvstmtVal;
    @JsonProperty("invstmtStbl")
    public String invstmtStbl;
    @JsonProperty("semiAnulIntrstInd")
    public Boolean semiAnulIntrstInd;
    @JsonProperty("rcvgIncm")
    public String rcvgIncm;
    @JsonProperty("anulInvstmtRate")
    public Double anulInvstmtRate;
    @JsonProperty("anulRedRate")
    public Double anulRedRate;
    @JsonProperty("minRedQty")
    public Double minRedQty;
    @JsonProperty("untrRedVal")
    public Double untrRedVal;
    @JsonProperty("minRedVal")
    public Double minRedVal;
    @JsonProperty("isinCd")
    public String isinCd;
    @JsonProperty("FinIndxs")
    public FinIndxs finIndxs;
    @JsonProperty("wdwlDt")
    public String wdwlDt;

}
