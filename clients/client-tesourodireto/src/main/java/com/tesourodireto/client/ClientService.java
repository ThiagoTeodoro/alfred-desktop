package com.tesourodireto.client;

import com.tesourodireto.client.dto.TreasuryBondResume;
import com.tesourodireto.client.pojo.TreasuryBondsInfo;
import java.util.List;

/**
 * Interface for a Client to Get information about Brazil Treasury Bound.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public interface ClientService {
    
    /**
     * Service to get a Resume about all Values of Brazil Treasury Bound.
     * 
     * @return 
     */
    public List<TreasuryBondResume> getBrazilTreasuryBoundResume(boolean disableVerifySSL);
    
    
    /**
     * Service to get a all Information about Brazil Treasury Bound.
     * 
     * @return 
     */
    public TreasuryBondsInfo getBrazilTreasuryBoundInfo();
    
}
