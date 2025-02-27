/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.ServiceDAO;
import dao.ServiceRoomDAO;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import model.Service;
import model.ServiceRoom;

/**
 *
 * @author phamn
 */
public class EditQuantityComponent extends javax.swing.JFrame {
    private int id;
    private int idBooking;
    private String name;
    private String price;
    private JLabel lblTotalPrice;
    private DefaultTableModel tableModel;
    private ServiceDAO serviceDAO = new ServiceDAO();
    private ServiceRoomDAO serviceRoomDAO = new ServiceRoomDAO();
    private int quantity = 1;
    private int selectedIndex;
    private NumberFormat numberFormat = 
            NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
    /**
     * Creates new form QuantityCompo
     */
    public EditQuantityComponent() {
        initComponents();
    }
    public EditQuantityComponent(int id,int idBooking,int selectedIndex,DefaultTableModel tableModel,int quantity,JLabel lblTotalPrice) {
        initComponents();
        setLocationRelativeTo(null);
        this.id = id;
        this.name = name;
        this.price = price;
        this.selectedIndex = selectedIndex;
        this.tableModel = tableModel;
        this.idBooking = idBooking;
        this.quantity = quantity;
        this.lblTotalPrice = lblTotalPrice;
        txtQuantity.setText(quantity+"");
        if(quantity == 1) {
            btnDiv.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnDiv = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nhập số lượng");

        txtQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDiv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDiv.setText("-");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnSubmit.setText("OK");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlus)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDiv)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDiv)
                        .addComponent(btnPlus))
                    .addComponent(txtQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
         ServiceRoom serviceRoom = serviceRoomDAO.selectById(id);
                        tableModel.setValueAt(Integer.parseInt(txtQuantity.getText()), selectedIndex, 2);
                        updateTotal(selectedIndex, tableModel);
                        serviceRoom.setQuantity(Integer.parseInt(txtQuantity.getText()));
                        serviceRoomDAO.update(serviceRoom);
                        updateTotalPriceAll();
                dispose();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        if(quantity == 1) {
            btnDiv.setEnabled(false);
        } else {
            quantity = --quantity;
            txtQuantity.setText(quantity+"");
        }
        
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
        btnDiv.setEnabled(true);
        quantity = ++quantity;
        txtQuantity.setText(quantity+"");
    }//GEN-LAST:event_btnPlusActionPerformed

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
            java.util.logging.Logger.getLogger(EditQuantityComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuantityComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuantityComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuantityComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQuantityComponent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
        private void updateTotal(int row, DefaultTableModel tableModel) {
            ServiceRoom serviceRoom = serviceRoomDAO.selectById(id);
         Service service = serviceDAO.selectById(serviceRoom.getIdService());
            int quantity = Integer.parseInt(txtQuantity.getText());
            float total =  service.getPrice() * quantity;
            tableModel.setValueAt(numberFormat.format(total), row, 3); 
        }
    private void updateTotalPriceAll() {
        float totalPriceAll = 0;
        List<ServiceRoom> serviceRooms = serviceRoomDAO.selectServiceRoomByIdBooking(idBooking);
        for (ServiceRoom sr : serviceRooms) {
                        Service sv = serviceDAO.selectById(sr.getIdService());
                        totalPriceAll += (sr.getQuantity()*sv.getPrice());
        
                    }
                    lblTotalPrice.setText(numberFormat.format(totalPriceAll));
    }
}
