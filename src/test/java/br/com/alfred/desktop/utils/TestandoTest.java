/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfred.desktop.utils;

import br.com.alfred.desktop.enums.SecuritiesType;
import br.com.alfred.desktop.model.SecuritiesPriceReference;
import br.com.alfred.desktop.persistence.repository.SecuritiesPriceReferenceRepository;
import java.sql.Timestamp;
import java.util.Date;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



/**
 *
 * @author thiag
 */


@SpringBootTest
public class TestandoTest {
   
    /**
     * Nossa aplicação por ser um Swing/AWT precisa de java.awt.headless em
     * false, isso está feito lá no builder do Springboot no Application.class
     * e deve ser feito em todo test para que possa funcionar.
     */
    @BeforeAll
    public static void setup(){
        System.setProperty("java.awt.headless", "false");
    }
    
    @Autowired
    SecuritiesPriceReferenceRepository securitiesPriceReferenceRepository;
    
    @Test
    public void teste(){
              
        
        SecuritiesPriceReference abc = new SecuritiesPriceReference();
        
        abc.setCode("teste");
        abc.setReferenceMount(0.01);
        abc.setType(SecuritiesType.FixedIncome);
        abc.setCollectionTimestamp(new Timestamp(new Date().getTime()));
        abc.setPrice(100.02);
        
        securitiesPriceReferenceRepository.save(abc);
    }
}
