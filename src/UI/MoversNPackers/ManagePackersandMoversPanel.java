/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MoversNPackers;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nemod
 */
public class ManagePackersandMoversPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePackerJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;
    
    public ManagePackersandMoversPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = useraccount;
        this.enterprise = enterprise;
        populateReqTable(); 
        
    }
    
    public void populateReqTable() {
        getname.setText(userAccount.getName());
        getCost.setText(userAccount.getCost());
        getcity.setText(userAccount.getCity());
        getavailibility.setText(userAccount.getAvail());
        getzipcode.setText(userAccount.getZip());
        getaddress.setText(userAccount.getAddress());
        getmailid.setText(userAccount.getMailId());
        getcontactnumber.setText(userAccount.getContactnumber());
        getstate.setText(userAccount.getState());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnsubmit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblsubtitle = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        lblcontactno = new javax.swing.JLabel();
        getcontactnumber = new javax.swing.JTextField();
        lbladdress = new javax.swing.JLabel();
        getaddress = new javax.swing.JTextField();
        lblcity = new javax.swing.JLabel();
        getcity = new javax.swing.JTextField();
        lblstate = new javax.swing.JLabel();
        getstate = new javax.swing.JTextField();
        lblmailid = new javax.swing.JLabel();
        getmailid = new javax.swing.JTextField();
        lblzipcode = new javax.swing.JLabel();
        getzipcode = new javax.swing.JTextField();
        lblavail = new javax.swing.JLabel();
        getavailibility = new javax.swing.JTextField();
        lblprice = new javax.swing.JLabel();
        getCost = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(44, 68, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnsubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 110, 50));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        lblsubtitle.setBackground(new java.awt.Color(255, 255, 255));
        lblsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblsubtitle.setText("PACKERS AND MOVERS PAGE");
        lblsubtitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblname.setText("Name:");

        getname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblcontactno.setBackground(new java.awt.Color(255, 255, 255));
        lblcontactno.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcontactno.setText("Contact No:");

        getcontactnumber.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getcontactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getcontactnumberActionPerformed(evt);
            }
        });

        lbladdress.setBackground(new java.awt.Color(255, 255, 255));
        lbladdress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbladdress.setText("Address:");

        getaddress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblcity.setBackground(new java.awt.Color(255, 255, 255));
        lblcity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcity.setText("City:");

        getcity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblstate.setBackground(new java.awt.Color(255, 255, 255));
        lblstate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblstate.setText("State:");

        getstate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblmailid.setBackground(new java.awt.Color(255, 255, 255));
        lblmailid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblmailid.setText("Email:");

        getmailid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblzipcode.setBackground(new java.awt.Color(255, 255, 255));
        lblzipcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblzipcode.setText("Zipcode:");

        getzipcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblavail.setBackground(new java.awt.Color(255, 255, 255));
        lblavail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblavail.setText("Availability:");

        getavailibility.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblprice.setBackground(new java.awt.Color(255, 255, 255));
        lblprice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblprice.setText("Price:");

        getCost.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsubtitle)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcontactno)
                                    .addComponent(lbladdress)
                                    .addComponent(lblname)
                                    .addComponent(lblcity)
                                    .addComponent(lblstate)))
                            .addComponent(lblzipcode)
                            .addComponent(lblmailid)
                            .addComponent(lblavail)
                            .addComponent(lblprice))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(getname, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(getcontactnumber)
                            .addComponent(getaddress)
                            .addComponent(getcity)
                            .addComponent(getstate)
                            .addComponent(getzipcode)
                            .addComponent(getmailid)
                            .addComponent(getavailibility)
                            .addComponent(getCost))))
                .addContainerGap(591, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblsubtitle)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontactno)
                    .addComponent(getcontactnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladdress)
                    .addComponent(getaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcity)
                    .addComponent(getcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstate)
                    .addComponent(getstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblzipcode)
                    .addComponent(getzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmailid)
                    .addComponent(getmailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblavail)
                    .addComponent(getavailibility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprice)
                    .addComponent(getCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1200, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        lbltitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbltitle.setText("HOUSE RENTALS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(709, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getcontactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getcontactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getcontactnumberActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
       if(system.isVoid(getname.getText()) || system.isVoid(getCost.getText()) || system.isVoid(getcity.getText())
           || system.isVoid(getavailibility.getText()) || system.isVoid(getzipcode.getText()) || system.isVoid(getaddress.getText())
           || system.isVoid(getmailid.getText()) || system.isVoid(getcontactnumber.getText()) || system.isVoid(getstate.getText())){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
            return;
        }else if(!system.isDouble(getCost.getText())){
            JOptionPane.showMessageDialog(null, "Please enter valid charge!");
            return;
        }else if(!system.isInt(getzipcode.getText()) || getzipcode.getText().length() != 5){
            JOptionPane.showMessageDialog(null, "Please enter valid 5 digit zipcode!");
            return;
        }else if(!system.verifyContactFormat(getcontactnumber.getText())){
            return;
        }else if(!system.verifyMailFormat(getmailid.getText())){
            return;
        }else if(!system.verifySameMail(getmailid.getText(), userAccount.getUserName())){
            return;
        }else if(!system.verifySameContact(getcontactnumber.getText(), userAccount.getUserName())){
            return;
        }
        userAccount.setName(getname.getText());
        userAccount.setCost(getCost.getText());
        userAccount.setCity(getcity.getText());
        userAccount.setAvail(getavailibility.getText());
        userAccount.setZip(getzipcode.getText());
        userAccount.setAddress(getaddress.getText());
        userAccount.setMailId(getmailid.getText());
        userAccount.setContactnumber(getcontactnumber.getText());
        userAccount.setState(getstate.getText());
        JOptionPane.showMessageDialog(null, "Profile Updated Successfully!");
     
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void getCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getCostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsubmit;
    private javax.swing.JTextField getCost;
    private javax.swing.JTextField getaddress;
    private javax.swing.JTextField getavailibility;
    private javax.swing.JTextField getcity;
    private javax.swing.JTextField getcontactnumber;
    private javax.swing.JTextField getmailid;
    private javax.swing.JTextField getname;
    private javax.swing.JTextField getstate;
    private javax.swing.JTextField getzipcode;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblavail;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcontactno;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblmailid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lblsubtitle;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblzipcode;
    // End of variables declaration//GEN-END:variables
}
