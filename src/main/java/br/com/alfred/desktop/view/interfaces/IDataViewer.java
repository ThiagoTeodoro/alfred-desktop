package br.com.alfred.desktop.view.interfaces;

/**
 * Interface para regulamenter a implementação de DataViewers.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com.br>
 */
public interface IDataViewer extends IJInternalFrameMandatoryOperations {
   
    /**
     * Método padrão para atualizar um Table de um Dataveiwer.
     */
    public void reloadMainTable();
}
