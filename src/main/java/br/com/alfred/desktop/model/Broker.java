package br.com.alfred.desktop.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * Modelo de dados para corretora.
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Data
@Entity
@Table(name = "tb_broker")
public class Broker {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "active", nullable = false)
    private boolean active;
    
    @Column(name = "insert_timestamp", nullable = false)
    private Timestamp insertTimestamp;
    
    @Column(name = "update_timestamp", nullable = true)
    private Timestamp updateTimestamp;
}
