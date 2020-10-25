package br.com.alfred.desktop.model;

import br.com.alfred.desktop.enums.SecuritiesType;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


/**
 * Modelo de dados para a tabela securities_price_reference
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Data
@Entity
@Table(name = "tb_securities_price_reference")
public class SecuritiesPriceReference {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    
    @Column(name = "code", nullable = false)
    private String code;
    
    @Column(name = "type", nullable = false)
    private SecuritiesType type;
    
    @Column(name = "reference_mount", nullable = false)
    private Double referenceMount;
    
    @Column(name = "price", nullable = false)
    private Double price;
    
    @Column(name = "collection_timestamp", nullable = false)
    private Timestamp collectionTimestamp;
    
}
