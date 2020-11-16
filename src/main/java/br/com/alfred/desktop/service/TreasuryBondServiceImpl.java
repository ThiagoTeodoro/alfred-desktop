package br.com.alfred.desktop.service;

import br.com.alfred.desktop.exceptions.GenericException;
import br.com.alfred.desktop.utils.MessageUtil;
import com.tesourodireto.client.ClientService;
import com.tesourodireto.client.ClientServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Service with operation for Treasury Bonds Brazil.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Service
public class TreasuryBondServiceImpl implements ITreasuryBondService{

    @Override
    public List<String> getTreasuryTickets() throws GenericException {
        
        List<String> result = new ArrayList<>();
        ClientService clientServiceTreasuryBond = new ClientServiceImpl();
        
        clientServiceTreasuryBond.getBrazilTreasuryBoundResume(true)
                .forEach(ticket -> result.add(ticket.getName()));
                
        if(result.isEmpty()){
            
            throw new GenericException(MessageUtil.noTicketForTreasuryBoundRecived);
        }                
        
        return result;
    }
    
}
