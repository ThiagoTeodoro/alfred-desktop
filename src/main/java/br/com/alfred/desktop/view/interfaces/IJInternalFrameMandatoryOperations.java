package br.com.alfred.desktop.view.interfaces;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 * Operações obrigatórias  para JInternal Frames
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public interface IJInternalFrameMandatoryOperations {
   
    /**
     * Método responsável por garantir que um JInternalFrame será fechado e 
     * desalocado da memória.     
     */
    public void closeAndDeallocateMemoryFrame();
}
