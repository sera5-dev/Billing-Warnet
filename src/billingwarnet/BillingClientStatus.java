/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingwarnet;

/**
 *
 * @author zak
 */
public class BillingClientStatus extends javax.swing.JPanel {

    /**
     * Creates new form BillingClientStatus
     */
    public BillingClientStatus() {
        initComponents();
    }
    
    public void setDisplayedStatus(String user, String time, String harga)
    {
        clientName.setText(user);
        clientWaktu.setText(time);
        clientHarga.setText(harga);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientName = new javax.swing.JLabel();
        clientWaktu = new javax.swing.JLabel();
        clientHarga = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(150, 150));

        clientName.setText("Nama");

        clientWaktu.setText("Waktu");

        clientHarga.setText("Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientWaktu)
                    .addComponent(clientHarga))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientWaktu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(clientHarga)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel clientHarga;
    protected javax.swing.JLabel clientName;
    protected javax.swing.JLabel clientWaktu;
    // End of variables declaration//GEN-END:variables
}
