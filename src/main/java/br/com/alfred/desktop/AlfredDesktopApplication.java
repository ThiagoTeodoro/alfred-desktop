package br.com.alfred.desktop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Initializer da aplicação.
 *  
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
@SpringBootApplication
public class AlfredDesktopApplication{
    
    /**
     * Start SpringBoot.
     * @param args 
     */
    public static void main(String[] args) {
        
        //Setando configurações para aplicação gráfica desktop
        SpringApplicationBuilder builder = new SpringApplicationBuilder(AlfredDesktopApplication.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);                                 
    }   
}
