package br.com.alfred.desktop.view.corretoras;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * Renderizador para preencher com cor vermelho o verde o status de cada 
 * corretora.
 * 
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com>
 */
public class CorretorasDataViewerJTableRender extends JLabel implements TableCellRenderer {
            
    
    /**
     *  Configuração de opacidade.
     */
    public CorretorasDataViewerJTableRender(){
        
        super.setOpaque(true);
    }
       
    /**
     * Renderizador.
     * 
     * @param table
     * @param value
     * @param isSelected
     * @param hasFocus
     * @param row
     * @param column
     * @return 
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                                
        //Cor da letra
        super.setForeground(Color.BLACK);
        
        //Cor do Fundo Default
        super.setBackground(new Color(255, 255, 255));
        
        //Texto
        super.setText((String) value);
        
        //Se a coluna for a de Status
        if(column == 2){
                                   
            String text = (String) value;
            
            if(text.equals("Desativada")){
                
                super.setBackground(new Color(255, 105, 97));                
            } else if(text.equals("Ativa")) {
                
                super.setBackground(new Color(191, 227, 180));                
            }            
        }
        
        //Ação para quando selecionado.
        if(isSelected){
            
            super.setBackground(Color.GRAY);
            super.setForeground(Color.WHITE);
        }
        
        return this;
    }
    
}
