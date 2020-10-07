package br.com.alfred.desktop.utils;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
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
    
    /**
     * Método responsável por garantir que um JInternalFrame será fechado e 
     * desalocado da memória.
     * 
     * @param frame
     * @param refMain 
     */
    public static void closeAndDeallocateMemoryFrame(JInternalFrame frame, JDesktopPane refMain){
        
        //Garantindo que o componente será removido do JDestopPane quando fechado.
        frame.setVisible(false);
        refMain.remove(frame); //É importante remover para desalocar a memória.
    }
    
}
