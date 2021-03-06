/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Asset.Asset;
import Business.Asset.AssetDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UI.MerchantRole.MerchantRegistrationForm;
import java.awt.CardLayout;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class CustomerScreenPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerScreenPanel
     */
    private JPanel userPrcCont;
    private EcoSystem system;
    private UserAccount usrAccount;
    private AssetDirectory assetDirectory;
    private Enterprise enterprise;
    private Network network;
    private Organisation organisation;

    /**
     * Creates new form BuyerWorkAreaJpanel
     */
    public CustomerScreenPanel(JPanel userProcessContainer, UserAccount usrAccount, Enterprise enterprise, EcoSystem system, Network network, Organisation organisation) {
        initComponents();
        this.userPrcCont = userProcessContainer;
        this.network = network;
        this.enterprise = enterprise;
        this.organisation = organisation;
        this.system = system;
        this.usrAccount = usrAccount;
        this.assetDirectory = (system.getAssetDirectory()== null) ? new AssetDirectory() : system.getAssetDirectory();
        populateReqTable();
    }

    public void populateReqTable() {
        DefaultTableModel model = (DefaultTableModel) tblhouse.getModel();
        model.setRowCount(0);
        for (Asset asset : assetDirectory.getAssetList()) {
            Object[] row = new Object[12];
            row[0] = asset.getAssetID();
            row[1] = asset.getAssetName();
            row[2] = asset.getAddress();
            row[3] = asset.getCity();
            row[4] = asset.getState();
            row[5] = asset.getZip();
            row[6] = asset.getBedroom();
            row[7] = asset.getBaths();
            row[8] = asset.getCost();
            row[9] = asset.getAvail();
            row[10] = asset.getMerchant();
            row[11] = asset.getMerchant().getName();
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        btnrenthouse = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblassets = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhouse = new javax.swing.JTable();
        btnViewHouseOnMap = new javax.swing.JButton();
        hireSPBtn = new javax.swing.JButton();
        btnViewSellerDetails = new javax.swing.JButton();
        btnViewHouseDetails = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnrenthouse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnrenthouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-give-60.png"))); // NOI18N
        btnrenthouse.setText("RENT HOUSE");
        btnrenthouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrenthouseActionPerformed(evt);
            }
        });
        jPanel1.add(btnrenthouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 203, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbltitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbltitle.setText("HOUSE RENTAL SYSTEM");

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbltitle)
                .addContainerGap(822, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbltitle))
                    .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1380, 70));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblassets.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblassets.setText("ASSET DETAILS");
        lblassets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblhouse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblhouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Assetid", " Name", " Address", "City", "State", "Zipcode", "Bedrooms", "Baths", "Rent", "Availibility", "SoldByID", "Merchant"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblhouse);

        btnViewHouseOnMap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewHouseOnMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-address-16.png"))); // NOI18N
        btnViewHouseOnMap.setText("DISPLAY HOUSE ON MAP");
        btnViewHouseOnMap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnViewHouseOnMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHouseOnMapActionPerformed(evt);
            }
        });

        hireSPBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hireSPBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-account-24.png"))); // NOI18N
        hireSPBtn.setText("RECRUIT SERVICES");
        hireSPBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        hireSPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireSPBtnActionPerformed(evt);
            }
        });

        btnViewSellerDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewSellerDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-account-30.png"))); // NOI18N
        btnViewSellerDetails.setText("DISPLAY SELLER DETAILS");
        btnViewSellerDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnViewSellerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSellerDetailsActionPerformed(evt);
            }
        });

        btnViewHouseDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewHouseDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-enterprise-resource-planning-48.png"))); // NOI18N
        btnViewHouseDetails.setText("DISPLAY HOUSE DETAILS");
        btnViewHouseDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnViewHouseDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHouseDetailsActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-give-60.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(lblassets))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnViewHouseOnMap, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hireSPBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewSellerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewHouseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblassets, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewHouseOnMap, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hireSPBtn)
                    .addComponent(btnViewSellerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewHouseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1380, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1217, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnrenthouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrenthouseActionPerformed
        int selectedRow = tblhouse.getSelectedRow();
        int count = tblhouse.getSelectedRowCount();
        if (count == 1) {
            String status = (String) tblhouse.getValueAt(selectedRow, 9);
            if (!"sold".equalsIgnoreCase(status)) {
                String assetID = (String) tblhouse.getValueAt(selectedRow, 0);
                Asset asset = assetDirectory.fetchAsset(assetID);
                MerchantRegistrationForm merchantRegistrationForm = new MerchantRegistrationForm(userPrcCont, organisation, network, enterprise, asset, system, usrAccount);
                userPrcCont.add("MerchantRegistrationForm", merchantRegistrationForm);
                CardLayout layout = (CardLayout) userPrcCont.getLayout();
                layout.next(userPrcCont);
            } else {
                JOptionPane.showMessageDialog(null, "Sorry the selected house is sold! Choose other vacant houses!.");
                return;
            }
        } // TODO add your handling code here:
        else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }

    }//GEN-LAST:event_btnrenthouseActionPerformed

    private void btnViewHouseDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHouseDetailsActionPerformed
        int selectedRow = tblhouse.getSelectedRow();

        int count = tblhouse.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                CardLayout layout = (CardLayout) userPrcCont.getLayout();
                String Id = (String) tblhouse.getValueAt(selectedRow, 0);
                Asset asset = assetDirectory.fetchAsset(Id);
                DisplayHouseInfoPanel displayHouseInfoPanel = new DisplayHouseInfoPanel(userPrcCont, asset, assetDirectory, system, usrAccount);
                userPrcCont.add(displayHouseInfoPanel);
                layout.next(userPrcCont);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnViewHouseDetailsActionPerformed

    private void btnViewSellerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSellerDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblhouse.getSelectedRow();
        int count = tblhouse.getSelectedRowCount();
        if (count == 1) {
            UserAccount seller = (UserAccount) tblhouse.getValueAt(selectedRow, 10);
            DisplayMerchantInfoPanel displayMerchantInfoPanel = new DisplayMerchantInfoPanel(userPrcCont, seller, usrAccount, system);
            userPrcCont.add("DisplayMerchantInfoPanel", displayMerchantInfoPanel);
            CardLayout layout = (CardLayout) userPrcCont.getLayout();
            layout.next(userPrcCont);
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnViewSellerDetailsActionPerformed

    private void btnViewHouseOnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHouseOnMapActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblhouse.getSelectedRow();
        int count = tblhouse.getSelectedRowCount();
        if (count == 1) {
            String assetID = (String) tblhouse.getValueAt(selectedRow, 0);
            Asset asset = assetDirectory.fetchAsset(assetID);
            Double latitude = asset.getLatitude();
            Double longitude = asset.getLongitude();
            JFrame test = new JFrame("Google Maps");
            String destinationFile = "";
            try {
                String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="+latitude+",-"+longitude+"&zoom=13&size=600x300&maptype=roadmap"
                        + "&markers=color:red%7Clabel:C%7C"+latitude+",-"+longitude+"&key=AIzaSyCiAxr6BzsHttslq8-fNcsWedGkotMf5_E";
                destinationFile = asset.getAssetName()+".jpg";
                URL url = new URL(imageUrl);
                InputStream is = url.openStream();
                OutputStream os = new FileOutputStream(destinationFile);

                byte[] b = new byte[2048];
                int length;

                while ((length = is.read(b)) != -1) {
                    os.write(b, 0, length);
                }

                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }

            test.add(new JLabel(new ImageIcon((new ImageIcon(destinationFile)).getImage().getScaledInstance(630, 600,
                    java.awt.Image.SCALE_SMOOTH))));

            test.setVisible(true);
            test.pack();

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }

                
    }//GEN-LAST:event_btnViewHouseOnMapActionPerformed

    private void hireSPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireSPBtnActionPerformed
        int selectedRow = tblhouse.getSelectedRow();
        int count = tblhouse.getSelectedRowCount();
        if (count == 1) {
            String assetID = (String) tblhouse.getValueAt(selectedRow, 0);
            Asset asset = assetDirectory.fetchAsset(assetID);
            //Buyer buyer = buyerDirectory.searchBuyer(usrAccount.getEmployee().getName());

            
            RecruitallServicesPanel recruitallServicesPanel = new RecruitallServicesPanel(userPrcCont, organisation, network, enterprise, asset, system, usrAccount);
            userPrcCont.add("RecruitallServicesPanel", recruitallServicesPanel);
            CardLayout layout = (CardLayout) userPrcCont.getLayout();
            layout.next(userPrcCont);

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_hireSPBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewHouseDetails;
    private javax.swing.JButton btnViewHouseOnMap;
    private javax.swing.JButton btnViewSellerDetails;
    private javax.swing.JButton btnrenthouse;
    private javax.swing.JButton hireSPBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblassets;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblhouse;
    // End of variables declaration//GEN-END:variables
}
