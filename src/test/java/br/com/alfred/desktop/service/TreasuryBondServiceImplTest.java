package br.com.alfred.desktop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test to check Treasury Bond Service.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@SpringBootTest
public class TreasuryBondServiceImplTest {
    
    @Autowired
    ITreasuryBondService treasuryBondService;    
    
    /**
     * Our application need this param to rum because SpringBoot need this when
     * you use Swing/AWT
     */
    @BeforeAll
    public static void setup(){
        
        System.setProperty("java.awt.headless", "false");
    }
        
  
        
    /**
     * Check recived Tickets from Treasury Bond Brazil.
     */
    @Test
    public void testSafeInsert(){
        
        Assertions.assertTrue(!treasuryBondService.getTreasuryTickets().isEmpty());
    }
}
