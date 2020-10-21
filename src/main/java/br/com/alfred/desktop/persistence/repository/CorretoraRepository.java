/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfred.desktop.persistence.repository;

import br.com.alfred.desktop.model.Corretora;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório de ações básicas com o banco de dados.
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Repository
public interface CorretoraRepository extends JpaRepository<Corretora, Integer>{
    
    /**
     * Pesquisa por nome de corretora e seu estatus.
     * 
     * @param name
     * @param active
     * @return 
     */
    public Corretora findByNameAndActive(String name, boolean active);
    
    /**
     * Trazer todas as corretoras baseada em seu status no banco de dados.
     * 
     * @param active
     * @return 
     */
    public List<Corretora> findByActive(boolean active);
}
