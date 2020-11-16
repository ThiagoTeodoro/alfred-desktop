package br.com.alfred.desktop.service;

import java.util.List;

/**
 * Service with operation for Treasury Bonds Brazil.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public interface ITreasuryBondService {
    
    /**
     * Service to get all Tickets of Treasury Bonds Brazil.
     * @return 
     */
    List<String> getTreasuryTickets();
}
