package com.tesourodireto.client;

import org.junit.jupiter.api.Test;
import com.tesourodireto.client.dto.TreasuryBondResume;


/**
 *
 * @author thiag
 */
public class ClientServiceTest {
    
    @Test
    public void abc(){
        
        ClientServiceImpl abd = new ClientServiceImpl();
                
        
        abd.getBrazilTreasuryBoundResume().forEach(action -> {
            System.out.println(action);
        });
        
    }
}
