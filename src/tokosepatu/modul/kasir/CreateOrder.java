/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tokosepatu.modul.kasir;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.Koneksi;

/**
 *
 * @author asusl
 */
public class CreateOrder extends javax.swing.JFrame {

    /**
     * Creates new form Create
     */
    public CreateOrder() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);

        selectProduct();
    }

    double harga_barang;
    
    private void selectProduct() {
        try {
            Statement statement = (Statement) Koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM tb_barang");
            while (res.next()) {
                harga_barang = res.getDouble("harga");
                produkSelect.addItem(res.getString("id").toUpperCase() + " - " + res.getString("nama_barang"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createOrderPanel = new javax.swing.JPanel();
        panelTitle1 = new javax.swing.JLabel();
        btnNewOrder = new javax.swing.JButton();
        labelProduk = new javax.swing.JLabel();
        produkSelect = new javax.swing.JComboBox<>();
        qtyLabel = new javax.swing.JLabel();
        qtyField = new javax.swing.JTextField();
        metodeBayar = new javax.swing.JLabel();
        metodeBayarSelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createOrderPanel.setBackground(new java.awt.Color(241, 245, 249));
        createOrderPanel.setPreferredSize(new java.awt.Dimension(852, 600));

        panelTitle1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        panelTitle1.setText("Buat Orderan");

        btnNewOrder.setBackground(new java.awt.Color(59, 130, 246));
        btnNewOrder.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnNewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnNewOrder.setText("Buat Orderan");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });

        labelProduk.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        labelProduk.setText("Produk");

        produkSelect.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        produkSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkSelectActionPerformed(evt);
            }
        });

        qtyLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyLabel.setText("Jumlah");

        qtyField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        qtyField.setToolTipText("");
        qtyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyFieldActionPerformed(evt);
            }
        });

        metodeBayar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        metodeBayar.setText("Metode Pembayaran");

        metodeBayarSelect.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        metodeBayarSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Dana", "ShopeePay", "Link Aja", "Gopay" }));
        metodeBayarSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodeBayarSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createOrderPanelLayout = new javax.swing.GroupLayout(createOrderPanel);
        createOrderPanel.setLayout(createOrderPanelLayout);
        createOrderPanelLayout.setHorizontalGroup(
            createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createOrderPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addComponent(panelTitle1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(createOrderPanelLayout.createSequentialGroup()
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(qtyLabel)
                                .addComponent(labelProduk))
                            .addGroup(createOrderPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(metodeBayar)))
                        .addGap(40, 40, 40)
                        .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(metodeBayarSelect, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNewOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(produkSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 74, Short.MAX_VALUE))))
        );
        createOrderPanelLayout.setVerticalGroup(
            createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createOrderPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(panelTitle1)
                .addGap(103, 103, 103)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProduk)
                    .addComponent(produkSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyLabel))
                .addGap(41, 41, 41)
                .addGroup(createOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metodeBayarSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metodeBayar))
                .addGap(35, 35, 35)
                .addComponent(btnNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        // TODO add your handling code here:
        try {
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO tb_transaksi(id_barang, qty, total_bayar, metode_pembayaran) values(?,?,?,?)");

            String[] value = produkSelect.getSelectedItem().toString().split(" - ");
            String produk = value[0].toLowerCase();
            stmt.setString(1, produk);

            int qty = Integer.parseInt(qtyField.getText());
            stmt.setInt(2, qty);

            double total_bayar = qty * harga_barang;
            stmt.setDouble(3, total_bayar);

            String bayar = metodeBayarSelect.getSelectedItem().toString();
            int metode = 0;

            if (bayar == "Cash") {
                metode = 1;
            } else if (bayar == "Dana") {
                metode = 2;
            } else if (bayar == "ShopeePay") {
                metode = 3;
            } else if (bayar == "Link Aja") {
                metode = 4;
            } else if (bayar == "Gopay") {
                metode = 5;
            }

            stmt.setInt(4, metode);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Orderan berhasil dibuat", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void qtyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyFieldActionPerformed

    private void metodeBayarSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodeBayarSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metodeBayarSelectActionPerformed

    private void produkSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkSelectActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JPanel createOrderPanel;
    private javax.swing.JLabel labelProduk;
    private javax.swing.JLabel metodeBayar;
    private javax.swing.JComboBox<String> metodeBayarSelect;
    private javax.swing.JLabel panelTitle1;
    private javax.swing.JComboBox<String> produkSelect;
    private javax.swing.JTextField qtyField;
    private javax.swing.JLabel qtyLabel;
    // End of variables declaration//GEN-END:variables
}
