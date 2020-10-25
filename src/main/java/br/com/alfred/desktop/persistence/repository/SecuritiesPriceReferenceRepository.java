package br.com.alfred.desktop.persistence.repository;

import br.com.alfred.desktop.model.SecuritiesPriceReference;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Repositório de operações para a tabela tb_securities_price_reference
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Repository
public interface SecuritiesPriceReferenceRepository extends JpaRepository<SecuritiesPriceReference, Integer>{
 
           
    @Query("FROM SecuritiesPriceReference WHERE date(datetime(collectionTimestamp / 1000 , 'unixepoch')) = date('now') and code = ?1 and type = ?2 ")
    Optional<SecuritiesPriceReference> securitiesPriceReferenceExistToday(String code, String type);
}
