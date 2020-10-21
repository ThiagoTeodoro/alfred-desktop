package br.com.alfred.desktop.exceptions;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Exception Genérica do Sistema.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public class GenericException extends Exception{
    
    
    /**
     * Exception Genérica do sistema.
     * 
     * @param msg 
     */
    public GenericException(String msg, int typeMessage){
        
        super(msg);
        JOptionPane.showMessageDialog(new JFrame(), msg, "Error", typeMessage);
    }   
    
}
