package com.tesourodireto.client;

import com.tesourodireto.client.pojo.TreasuryBondsInfo;
import com.tesourodireto.client.dto.TreasuryBondResume;
import com.tesourodireto.client.ssl.SSLTrustChain;
import com.tesourodireto.client.util.RestTemplateFactory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Implementation for get Info abaout Brazil Treasury Bound.
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public class ClientServiceImpl implements ClientService {

    @Override
    public List<TreasuryBondResume> getBrazilTreasuryBoundResume() {

        List<TreasuryBondResume> result = new ArrayList<>();

        try {

            //Desabilitando SSL.
            SSLTrustChain.disableSSLVerification();

            //Get Treasure Bouds Info from Brazil Treasury
            TreasuryBondsInfo treasuryBondsInfo = RestTemplateFactory
                    .getRestTemplate()
                    .getForEntity("https://www.tesourodireto.com.br/json/br/com/b3/tesourodireto/service/api/treasurybondsinfo.json", TreasuryBondsInfo.class)
                    .getBody();

            
            //Format of incoming date.
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Date dateRequest = sdf.parse(treasuryBondsInfo.getResponse().getBizSts().getDtTm());
            
            //Iterate the result form API.
            treasuryBondsInfo.getResponse().getTrsrBdTradgList().stream().forEach(treasuryBond -> {

                TreasuryBondResume aux = new TreasuryBondResume();

                //Build and add the Resumes.
                result.add(aux.builder()
                        .name(treasuryBond.getTrsrBd().getNm())
                        .fullTitleValue(treasuryBond.getTrsrBd().getUntrRedVal())
                        .annualIncomeRate(treasuryBond.getTrsrBd().getAnulRedRate())
                        .minInvestmentQty(treasuryBond.getTrsrBd().getMinRedQty())
                        .minInvestmentAmount(treasuryBond.getTrsrBd().getMinRedVal())
                        .timestamp(dateRequest)
                        .build()
                );
            }
            );

        } catch (Exception e) {

            System.out.println(String.format("An error occurred when the client execute getBrazilTreasuryBoundResume(). Exception : %s", e));
        }

        return result;
    }

    @Override
    public TreasuryBondsInfo getBrazilTreasuryBoundInfo() {

        TreasuryBondsInfo result = new TreasuryBondsInfo();

        try {

            //Desabilitando SSL.
            SSLTrustChain.disableSSLVerification();

            //Get Treasure Bouds Info from Brazil Treasury
            result = RestTemplateFactory
                    .getRestTemplate()
                    .getForEntity("https://www.tesourodireto.com.br/json/br/com/b3/tesourodireto/service/api/treasurybondsinfo.json", TreasuryBondsInfo.class)
                    .getBody();

        } catch (Exception e) {

            System.out.println(String.format("An error occurred when the client execute getBrazilTreasuryBoundInfo(). Exception : %s", e));
        }

        return result;
    }

}
