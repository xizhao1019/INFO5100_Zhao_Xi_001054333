/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Car;
import Business.ExcelRead;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaoxi
 */
public class ViewDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    private JPanel UserProcessJPanel;
    private Car car;
    
    public ViewDetailJPanel(JPanel UserProcessJPanel,Car car) {
        initComponents();
        this.UserProcessJPanel = UserProcessJPanel;
        this.car = car;
        showCarDetails();
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
        platetxt = new javax.swing.JTextField();
        modeltxt = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        brandtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        avaliabletimetxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        manufacturetxt = new javax.swing.JTextField();
        locationtxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        serialtxt = new javax.swing.JTextField();
        catalogtxt = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        maintenanceComboBox = new javax.swing.JComboBox<>();
        btnSeat5 = new javax.swing.JRadioButton();
        btnSeat7 = new javax.swing.JRadioButton();
        btnSeat9 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(880, 600));

        platetxt.setEnabled(false);

        modeltxt.setEnabled(false);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("<  Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View The Car Information");
        jLabel1.setToolTipText("");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Brand");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Model");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Plate Number");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Number of Seats");

        brandtxt.setEnabled(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Avaliable Time");

        avaliabletimetxt.setEnabled(false);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Location");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Serial Number");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Manufacture Year");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Maintenance Certification");

        manufacturetxt.setEnabled(false);

        locationtxt.setEnabled(false);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Fleet Catalog Updated Time");

        serialtxt.setEnabled(false);

        catalogtxt.setEnabled(false);

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        maintenanceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Valid", "Expired" }));
        maintenanceComboBox.setEnabled(false);

        buttonGroup1.add(btnSeat5);
        btnSeat5.setText("5");
        btnSeat5.setEnabled(false);

        buttonGroup1.add(btnSeat7);
        btnSeat7.setText("7");
        btnSeat7.setEnabled(false);

        buttonGroup1.add(btnSeat9);
        btnSeat9.setText("9");
        btnSeat9.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jLabel12.setText("(MM/DD/YY)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(platetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(modeltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(brandtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSeat5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSeat7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSeat9))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(avaliabletimetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(serialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(maintenanceComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(manufacturetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(catalogtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(brandtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modeltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(platetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSeat5)
                                .addComponent(btnSeat7)
                                .addComponent(btnSeat9)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avaliabletimetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufacturetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(serialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(maintenanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(catalogtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void showCarDetails(){
            brandtxt.setText(car.getBrand());
            modeltxt.setText(car.getModel());
            platetxt.setText(car.getPlatenumber());
            if (car.getSeat()== 5) {
                btnSeat5.setSelected(true);
            }
            if (car.getSeat()== 7) {
                btnSeat7.setSelected(true);
            }
            if (car.getSeat()== 9) {
                btnSeat9.setSelected(true);
            }
            avaliabletimetxt.setText(car.getAvaliableTime());
            manufacturetxt.setText(String.valueOf(car.getManufactureYear()));
            serialtxt.setText(car.getSerialnumber());
            locationtxt.setText(car.getLocation());
            catalogtxt.setText(car.getFleetcatalog());
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        UserProcessJPanel.remove(this);
        CardLayout layout = (CardLayout) UserProcessJPanel.getLayout();
        layout.next(UserProcessJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
            if(textFieldValid()){
                String brand = brandtxt.getText();
                String model = modeltxt.getText();
                String plateNumber = platetxt.getText();
                int seat = 0;
                if(btnSeat5.isSelected()){
                    seat = 5;
                };
                if(btnSeat7.isSelected()){
                    seat = 7;
                };
                if(btnSeat9.isSelected()){
                    seat = 9;
                };
                String avaliableTime = avaliabletimetxt.getText();
                String location = locationtxt.getText();
                String serialNumber = serialtxt.getText();
                int manufactureYear = Integer.parseInt(manufacturetxt.getText());
                String maintenance = String.valueOf(maintenanceComboBox.getSelectedItem());
                String catalog = catalogtxt.getText();

                car.setBrand(brand);
                car.setModel(model);
                car.setPlatenumber(plateNumber);
                car.setSeat(seat);
                car.setAvaliableTime(avaliableTime);
                car.setLocation(location);
                car.setSerialnumber(serialNumber);
                car.setManufactureYear(manufactureYear);
                car.setMaintenanceCertification(maintenance);
                car.setFleetcatalog(catalog);
                
                btnSave.setEnabled(false);
                btnUpdate.setEnabled(true);
                brandtxt.setEnabled(false);
                modeltxt.setEnabled(false);
                platetxt.setEnabled(false);
                btnSeat5.setEnabled(false);
                btnSeat7.setEnabled(false);
                btnSeat9.setEnabled(false);
                avaliabletimetxt.setEnabled(false);
                manufacturetxt.setEnabled(false);
                serialtxt.setEnabled(false);
                locationtxt.setEnabled(false);
                maintenanceComboBox.setEnabled(false);
                catalogtxt.setEnabled(false);

                JOptionPane.showMessageDialog(null, "Information updated successfully!");
            }
             else JOptionPane.showMessageDialog(null, "Invalid input!");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        brandtxt.setEnabled(true);
        modeltxt.setEnabled(true);
        platetxt.setEnabled(true);
        btnSeat5.setEnabled(true);
        btnSeat7.setEnabled(true);
        btnSeat9.setEnabled(true);
        avaliabletimetxt.setEnabled(true);
        manufacturetxt.setEnabled(true);
        serialtxt.setEnabled(true);
        locationtxt.setEnabled(true);
        maintenanceComboBox.setEnabled(true);
        catalogtxt.setEnabled(true);
        
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    private boolean inputletterCorrect(String s){
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        Matcher m = p.matcher(s);
        boolean input = m.matches();
        return input;
    }
    
    private boolean inputStringCorrect(String s){
        Pattern p = Pattern.compile("^[A-Z0-9]*$");
        Matcher m = p.matcher(s);
        boolean input = m.matches();
        return input;
    }
    
    private boolean inputTimeCorrect(String s){
        String regex = "^(2[0-4]|1[0-9]|[0-9]):[0-5][0-9]$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        boolean input = m.matches();
        return input;
    }
    
    private boolean inputYearCorrect(String s){
        String regex = "^(20[01][0-9])|(2020)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        boolean input = m.matches();
        return input;
    }
    
    private boolean inputDateCorrect(String s){
        String regex = "^(1[0-2]|[1-9])/(3[01]|[12][0-9]|[1-9])/[0-9]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        boolean input = m.matches();
        return input;
    }
    
     private boolean textFieldValid() {
        
        boolean validTextFields = true ;
        
        if (brandtxt.getText().isEmpty()||brandtxt.getText().trim().equals("")||!inputletterCorrect(brandtxt.getText())) {
            validTextFields = false;
            brandtxt.setBorder(new LineBorder(Color.RED));              
         }
        if (modeltxt.getText().isEmpty()||modeltxt.getText().trim().equals("")||!inputStringCorrect(modeltxt.getText())) {
            validTextFields = false;
            modeltxt.setBorder(new LineBorder(Color.RED));              
         }
        if (platetxt.getText().isEmpty()||platetxt.getText().trim().equals("")||!inputStringCorrect(platetxt.getText())) {
            validTextFields = false;
            platetxt.setBorder(new LineBorder(Color.RED));              
         }
        if ((btnSeat5.isSelected()==false) & (btnSeat7.isSelected()==false) & 
                    (btnSeat9.isSelected()==false)) {
            validTextFields = false;
            btnSeat5.setBorder(new LineBorder(Color.RED));
            btnSeat7.setBorder(new LineBorder(Color.RED)); 
            btnSeat9.setBorder(new LineBorder(Color.RED)); 
         }
        if (avaliabletimetxt.getText().isEmpty()||avaliabletimetxt.getText().trim().equals("")||!inputTimeCorrect(avaliabletimetxt.getText())) {
            validTextFields = false;
            avaliabletimetxt.setBorder(new LineBorder(Color.RED));              
         }
        if (manufacturetxt.getText().isEmpty()||manufacturetxt.getText().trim().equals("")||!inputYearCorrect(manufacturetxt.getText())) {
            validTextFields = false;
            manufacturetxt.setBorder(new LineBorder(Color.RED)); 
         }
        if (serialtxt.getText().isEmpty()||serialtxt.getText().trim().equals("")||!inputStringCorrect(serialtxt.getText())) {
            validTextFields = false;
            serialtxt.setBorder(new LineBorder(Color.RED)); 
         }
        if (locationtxt.getText().isEmpty()||locationtxt.getText().trim().equals("")||!inputletterCorrect(locationtxt.getText())) {
            validTextFields = false;
            locationtxt.setBorder(new LineBorder(Color.RED)); 
         }
        if (catalogtxt.getText().isEmpty()||catalogtxt.getText().trim().equals("")||!inputDateCorrect(catalogtxt.getText())) {
            validTextFields = false;
            catalogtxt.setBorder(new LineBorder(Color.RED)); 
         }
        return validTextFields;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avaliabletimetxt;
    private javax.swing.JTextField brandtxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JRadioButton btnSeat5;
    private javax.swing.JRadioButton btnSeat7;
    private javax.swing.JRadioButton btnSeat9;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField catalogtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField locationtxt;
    private javax.swing.JComboBox<String> maintenanceComboBox;
    private javax.swing.JTextField manufacturetxt;
    private javax.swing.JTextField modeltxt;
    private javax.swing.JTextField platetxt;
    private javax.swing.JTextField serialtxt;
    // End of variables declaration//GEN-END:variables

   
}
