/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AEDSpring2019
 */
public class LoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginScreen
     */
    List<User> list;
    JPanel panelRight;
    User user;
    Admin admin;
    public LoginScreen(JPanel panelRight, Admin admin, List<User> list, ActionEvent evt) {
        initComponents();
        this.list = list;
        this.panelRight = panelRight;
        this.admin = admin;
        initialize(evt);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        comboUser = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JLabel();

        btnSubmit.setText("Login");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        comboUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTitle.setText("Supplier Login Screen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPword)
                            .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txtTitle)))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtTitle)
                .addGap(18, 18, 18)
                .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSubmit)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
      
        if (verify()) {
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add(new SuccessScreen(panelRight, user));
        layout.next(panelRight);
        }
        else JOptionPane.showMessageDialog(null,"Wrong username or password!");
        
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    private boolean verify(){
        boolean search = false;
        String pword = txtPword.getText();
        for (int i = 0; i < admin.getCustDir().getCustomerList().size(); i++) {
            if(pword.equals(admin.getCustDir().getCustomerList().get(i).getPassword())){
                search = true;
                break;
            }
        }
         for (int i = 0; i < admin.getSuppDir().getSupplierList().size(); i++) {
            if(pword.equals(admin.getSuppDir().getSupplierList().get(i).getPassword())){
                search = true;
                break;
            }
        }
        return search;
        
    }
    
    
    private void initialize(ActionEvent evt){
        //text should either be "Supplier Login Screen" OR "Customer Login Screen"
        //Based on the selection
        if (evt.getActionCommand().equals("Supplier")){
           txtTitle.setText("Supplier Login Screen");   
           comboUser.removeAllItems();
//           Admin admin = (Admin)user; 
//            admin = (Admin)user;
            for (int i = 0; i < admin.getSuppDir().getSupplierList().size(); i++) {
                comboUser.addItem(admin.getSuppDir().getSupplierList().get(i));
//                user = admin.getSuppDir().getSupplierList().get(i);
//                list.add(user);
            }
            
        }
        else if (evt.getActionCommand().equals("Customer")) {
           txtTitle.setText("Customer Login Screen"); 
            comboUser.removeAllItems();
//             admin = (Admin)user; 
            for (int i = 0; i <admin.getCustDir().getCustomerList().size() ; i++) {
                comboUser.addItem(admin.getCustDir().getCustomerList().get(i));
//                user = admin.getSuppDir().getSupplierList().get(i);
//                list.add(user);
            }
        }
        
        //only customer or suppliers should be listed based on the selection
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<Object> comboUser;
    private javax.swing.JTextField txtPword;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
