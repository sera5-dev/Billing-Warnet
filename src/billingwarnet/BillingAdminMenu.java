/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingwarnet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author zak
 */
public class BillingAdminMenu extends javax.swing.JPanel {

    /**
     * Creates new form BillingAdminMenu
     */
    public BillingAdminMenu() {
        initComponents();
        //setPanelGroup();
    }

    public void setPanelGroup()
    {
        BillingClientStatus Com1 = new BillingClientStatus();
        BillingClientStatus Com2 = new BillingClientStatus();
        BillingClientStatus Com3 = new BillingClientStatus();
        BillingClientStatus Com4 = new BillingClientStatus();
        BillingClientStatus Com5 = new BillingClientStatus();
        BillingClientStatus Com6 = new BillingClientStatus();
        BillingClientStatus Com7 = new BillingClientStatus();
        BillingClientStatus Com8 = new BillingClientStatus();
        
        innerPanel.add(Com1);
        Com1.setLocation(150, 150);
        innerPanel.add(Com2);
        Com2.setLocation(300, 150);
        innerPanel.add(Com3);
        Com3.setLocation(450, 150);
        innerPanel.add(Com4);
        Com4.setLocation(150, 300);
        innerPanel.add(Com5);
        Com5.setLocation(300, 300);
        innerPanel.add(Com6);
        Com6.setLocation(450, 300);
        innerPanel.add(Com7);
        Com7.setLocation(150, 450);
        innerPanel.add(Com8);
        Com8.setLocation(300, 450);
        
        Com1.setVisible(true);
        Com2.setVisible(true);
        Com3.setVisible(true);
        Com4.setVisible(true);
        Com5.setVisible(true);
        Com6.setVisible(true);
        Com7.setVisible(true);
        Com8.setVisible(true);
        
        this.add(innerPanel);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        innerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 480));

        innerPanel.setPreferredSize(new java.awt.Dimension(450, 400));

        javax.swing.GroupLayout innerPanelLayout = new javax.swing.GroupLayout(innerPanel);
        innerPanel.setLayout(innerPanelLayout);
        innerPanelLayout.setHorizontalGroup(
            innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        innerPanelLayout.setVerticalGroup(
            innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jLabel1.setText("This is admin menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(innerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(innerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel innerPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
