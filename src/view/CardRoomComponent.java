/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.RoomDAO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import model.Room;

/**
 *
 * @author phamn
 */
public class CardRoomComponent extends javax.swing.JPanel {
    String id;
    String nameCustomer;
    ImageIcon icon;
    String kindOfRoom;
    Color background;
    private List<Room> rooms = new ArrayList<>();
    private RoomDAO roomDAO = new RoomDAO();
    /**
     * Creates new form CardRoomPnl
     */
    public CardRoomComponent() {
        initComponents();
    }
//    public CardRoomComponent(int status) {
//        initComponents();
//        rooms = roomDAO.selectAll();
//            if(room.getStatus() == 0) {
//                lblID.setText(id);
//                lblKofRoom.setText(kindOfRoom);
//                lblIcon.setIcon(icon);
//                lblPrice.setText(price);
//                lblCustomer.setText(nameCustomer);
//                this.setBackground(backColor);
//            }
//    }
    public CardRoomComponent(String id,String kindOfRoom, String nameCustomer,int status) {
        initComponents();
        lblID.setText(id);
        lblKofRoom.setText(kindOfRoom);
        lblCustomer.setText(nameCustomer);
        if(status == 0) {
            this.setBackground(new Color(102,255,102));
        } else if(status == 1) {
            this.setBackground(new Color(255,51,51));
        } else if(status == 2) {
            this.setBackground(new Color(255,255,0));
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

        lblID = new javax.swing.JLabel();
        lblKofRoom = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 255, 102));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setPreferredSize(new java.awt.Dimension(270, 153));

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 0, 0));
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setText("P101");

        lblKofRoom.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblKofRoom.setForeground(new java.awt.Color(0, 0, 0));
        lblKofRoom.setText("Đơn");

        lblCustomer.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCustomer.setForeground(new java.awt.Color(0, 0, 0));
        lblCustomer.setText("Khách hàng: Nguyễn Văn A");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblKofRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKofRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lblCustomer)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblKofRoom;
    // End of variables declaration//GEN-END:variables
}
