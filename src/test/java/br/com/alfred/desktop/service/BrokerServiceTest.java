package br.com.alfred.desktop.service;

import br.com.alfred.desktop.exceptions.GenericException;
import br.com.alfred.desktop.exceptions.RequiredFieldException;
import br.com.alfred.desktop.model.Broker;
import br.com.alfred.desktop.persistence.repository.BrokerRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test to check Broker Service.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@SpringBootTest
public class BrokerServiceTest {
    
    @Autowired
    IBrokerService brokerService;
    
    @Autowired
    BrokerRepository brokerRepository;
    
    //Broker to used in the Tests.
    private Broker mockBroker;        
    
    /**
     * Our application need this param to rum because SpringBoot need this when
     * you use Swing/AWT
     */
    @BeforeAll
    public static void setup(){
        
        System.setProperty("java.awt.headless", "false");
    }
        
    /**
     * Method to put the Data to Test.
     */
    @BeforeEach
    public void putDataInDBToTest(){
     
        this.mockBroker = brokerService.safeInsert("BrokerServiceTest");
    }
    
    /**
     * Method to clean the DB after Tests.
     */
    @AfterEach
    public void purgeDB(){
        
        brokerRepository.delete(mockBroker);
    }
        
    /**
     * Check the Insert.
     */
    @Test
    public void testSafeInsert(){
        
        //Check if the 'BrokerServiceTest' exist in database, it was inserted in BeforeEach
        Assertions.assertNotNull(brokerRepository.findByNameAndActive("BrokerServiceTest", true));
    }
    
    /**
     * Check if when try inserted a empty Broker name a Exception was lanced.
     */
    @Test
    public void testSafeInsertNotAllowNullName(){
        
        Assertions.assertThrows(RequiredFieldException.class, () -> {
            brokerService.safeInsert(""); //This is not a class to Injection
        });  
    }
    
    /**
     * Check if the Broker inserted in BeforeEach Realy Exist.
     */
    @Test
    public void testBrokerIfExist(){
        
        Assertions.assertNotNull(brokerService.brokerIsExist("BrokerServiceTest"));
    }
    
    
    /**
     * Check if the Broker not Exist.
     */
    public void testBrokerIfExistDataNotExist(){
        
        Assertions.assertNull(brokerService.brokerIsExist("abcdefgh"));
    }
    
    
    /**
     * This test will be verify if the inserted data in beforeEach() exist
     * in database by selection the id of this data.
     */
    @Test
    public void testGetBrokerById(){
        
        Assertions.assertNotNull(brokerService.getBrokerById(mockBroker.getId()));
    }
    
    
    /**
     * This test will be verify if the exception its launched when a no exist
     * id is call in the metheod.
     */
    @Test
    public void testGetBrokerByIdNotExist(){
        
        Assertions.assertThrows(GenericException.class, () -> {
            brokerService.getBrokerById(0); //This is not a class to Injection
        });        
    }    
    
    /**
     * This method virify if a unSafeUpdate has occured propely.
     */
    @Test
    public void testUnSafeUpdate(){
        
        Broker brokerToUpdate = mockBroker;
        brokerToUpdate.setName("Abacaxi");
        
        brokerService.unSafeUpdate(brokerToUpdate);
        Assertions.assertTrue(brokerService.getBrokerById(mockBroker.getId()).getName().equals("Abacaxi"));
    }
    
    /**
     * This method virify if a unSafeUpdate has launched when a empty name has 
     * sended to update.
     */
    @Test
    public void testUnSafeUpdateRequiredField(){
        
         Assertions.assertThrows(RequiredFieldException.class, () -> {
            Broker brokerToUpdate = mockBroker;
            brokerToUpdate.setName(""); //This is not a class to Injection
             
            brokerService.unSafeUpdate(brokerToUpdate); 
        });
    }      
}
