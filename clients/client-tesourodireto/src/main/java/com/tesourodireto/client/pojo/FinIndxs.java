
package com.tesourodireto.client.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cd",
    "nm"
})
public class FinIndxs {

    @JsonProperty("cd")
    public Integer cd;
    @JsonProperty("nm")
    public String nm;

}
