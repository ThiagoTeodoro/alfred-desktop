package br.com.alfred.desktop.utils;

import br.com.alfred.desktop.persistence.repository.BrokerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test for BeamUtil.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@SpringBootTest
public class BeamUtilTest {
   
    /**
     * Our application need this param to rum because SpringBoot need this when
     * you use Swing/AWT
     */
    @BeforeAll
    public static void setup(){
        
        System.setProperty("java.awt.headless", "false");
    }
    
    
    /**
     * Test for check if a Injection by BeanUtil has occurred when is called.
     */
    @Test
    public void checkManuelyInjection(){
        
        BrokerRepository brokerRepository = BeanUtil.getBean(BrokerRepository.class);
        Assertions.assertNotNull(brokerRepository);        
    }
    
    /**
     * Test for check if a Injection by BeanUtil has not occurred when is called.
     */
    @Test()
    public void checkManuelyNotFoundInjecion(){
        
        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> {
            BeanUtil.getBean(MessageUtil.class); //This is not a class to Injection
        });        
    }
    
    
    
}
