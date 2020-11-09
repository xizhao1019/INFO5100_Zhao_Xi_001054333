/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.CityRestaurant.CityRestaurant;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.Order.Order;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
      
        
        populateTable();
    }
    
    public void populateTable(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDelivered = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order No.", "OrderDate", "Restaurant", "Receiver", "Items", "Price", "Status", "Delivered Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
            orderTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            orderTable.getColumnModel().getColumn(1).setResizable(false);
            orderTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            orderTable.getColumnModel().getColumn(2).setResizable(false);
            orderTable.getColumnModel().getColumn(2).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(3).setResizable(false);
            orderTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(4).setResizable(false);
            orderTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            orderTable.getColumnModel().getColumn(5).setResizable(false);
            orderTable.getColumnModel().getColumn(5).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(6).setResizable(false);
            orderTable.getColumnModel().getColumn(6).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(7).setResizable(false);
            orderTable.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 670, 130));

        btnAssign.setText("Assign to me");
        btnAssign.setPreferredSize(new java.awt.Dimension(120, 30));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 110, -1));

        btnRefresh.setText("Refresh");
        btnRefresh.setPreferredSize(new java.awt.Dimension(120, 30));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DeliveryMan Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        btnDelivered.setText("Delivered");
        btnDelivered.setPreferredSize(new java.awt.Dimension(120, 30));
        btnDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveredActionPerformed(evt);
            }
        });
        add(btnDelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = orderTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        Order order = (Order)orderTable.getValueAt(selectedRow, 0);
        order.setDeliveryMan(userAccount);
        order.setStatus("Delivering");
        populateTable();
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveredActionPerformed
        
    }//GEN-LAST:event_btnDeliveredActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnDelivered;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables
}
