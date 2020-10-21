package com.tesourodireto.client.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO construindo afim de entregar um resumo dos dados obtidos do Tesouro
 * Direto.
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreasuryBondResume {

    private String name;
    private Double fullTitleValue;
    private Double annualIncomeRate;
    private Double minInvestmentQty;
    private Double minInvestmentAmount;
    private Date timestamp;
}
