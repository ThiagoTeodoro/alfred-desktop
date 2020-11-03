package br.com.alfred.desktop.exceptions;


/**
 * Exception Genérica do Sistema.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public class GenericException extends RuntimeException{
        
    /**
     * Exception Genérica do sistema.
     * 
     * @param msg 
     */
    public GenericException(String msg){
        
        super(msg);        
    }   
    
}
