package br.com.alfred.desktop.view.interfaces;

import br.com.alfred.desktop.view.corretoras.CorretorasManager;

/**
 * Interface para regulamenter a implementação de ManagerViewers.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com.br>
 */
public interface IManagerViewer extends IJInternalFrameMandatoryOperations {
 
    /**
     * Método responsável por preencher os dados de edição na tela para que 
     * a mesma possa exibilos e também trocar todos os testos para inidicar
     * um processo de edição.
     */    
    public void setFrameToEditProcess();
}
