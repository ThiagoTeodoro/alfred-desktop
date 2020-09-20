package br.com.alfred.desktop.exceptions;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe responsável por tratar exception de validações
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public class RequiredFieldException extends Exception{
   
    /**
     * Exception para campos obrigatórios faltando apenas mensgaem.
     * @param msg 
     */
    public RequiredFieldException(String msg){
     
        super(msg);
        JOptionPane.showMessageDialog(new JFrame(), msg, "Atenção", JOptionPane.WARNING_MESSAGE);
    }   
    
    /**
     * Exception para campos obrigatórios faltando com rastreio throws.
     * @param msg 
     */
    public RequiredFieldException(String msg, Throwable throwable){
        
        super(msg, throwable);
        JOptionPane.showMessageDialog(new JFrame(), msg, "Atenção", JOptionPane.WARNING_MESSAGE);
    }
    
    
}
