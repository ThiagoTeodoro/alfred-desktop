package br.com.alfred.desktop.database;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuração de conexão com o banco de dados.
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@Configuration
public class DatabaseConfig {
    
    @Bean  
    public DataSource dataSource() {  
        
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();  
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");  
        dataSourceBuilder.url("jdbc:sqlite:alfredDB.db");  
        return dataSourceBuilder.build();  
    }    
    
}
