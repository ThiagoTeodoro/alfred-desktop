package br.com.alfred.desktop.exceptions;

/**
 * Classe responsável por tratar exception de validações
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public class RequiredFieldException extends RuntimeException {
   
    /**
     * Exception para campos obrigatórios faltando apenas mensgaem.
     * @param msg 
     */
    public RequiredFieldException(String msg){
     
        super(msg);
    }   
    
    /**
     * Exception para campos obrigatórios faltando com rastreio throws.
     * @param msg 
     */
    public RequiredFieldException(String msg, Throwable throwable){
        
        super(msg, throwable);        
    }
    
    
}
