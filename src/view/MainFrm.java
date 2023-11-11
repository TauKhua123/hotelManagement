/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author phamn
 */
public class MainFrm extends javax.swing.JFrame {

    /**
     * Creates new form MainFrm
     */
    public MainFrm() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panelTrai = new javax.swing.JPanel();
        btnLogout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnBooking = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnRoom = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnInvoice = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btnStatictics = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnService = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnStaff = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnAccount = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblOclock = new javax.swing.JLabel();
        view = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        panelTrai.setBackground(new java.awt.Color(54, 33, 89));
        panelTrai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setBackground(new java.awt.Color(64, 43, 100));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnLogout.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Logout");
        btnLogout.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 70, 30));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout (1).png"))); // NOI18N
        btnLogout.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 60));

        panelTrai.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 300, 60));

        btnBooking.setBackground(new java.awt.Color(85, 65, 118));
        btnBooking.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                btnBookingAncestorRemoved(evt);
            }
        });
        btnBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookingMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBookingMousePressed(evt);
            }
        });
        btnBooking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnBooking.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Đặt phòng");
        btnBooking.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 130, 30));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/booking_1.png"))); // NOI18N
        btnBooking.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 60));

        panelTrai.add(btnBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 60));

        btnRoom.setBackground(new java.awt.Color(64, 43, 100));
        btnRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRoomMousePressed(evt);
            }
        });
        btnRoom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnRoom.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phòng");
        btnRoom.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 30));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/twin-beds.png"))); // NOI18N
        btnRoom.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 60));

        panelTrai.add(btnRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, 60));

        btnInvoice.setBackground(new java.awt.Color(64, 43, 100));
        btnInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInvoiceMousePressed(evt);
            }
        });
        btnInvoice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnInvoice.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 70));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hóa đơn");
        btnInvoice.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 30));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/invoice.png"))); // NOI18N
        btnInvoice.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 60));

        panelTrai.add(btnInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 300, 60));

        btnStatictics.setBackground(new java.awt.Color(64, 43, 100));
        btnStatictics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStaticticsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnStaticticsMousePressed(evt);
            }
        });
        btnStatictics.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnStatictics.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 70));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Thống kê");
        btnStatictics.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, 30));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/statistics.png"))); // NOI18N
        btnStatictics.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 60));

        panelTrai.add(btnStatictics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 300, 60));
        panelTrai.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        panelTrai.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/a (3) (Custom) (Custom) (Custom).png"))); // NOI18N
        panelTrai.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 120));

        btnService.setBackground(new java.awt.Color(64, 43, 100));
        btnService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnServiceMousePressed(evt);
            }
        });
        btnService.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnService.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 70));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Dịch vụ");
        btnService.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 30));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hotel-bell.png"))); // NOI18N
        btnService.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 60));

        panelTrai.add(btnService, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 300, 60));

        btnCustomer.setBackground(new java.awt.Color(64, 43, 100));
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCustomerMousePressed(evt);
            }
        });
        btnCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnCustomer.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 70));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Khách hàng");
        btnCustomer.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 30));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tourist.png"))); // NOI18N
        btnCustomer.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 60));

        panelTrai.add(btnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 300, 60));

        btnStaff.setBackground(new java.awt.Color(64, 43, 100));
        btnStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnStaffMousePressed(evt);
            }
        });
        btnStaff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnStaff.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Nhân viên");
        btnStaff.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 30));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/staff.png"))); // NOI18N
        btnStaff.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 60));

        panelTrai.add(btnStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 300, 60));

        btnAccount.setBackground(new java.awt.Color(64, 43, 100));
        btnAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccountMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAccountMousePressed(evt);
            }
        });
        btnAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnAccount.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 70));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Tài khoản");
        btnAccount.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 140, 30));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account.png"))); // NOI18N
        btnAccount.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 60));

        panelTrai.add(btnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 300, 60));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Xin chào:  ");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        lblOclock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOclock.setForeground(new java.awt.Color(255, 255, 255));
        lblOclock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clock.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addComponent(lblOclock, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 924, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(38, 38, 38)
                .addComponent(lblOclock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTrai, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTrai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked

    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnBookingAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnBookingAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBookingAncestorRemoved

    private void btnBookingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMousePressed
        setView(new RoomsFrm());
        resetColor();
        setColor(btnBooking);
    }//GEN-LAST:event_btnBookingMousePressed

    private void btnRoomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRoomMousePressed
        setView(new RoomMangementFrm());
        resetColor();
        setColor(btnRoom);
    }//GEN-LAST:event_btnRoomMousePressed

    private void btnInvoiceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceMousePressed
        setView(new RoomsFrm());
        resetColor();
        setColor(btnInvoice);
    }//GEN-LAST:event_btnInvoiceMousePressed

    private void btnStaticticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaticticsMouseClicked
    }//GEN-LAST:event_btnStaticticsMouseClicked

    private void btnStaticticsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaticticsMousePressed
        setView(new RoomsFrm());
        resetColor();
        setColor(btnStatictics);
    }//GEN-LAST:event_btnStaticticsMousePressed

    private void btnBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseClicked
        // TODO add your handling code here
//        setView(new RoomsFrm());
    }//GEN-LAST:event_btnBookingMouseClicked

    private void btnServiceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnServiceMousePressed
        // TODO add your handling code here:
        setView(new RoomsFrm());
        resetColor();
        setColor(btnService);
    }//GEN-LAST:event_btnServiceMousePressed

    private void btnCustomerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMousePressed
        // TODO add your handling code here:
        setView(new RoomsFrm());
        resetColor();
        setColor(btnCustomer);
    }//GEN-LAST:event_btnCustomerMousePressed

    private void btnStaffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStaffMousePressed
        // TODO add your handling code here:
        setView(new RoomsFrm());
        resetColor();
        setColor(btnStaff);

    }//GEN-LAST:event_btnStaffMousePressed

    private void btnAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAccountMouseClicked

    private void btnAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountMousePressed
        // TODO add your handling code here:
        setView(new RoomsFrm());
        resetColor();
        setColor(btnAccount);
                
    }//GEN-LAST:event_btnAccountMousePressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new MainFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAccount;
    private javax.swing.JPanel btnBooking;
    private javax.swing.JPanel btnCustomer;
    private javax.swing.JPanel btnInvoice;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnRoom;
    private javax.swing.JPanel btnService;
    private javax.swing.JPanel btnStaff;
    private javax.swing.JPanel btnStatictics;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblOclock;
    private javax.swing.JPanel panelTrai;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables

    private void setView(JPanel panel) {
        view.removeAll();
        view.setLayout(new BorderLayout());
        view.add(panel);
        view.validate();
        view.repaint();
    }
    void setColor(JPanel jpanel) {
        jpanel.setBackground(new Color(85, 65, 118));
    }
    void resetColor() {
        btnAccount.setBackground(new Color(64, 43, 100));
        btnBooking.setBackground(new Color(64, 43, 100));
        btnCustomer.setBackground(new Color(64, 43, 100));
        btnInvoice.setBackground(new Color(64, 43, 100));
        btnRoom.setBackground(new Color(64, 43, 100));
        btnService.setBackground(new Color(64, 43, 100));
        btnStaff.setBackground(new Color(64, 43, 100));
        btnStatictics.setBackground(new Color(64, 43, 100));
    }

    private void init() {
        setLocationRelativeTo(null);
        onOclock();
        setView(new RoomsFrm());
    }
    private void onOclock() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss aa");
                    Date now = new Date();
                    lblOclock.setText(dateFormat.format(now));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }
}
