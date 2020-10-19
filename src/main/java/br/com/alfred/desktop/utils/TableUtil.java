package br.com.alfred.desktop.utils;

import br.com.alfred.desktop.exceptions.GenericException;
import br.com.alfred.desktop.exceptions.RequiredFieldException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsável por prover funções para manipulação de Objetos jTable
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public class TableUtil {

    /**
     * Método responsável por remover todos os dados de uma Tabela.
     *
     * @param jTable Tabela
     */
    public static void emptyTable(JTable jTable) {

        //Obtendo Layout da Tabela enviada.
        DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();

        //Esvaziando toda a tabela.
        tableModel.setNumRows(0);
    }

    /**
     * Método responsável por adicionar uma linha na Tabela.
     *
     * @param jTable Tabela
     * @param line Vetor com cada coluna de dados da linha, cada posição é uma
     * coluna.
     */
    public static void addLine(JTable jTable, Vector<String> line) {

        //Obtendo Layout da Tabela enviada.
        DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();

        if (!line.isEmpty()) {

            tableModel.addRow(line);
        }
    }

    /**
     * Método responsável por obter o valor de uma coluna no JTabele conforme
     * linha selecionada.
     *
     * @param jTable
     * @param numberOfTargetColumn
     * @return
     * @throws GenericException
     */
    public static String getColumnValueSelectedRow(JTable jTable, int numberOfTargetColumn) throws GenericException {

        String result = null;

        try {

            int numberRow = jTable.getSelectedRow();
            result = jTable.getValueAt(numberRow, numberOfTargetColumn).toString();
        } catch (Exception e) {

            throw new GenericException(String.format(MessageUtil.msgGenericError, e.getMessage()), JOptionPane.ERROR_MESSAGE);
        }

        return result;
    }

    /**
     * Método responsável por verificar se uma linha está selecionada em um
     * JTable.
     *
     * @param jTable
     * @return
     */
    public static boolean lineIsSelected(JTable jTable) {

        return jTable.getSelectedRow() != -1;
    }

}
