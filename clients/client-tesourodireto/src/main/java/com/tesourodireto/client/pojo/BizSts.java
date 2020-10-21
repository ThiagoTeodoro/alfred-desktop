package com.tesourodireto.client.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cd",
    "dtTm"
})
public class BizSts {

    @JsonProperty("cd")
    public String cd;
    @JsonProperty("dtTm")
    public String dtTm;

}
