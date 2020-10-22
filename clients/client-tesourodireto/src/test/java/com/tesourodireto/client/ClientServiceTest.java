package com.tesourodireto.client;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Teste para a implementação ClientService
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public class ClientServiceTest {
                
    /**
     * Method responsible for verifying that the request did not return null.
     */
    @Test
    public void isNotNull(){
        
        ClientService clientService = new ClientServiceImpl();   
        
        Assertions.assertNotNull(clientService.getBrazilTreasuryBoundInfo());
        Assertions.assertNotNull(clientService.getBrazilTreasuryBoundResume(false));
    }
    
    /**
     * Method responsible for verifying that the request have data.
     */
    @Test
    public void haveData(){
        
        ClientService clientService = new ClientServiceImpl();   
        
        Assertions.assertTrue(clientService.getBrazilTreasuryBoundResume(true).size() > 0);   
        Assertions.assertTrue(clientService.getBrazilTreasuryBoundInfo().getResponse().getTrsrBdTradgList().size() > 0);           
    }              
}
