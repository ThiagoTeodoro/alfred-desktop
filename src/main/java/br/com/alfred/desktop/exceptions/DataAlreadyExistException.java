package br.com.alfred.desktop.exceptions;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Exception para quando o dado já existir de alguma maneira no sistema e você
 * precisar avisar o usuário.
 * 
 * @author Thiago Teodoro Rodrigues
 */
public class DataAlreadyExistException extends Exception{
    
    
    /**
     * Exception Para dado já existente no sistema.
     * 
     * @param msg 
     */
    public DataAlreadyExistException(String msg){
        
        super(msg);
        JOptionPane.showMessageDialog(new JFrame(), msg, "Atenção", JOptionPane.WARNING_MESSAGE);
    }   
}
