/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.alfred.desktop.view.corretoras;

import br.com.alfred.desktop.exceptions.GenericException;
import br.com.alfred.desktop.exceptions.RequiredFieldException;
import br.com.alfred.desktop.model.Corretora;
import br.com.alfred.desktop.persistence.repository.CorretoraRepository;
import br.com.alfred.desktop.utils.BeanUtil;
import br.com.alfred.desktop.utils.MessageUtil;
import br.com.alfred.desktop.utils.TableUtil;
import br.com.alfred.desktop.utils.ViewUtil;
import br.com.alfred.desktop.view.interfaces.IDataViewer;
import java.net.URL;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Thiago Teodoro Rodrigues <thiago.teodoro.rodrigues@gmail.com.br>
 */
public class CorretorasDataViewer extends javax.swing.JInternalFrame implements IDataViewer {
    
    private JDesktopPane refMain;

    /** Creates new form CorretorasDataViewer */
    public CorretorasDataViewer(JDesktopPane refMain) {
        
        //Inicializando componente.
        initComponents();
        this.refMain = refMain;
        
        //Setando renderizador personalizado da tabela.
        this.corretorasJTable.setDefaultRenderer(String.class, new CorretorasDataViewerJTableRender());
        
        //Retirando Borda do botão de on/off que é só pro Desenvolvimento ver
        this.enableJButton.setBorder(this.addJButton.getBorder());
        
        //Carregando dados da tabela.
        this.reloadMainTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorJPanel = new javax.swing.JPanel();
        addJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        enableJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        corretorasJTable = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Corretoras");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        colorJPanel.setBackground(new java.awt.Color(255, 255, 255));

        addJButton.setBackground(new java.awt.Color(255, 255, 255));
        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        addJButton.setBorder(null);
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        editJButton.setBackground(new java.awt.Color(255, 255, 255));
        editJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        editJButton.setBorder(null);
        editJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButtonActionPerformed(evt);
            }
        });

        enableJButton.setBackground(new java.awt.Color(255, 255, 255));
        enableJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enableJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colorJPanelLayout = new javax.swing.GroupLayout(colorJPanel);
        colorJPanel.setLayout(colorJPanelLayout);
        colorJPanelLayout.setHorizontalGroup(
            colorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enableJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        colorJPanelLayout.setVerticalGroup(
            colorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(addJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(enableJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap())
        );

        corretorasJTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        corretorasJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        corretorasJTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        corretorasJTable.getTableHeader().setReorderingAllowed(false);
        corretorasJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corretorasJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(corretorasJTable);
        if (corretorasJTable.getColumnModel().getColumnCount() > 0) {
            corretorasJTable.getColumnModel().getColumn(0).setMinWidth(100);
            corretorasJTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            corretorasJTable.getColumnModel().getColumn(0).setMaxWidth(100);
            corretorasJTable.getColumnModel().getColumn(1).setResizable(false);
            corretorasJTable.getColumnModel().getColumn(2).setMinWidth(100);
            corretorasJTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            corretorasJTable.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(colorJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(colorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
           
        try{
            
            CorretorasManager corretorasRegister = new CorretorasManager(this, this.refMain, Boolean.FALSE, null);
            this.refMain.add(corretorasRegister);
            corretorasRegister.setVisible(true);
        } catch (Exception e){
            
            this.closeAndDeallocateMemoryFrame();
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void editJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButtonActionPerformed
                
        try{
            
            if(TableUtil.lineIsSelected(this.corretorasJTable)){
                
                //Obtendo id da Corretora Selecionada
                int idCorretora =Integer.parseInt(TableUtil.getColumnValueSelectedRow(this.corretorasJTable, 0));                     
                
                //Injeção de dependência
                CorretoraRepository corretoraRepository = BeanUtil.getBean(CorretoraRepository.class);
                
                CorretorasManager corretorasRegister = new CorretorasManager(this, this.refMain, Boolean.TRUE, corretoraRepository.findById(idCorretora).get());
                this.refMain.add(corretorasRegister);
                corretorasRegister.setVisible(true);                 
            } else {                
                
                new RequiredFieldException(MessageUtil.selectLineRiquired);
            }                        
        } catch (GenericException e){
            
            //Se for lançada uma Exception Genérica aqui é por que tentou editar uma corretora desativada não faremos nada nesse caso.                                            
        } catch (Exception e){
            
            this.closeAndDeallocateMemoryFrame();
        }                        
    }//GEN-LAST:event_editJButtonActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        
        //Garantindo Fechamento correto do JInternalFrame.
        this.closeAndDeallocateMemoryFrame();
    }//GEN-LAST:event_formInternalFrameClosed

    private void enableJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableJButtonActionPerformed
        
        
        //LEMBRETE, QUANDO FOR ATIVAR OU DESATIVAR QUANDO O PROCESSO CONCLUIR 
        //VOCÊ PRECISA MUDAR O BOTÃO PARA ON OU OFF DEPENDENDO DO QUE VIER.
        //POR ISSO TALVE SEJA INTENRESSANTE DESACOPLAR O METODO ACIMA PARA 
        //FAZER ESSA AÇÃO TANTO NO RETORNO DA OPERAÇÃO AQUI QUANTO LÁ NA OPERAÇÃO
        //DE CLICK DO MAUSE NO JTABLE!!!!!!
        
    }//GEN-LAST:event_enableJButtonActionPerformed

    /**
     * Ação para mudar o icone de On/Off conforme o cadastro.
     * @param evt 
     */
    private void corretorasJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corretorasJTableMouseClicked
        
        try {
            
            if(TableUtil.getColumnValueSelectedRow(this.corretorasJTable, 2).equals("Ativa")){
                                
                URL imgURL = getClass().getClassLoader().getResource("icons/off.png");
                this.enableJButton.setIcon(new ImageIcon(imgURL, "Desativar"));
            } else if(TableUtil.getColumnValueSelectedRow(this.corretorasJTable, 2).equals("Desativada")) {
                
                URL imgURL = getClass().getClassLoader().getResource("icons/on.png");
                this.enableJButton.setIcon(new ImageIcon(imgURL, "Ativar"));
            }            
        } catch (GenericException ex) {
            
            Logger.getLogger(CorretorasDataViewer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RequiredFieldException ex) {
            
            Logger.getLogger(CorretorasDataViewer.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_corretorasJTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JPanel colorJPanel;
    private javax.swing.JTable corretorasJTable;
    private javax.swing.JButton editJButton;
    private javax.swing.JButton enableJButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * Método padrão para atualizar um Table de um Dataveiwer.
     */
    @Override
    public void reloadMainTable() {
        
        //Injeção de dependência
        CorretoraRepository corretoraRepository = BeanUtil.getBean(CorretoraRepository.class);
        List<Corretora> listCorretora = corretoraRepository.findAll();
        
        //Limpados dados da tabela.
        TableUtil.emptyTable(this.corretorasJTable);
        
        //Populando a tabela.
        for(Corretora corretora : listCorretora){
            
            Vector<String> aux = new Vector<>();
            aux.add(String.valueOf(corretora.getId()));
            aux.add((String) corretora.getName());
            aux.add(corretora.isActive() ? "Ativa" : "Desativada");
            
            TableUtil.addLine(this.corretorasJTable, aux);
        }
    }
    
    
    /**
     * Método responsável por garantir que um JInternalFrame será fechado e 
     * desalocado da memória.     
     */
    @Override
    public void closeAndDeallocateMemoryFrame() {
        
        ViewUtil.closeAndDeallocateMemoryFrame(this, this.refMain);
    }

}
