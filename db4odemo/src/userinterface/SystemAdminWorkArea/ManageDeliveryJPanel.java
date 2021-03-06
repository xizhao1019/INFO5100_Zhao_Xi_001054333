/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Area.Area;
import Business.CityRestaurant.CityRestaurant;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaoxi
 */
public class ManageDeliveryJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    private DeliveryMan deliveryMan;
    /**
     * Creates new form ManageCustomerJPanel
     */
    public ManageDeliveryJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateAreaCityComboBox();
        populateTable();
    }
    
    private void populateAreaCityComboBox(){
        areaComboBox.removeAllItems();
        cityNameComboBox.removeAllItems();
        
        for (Area area : system.getAreaList()){
            areaComboBox.addItem(area);
        }
        
        for (CityRestaurant.CityName cityname : CityRestaurant.CityName.values()) {
            cityNameComboBox.addItem(cityname);
        }
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) dmTable.getModel();
        Area area = (Area) areaComboBox.getSelectedItem();
        deliveryMan = area.getDeliveryManDirectory();
        model.setRowCount(0);
            for (UserAccount userAccount : deliveryMan.getUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[5];
                row[0] = area;
                row[1] = cityNameComboBox.getSelectedItem();
                row[2] = userAccount.getEmployee().getName();
                row[3] = userAccount;
                row[4] = userAccount.getPassword();

                model.addRow(row);
            }
    }
    
    
    private boolean isValidDeliveryManName(){
        String regex = "^[a-zA-Z]+$";
        Pattern p = Pattern.compile(regex);
        if (txtDeliveryName.getText() == null) {
            return false;
        }
        Matcher m = p.matcher(txtDeliveryName.getText());
        return m.matches();
    }
    
    private boolean isValidUserName() {
        String regex = "^[aA-zZ0-9]+$";
        Pattern p = Pattern.compile(regex);
        if (txtUsername.getText() == null) {
            return false;
        }
        Matcher m = p.matcher(txtUsername.getText());
        return m.matches();
    }
    
    private boolean isValidPassword() {
        String regex = "^(?=.*[0-9])" + "(?=.*[aA-zZ])" + ".{5,}$";
        Pattern p = Pattern.compile(regex);
        if (txtPassword.getText() == null) {
            return false;
        }
        Matcher m = p.matcher(txtPassword.getText());
        return m.matches();
    }
    
    private boolean isUniqueUsername() {
        boolean unique = true;
        Area area = (Area) areaComboBox.getSelectedItem();
        for (UserAccount ua : area.getDeliveryManDirectory().getUserAccountDirectory().getUserAccountList()) {
            if (txtUsername.getText().equals(ua.getUsername())) {
                unique = false;
                break;
            }
        }
        return unique;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dmTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDeliveryName = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cityNameComboBox = new javax.swing.JComboBox();
        areaComboBox = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        dmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Area", "City", "DeliveryMan", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dmTable);
        if (dmTable.getColumnModel().getColumnCount() > 0) {
            dmTable.getColumnModel().getColumn(0).setResizable(false);
            dmTable.getColumnModel().getColumn(0).setPreferredWidth(110);
            dmTable.getColumnModel().getColumn(1).setResizable(false);
            dmTable.getColumnModel().getColumn(1).setPreferredWidth(70);
            dmTable.getColumnModel().getColumn(2).setResizable(false);
            dmTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            dmTable.getColumnModel().getColumn(3).setResizable(false);
            dmTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            dmTable.getColumnModel().getColumn(4).setResizable(false);
            dmTable.getColumnModel().getColumn(4).setPreferredWidth(70);
        }

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Username");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("DeliveryMan Name");

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Area");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("City");

        cityNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        areaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(submitJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername)
                                    .addComponent(txtDeliveryName)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(backJButton)
                    .addGap(486, 486, 486)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cityNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeliveryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(btnDelete))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(backJButton)
                    .addGap(420, 420, 420)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String dmanName = txtDeliveryName.getText();
        
        if (username.trim().equals("") || password.trim().equals("") || dmanName.trim().equals("")) {
           JOptionPane.showMessageDialog(null, "Invalid Input!");
        }
        else if (!isValidDeliveryManName()) {
            JOptionPane.showMessageDialog(null, "Invalid deliveryman name!");
        }
        else if (!isValidUserName()) {
            JOptionPane.showMessageDialog(null, "Invalid username!");
        }
        else if (!isUniqueUsername()) {
            JOptionPane.showMessageDialog(null, "Username should be unique!");
        }
        else if (!isValidPassword()) {
            JOptionPane.showMessageDialog(null, "Password should be at least 5 digits, with at least one letter and one digit.");
        }
        else{
            Area area = (Area) areaComboBox.getSelectedItem();
            deliveryMan = area.getDeliveryManDirectory();
            Employee employee = deliveryMan.getEmployeeDirectory().createEmployee(dmanName);
            UserAccount dmanaccount = deliveryMan.getUserAccountDirectory().createUserAccount(username,password,employee,new DeliverManRole());
            populateTable();
            txtUsername.setText("");
            txtPassword.setText("");
            txtDeliveryName.setText("");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = dmTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select an account!");
            return;
        }
        Area area = (Area) dmTable.getValueAt(row, 0);
        UserAccount ua = (UserAccount) dmTable.getValueAt(row, 3);
        boolean remove = area.getDeliveryManDirectory().getUserAccountDirectory().getUserAccountList().remove(ua);
        if (remove) {
            populateTable();
            JOptionPane.showMessageDialog(null, "Successfully deleted!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox areaComboBox;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox cityNameComboBox;
    private javax.swing.JTable dmTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtDeliveryName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
