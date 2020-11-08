

package userinterface.RestaurantAdminRole;


import Business.Restaurant.RestaurantAdmin;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class RestaurantWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    
    /** Creates new form AdminWorkAreaJPanel */
    public RestaurantWorkAreaJPanel(JPanel userProcessContainer,UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        valueLabel.setText(account.getUsername());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManagerMenu = new javax.swing.JButton();
        btnManageOrder = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Reataurant Adminstrative Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnManagerMenu.setText("Manage menu");
        btnManagerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerMenuActionPerformed(evt);
            }
        });
        add(btnManagerMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, -1));

        btnManageOrder.setText("Manage Orders");
        btnManageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrderActionPerformed(evt);
            }
        });
        add(btnManageOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel.setText("Restaurant Admin:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerMenuActionPerformed
        ManageMenuJPanel manageMenuJPanel=new ManageMenuJPanel(userProcessContainer,new RestaurantAdmin());
        userProcessContainer.add("ManageMenuJPanel",manageMenuJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagerMenuActionPerformed

    private void btnManageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrderActionPerformed

    }//GEN-LAST:event_btnManageOrderActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrder;
    private javax.swing.JButton btnManagerMenu;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
