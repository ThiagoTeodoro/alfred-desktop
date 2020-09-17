/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfred.desktop.repository;

import br.com.alfred.desktop.model.Corretora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório de ações básicas com o banco de dados.
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Repository
public interface CorretoraRepository extends JpaRepository<Corretora, Integer>{
    
}
