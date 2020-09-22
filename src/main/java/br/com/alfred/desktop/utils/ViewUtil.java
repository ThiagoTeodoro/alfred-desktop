package br.com.alfred.desktop.utils;

import javax.swing.JButton;
import javax.swing.JInternalFrame;

/**
 * Classe com funções utéis para manipulação de jFrame
 * e jInternalFrame. 
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com.br>
 */
public class ViewUtil {
    
    /**
     * Método responsável por setar o botão default da tela, isso faz com que o
     * botão seja acionado com um enter.
     * 
     * @param frame
     * @param jButton 
     */
    public static void setDefaultButtonInternalFrame(JInternalFrame frame, JButton jButton){
        
        frame.getRootPane().setDefaultButton(jButton);
    }
    
}
