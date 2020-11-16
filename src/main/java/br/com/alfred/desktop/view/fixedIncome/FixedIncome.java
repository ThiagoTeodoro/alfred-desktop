/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alfred.desktop.view.fixedIncome;

import br.com.alfred.desktop.utils.ViewUtil;
import br.com.alfred.desktop.view.interfaces.IDataViewer;
import javax.swing.JDesktopPane;

/**
 *
 * @author thiag
 */
public class FixedIncome extends javax.swing.JInternalFrame implements IDataViewer {

    private JDesktopPane refMain;
    
    /**
     * Creates new form FixedIncomeManager
     */
    public FixedIncome(JDesktopPane refMain) {
        
        //Init
        initComponents();
        
        //RefMain
        this.refMain = refMain;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        insertJMenu = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Renda Fixa");
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

        insertJMenu.setText("Inserir");
        jMenuBar.add(insertJMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        
        this.closeAndDeallocateMemoryFrame();
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu insertJMenu;
    private javax.swing.JMenuBar jMenuBar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void reloadMainTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closeAndDeallocateMemoryFrame() {
        
        ViewUtil.closeAndDeallocateMemoryFrame(this, refMain);
    }
}
