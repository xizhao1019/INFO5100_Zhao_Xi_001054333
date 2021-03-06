/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author AEDSpring2019
 */
public class AdminCreateScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    private JPanel panelRight;
    private Admin admin;
    public AdminCreateScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPword = new javax.swing.JTextField();
        txtRePword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioCustomer = new javax.swing.JRadioButton();
        radioSupplier = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setText("username:");

        jLabel2.setText("password:");

        jLabel3.setText("re-enter password :");

        buttonGroup1.add(radioCustomer);
        radioCustomer.setText("Customer");

        buttonGroup1.add(radioSupplier);
        radioSupplier.setText("Supplier");

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioSupplier)
                                    .addComponent(radioCustomer)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String userName = txtUser.getText();
        String pw   = txtPword.getText();
        String rpw = txtRePword.getText();
        
        if (!textFieldValid()) {
            JOptionPane.showMessageDialog(null,"Invalid input!");
        }
        else{ 
            if (radioCustomer.isSelected()) {
                Customer c = new Customer(rpw,userName);
                admin.getCustDir().getCustomerList().add(c);
                c.setUserName(userName);
                c.setPassword(rpw);
                JOptionPane.showMessageDialog(null,"Account created successfully!");
                txtUser.setText("");
                txtPword.setText("");
                txtRePword.setText("");
                buttonGroup1.clearSelection();
                txtUser.setBorder(null);
                txtPword.setBorder(null); 
                txtRePword.setBorder(null);
            }
            else if (radioSupplier.isSelected()) {
                Supplier s = new Supplier(rpw,userName);
                admin.getSuppDir().getSupplierList().add(s);
                s.setUserName(userName);
                s.setPassword(rpw);
                JOptionPane.showMessageDialog(null,"Account created successfully!");
                txtUser.setText("");
                txtPword.setText("");
                txtRePword.setText("");
                buttonGroup1.clearSelection();
                txtUser.setBorder(null);
                txtPword.setBorder(null); 
                txtRePword.setBorder(null);
            }
            else JOptionPane.showMessageDialog(null,"Please select your role!");
            }
        
    }//GEN-LAST:event_btnCreateActionPerformed
    
    private boolean rePwordCheck(){
        boolean rePword = true;
        String pw   = txtPword.getText();
        String rpw = txtRePword.getText();
        if (!rpw.equals(pw)) {
            rePword = false;
        }
        return rePword;
    }
    
    
    private boolean inputUserNameCorrect(String s){
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+.@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(s);
        boolean input = m.matches();
        return input;
    }
    
    private boolean inputPwordCorrect(String s){
        Pattern p = Pattern.compile("^([a-z]*?[A-Z]*?[0-9]*?[$*#&]*?){6,}$");
        Matcher m = p.matcher(s);
        boolean input = m.matches();
        return input;
    }
    
    
    
    private boolean textFieldValid() {
        
        boolean validTextFields = true ;
        
        if (txtUser.getText().trim().equals("")||!inputUserNameCorrect(txtUser.getText())) {
            validTextFields = false;
            txtUser.setBorder(new LineBorder(Color.RED));              
         }
         else  txtUser.setBorder(null);
         
        if (txtPword.getText().trim().equals("")||!inputPwordCorrect(txtPword.getText())) {
            validTextFields = false;
            txtPword.setBorder(new LineBorder(Color.RED));
        }
        else txtPword.setBorder(null); 
           
        if (txtRePword.getText().trim().equals("")||!inputPwordCorrect(txtRePword.getText())) {
            validTextFields = false;
            txtRePword.setBorder(new LineBorder(Color.RED));
        }
        else txtRePword.setBorder(null);
        
        if (!rePwordCheck()) {
            validTextFields = false;
            txtPword.setBorder(new LineBorder(Color.RED));
            txtRePword.setBorder(new LineBorder(Color.RED));
        }
        else {
            txtPword.setBorder(null); 
            txtRePword.setBorder(null);
        }
        
        return validTextFields;
    }
    
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);
    }//GEN-LAST:event_btnBackActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.JRadioButton radioSupplier;
    private javax.swing.JTextField txtPword;
    private javax.swing.JTextField txtRePword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
