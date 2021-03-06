/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.MerchantRole;

import Business.Asset.Asset;
import Business.Asset.AssetDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nemod
 */
public class ManageHousePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHousePanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private AssetDirectory assetDirectory;
    private EcoSystem system;
    
    public ManageHousePanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.system = system;
        this.assetDirectory = (system.getAssetDirectory()== null) ? new AssetDirectory() : system.getAssetDirectory();
        populateTable();
        disableLabels();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) housingtable.getModel();
        dtm.setRowCount(0);
        for (Asset asset : assetDirectory.getAssetList()) {
            if (asset.getMerchant().getUserName().equals(useraccount.getUserName())) {
                Object[] row = new Object[11];
                row[0] = asset;
                row[1] = asset.getAssetName();
                row[2] = asset.getAddress();
                row[3] = asset.getCity();
                row[4] = asset.getState();
                row[5] = asset.getZip();
                row[6] = asset.getBedroom();
                row[7] = asset.getBaths();
                row[8] = asset.getCost();
                row[9] = asset.getAvail();
                row[10]= asset.getCustomer();
                dtm.addRow(row);
            }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        housingtable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblicon = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblsubtitle = new javax.swing.JLabel();
        btnalterhousedetails = new javax.swing.JButton();
        btndiscard = new javax.swing.JButton();
        btnpotentialcust = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        getname = new javax.swing.JTextField();
        lblnameinvalid = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        getadd = new javax.swing.JTextField();
        lblcityname = new javax.swing.JLabel();
        getcity = new javax.swing.JTextField();
        lblstate = new javax.swing.JLabel();
        getstate = new javax.swing.JTextField();
        lblzipcode = new javax.swing.JLabel();
        getzipcode = new javax.swing.JTextField();
        lblbhk = new javax.swing.JLabel();
        getnoofbhk = new javax.swing.JTextField();
        lblbhkinvalid = new javax.swing.JLabel();
        lblrestrooms = new javax.swing.JLabel();
        getnoofrestrooms = new javax.swing.JTextField();
        lblrestroominvalid = new javax.swing.JLabel();
        lblprice = new javax.swing.JLabel();
        getprice = new javax.swing.JTextField();
        lblrentinvalid = new javax.swing.JLabel();
        lblavail = new javax.swing.JLabel();
        availcomboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        getsoldto = new javax.swing.JTextField();
        btnalterdetails = new javax.swing.JButton();
        lblsubsubtitle = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 68, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        housingtable.setAutoCreateRowSorter(true);
        housingtable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        housingtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Property_id", "Name", "Address", "City", "State", "Zipcode", "No of bhk available", "No of bathroom available", "Price", "Availibity", "Currently Sold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        housingtable.setSelectionBackground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(housingtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 950, 70));

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
                .addContainerGap(812, Short.MAX_VALUE))
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 70));

        lblsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblsubtitle.setText("UPDATE POSTS LIST");
        lblsubtitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnalterhousedetails.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnalterhousedetails.setForeground(new java.awt.Color(0, 0, 51));
        btnalterhousedetails.setText("ALTER HOUSE DETAILS");
        btnalterhousedetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnalterhousedetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnalterhousedetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterhousedetailsActionPerformed(evt);
            }
        });

        btndiscard.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btndiscard.setForeground(new java.awt.Color(0, 0, 51));
        btndiscard.setText("DISCARD HOUSE");
        btndiscard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btndiscard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiscardActionPerformed(evt);
            }
        });

        btnpotentialcust.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnpotentialcust.setForeground(new java.awt.Color(0, 0, 51));
        btnpotentialcust.setText("SHOW POTENTIAL CUSTOMERS");
        btnpotentialcust.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnpotentialcust.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpotentialcust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpotentialcustActionPerformed(evt);
            }
        });

        lblname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblname.setText("Name:");

        getname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getnameActionPerformed(evt);
            }
        });

        lblnameinvalid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblnameinvalid.setForeground(new java.awt.Color(255, 51, 0));
        lblnameinvalid.setText("Invalid entry");

        lbladdress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbladdress.setText("Address:");

        getadd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblcityname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblcityname.setText("City:");

        getcity.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblstate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblstate.setText("State:");

        getstate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblzipcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblzipcode.setText("Zipcode:");

        getzipcode.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblbhk.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblbhk.setText("No of bhk:");

        getnoofbhk.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getnoofbhk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getnoofbhkActionPerformed(evt);
            }
        });

        lblbhkinvalid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblbhkinvalid.setForeground(new java.awt.Color(255, 51, 0));
        lblbhkinvalid.setText("Invalid entry, enter an integer number!");

        lblrestrooms.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblrestrooms.setText("No of Restrooms:");

        getnoofrestrooms.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getnoofrestrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getnoofrestroomsActionPerformed(evt);
            }
        });

        lblrestroominvalid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblrestroominvalid.setForeground(new java.awt.Color(255, 51, 0));
        lblrestroominvalid.setText("Invalid entry, enter an integer number!");

        lblprice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblprice.setText("Rent cost:");

        getprice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblrentinvalid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblrentinvalid.setForeground(new java.awt.Color(255, 51, 0));
        lblrentinvalid.setText("Invalid entry use 0.0 format!");

        lblavail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblavail.setText("Availibility:");

        availcomboBox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        availcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "SoldOut" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("Currently Sold:");

        getsoldto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getsoldto.setEnabled(false);

        btnalterdetails.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnalterdetails.setText("UPDATE DETAILS");
        btnalterdetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnalterdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterdetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(lblsubtitle))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblname)
                                        .addComponent(lbladdress)
                                        .addComponent(lblcityname)
                                        .addComponent(lblstate)
                                        .addComponent(lblzipcode)
                                        .addComponent(lblrestrooms)
                                        .addComponent(lblprice)
                                        .addComponent(lblbhk))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblavail)
                                        .addGap(55, 55, 55)))
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12)
                                .addGap(83, 83, 83)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblnameinvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(availcomboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 207, Short.MAX_VALUE)
                                    .addComponent(getprice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getnoofrestrooms, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getnoofbhk, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getzipcode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getstate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getcity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getadd, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblbhkinvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblrentinvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblrestroominvalid)))
                            .addComponent(getsoldto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(btnalterdetails))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnalterhousedetails)
                        .addGap(43, 43, 43)
                        .addComponent(btndiscard)
                        .addGap(36, 36, 36)
                        .addComponent(btnpotentialcust)))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsubtitle)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(getname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnameinvalid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladdress)
                    .addComponent(getadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcityname)
                    .addComponent(getcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstate)
                    .addComponent(getstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblzipcode)
                    .addComponent(getzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbhk)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(getnoofbhk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblbhkinvalid)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrestrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getnoofrestrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrestroominvalid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprice)
                    .addComponent(getprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrentinvalid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblavail)
                    .addComponent(availcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(getsoldto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnalterdetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnalterhousedetails)
                    .addComponent(btndiscard)
                    .addComponent(btnpotentialcust))
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1300, 450));

        lblsubsubtitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblsubsubtitle.setForeground(new java.awt.Color(255, 255, 255));
        lblsubsubtitle.setText("VIEW DETAILS");
        jPanel1.add(lblsubsubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiscardActionPerformed
        // TODO add your handling code here:

         int selectedRow = housingtable.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the house", "Warning", dialogButton);

            if (dialogResult == JOptionPane.YES_OPTION) {
                Asset asset = (Asset) housingtable.getValueAt(selectedRow, 0);
                assetDirectory.removeAsset(asset);
                JOptionPane.showMessageDialog(this, "Selected house is removed from the list!");
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a house to be deleted");
        }
      
    }//GEN-LAST:event_btndiscardActionPerformed

    private void btnalterhousedetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterhousedetailsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) housingtable.getModel();

        int selectedRow = housingtable.getSelectedRow();
        if (selectedRow >= 0) {

            String name = (String) housingtable.getValueAt(selectedRow, 1);
            String address = (String) housingtable.getValueAt(selectedRow, 2);
            String city = (String) housingtable.getValueAt(selectedRow, 3);
            String state = (String) housingtable.getValueAt(selectedRow, 4);
            String zipcode = (String) housingtable.getValueAt(selectedRow, 5);
            int bhk = (Integer) housingtable.getValueAt(selectedRow, 6);
            double bathroom = (Double) housingtable.getValueAt(selectedRow, 7);
            double price = (Double) housingtable.getValueAt(selectedRow, 8);
            String status = (String) housingtable.getValueAt(selectedRow, 9);
            UserAccount soldto = (UserAccount) housingtable.getValueAt(selectedRow, 10);

            getname.setText(name);
            getadd.setText(address);
            getzipcode.setText(zipcode);
            getstate.setText(state);
            String bhkset = Integer.toString(bhk);
            getnoofbhk.setText(bhkset);
            String bathroomset = Double.toString(bathroom);
            getnoofrestrooms.setText(bathroomset);
            String priceset = Double.toString(price);
            getprice.setText(priceset);
            availcomboBox.getModel().setSelectedItem(status);
            if(soldto != null){
                getsoldto.setText(soldto.getName());
            }
            getcity.setText(city);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }

    }//GEN-LAST:event_btnalterhousedetailsActionPerformed

    private void btnpotentialcustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpotentialcustActionPerformed
        // TODO add your handling code here:
        int selectedRow = housingtable.getSelectedRow();

        int count = housingtable.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {

                String name = (String) housingtable.getValueAt(selectedRow, 1);
                Asset asset = assetDirectory.searchAssetName(name);

                ArrayList<UserAccount> buyers = asset.getRegisteredCustomer();
                try {
                    if (!buyers.isEmpty() || buyers != null) {

                        ManageCustomerPanel manageCustomerPanel = new ManageCustomerPanel(userProcessContainer, enterprise, useraccount, asset, system);
                        userProcessContainer.add("ManageCustomerPanel", manageCustomerPanel);
                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        layout.next(userProcessContainer);

                    } else {
                        JOptionPane.showMessageDialog(null, "Sorry,No interested buyer for this property!!");
                    }
                } catch (NullPointerException e) {
                    System.out.println("NullPointerException thrown!");
                    JOptionPane.showMessageDialog(null, "Sorry,No interested buyer for this property!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnpotentialcustActionPerformed

    private void getnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getnameActionPerformed

    private void btnalterdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterdetailsActionPerformed
        // TODO add your handling code here:
        String name = getname.getText();
        String address = getadd.getText();
        String city = getcity.getText();
        String state = getstate.getText();
        String pincode = getzipcode.getText();
        double price = 0.0;
        double bathroom = 0.0;
        Boolean flag = true;

        price = Double.parseDouble((getprice.getText()).isEmpty() ? "0.0" : getprice.getText());
        int bhk = Integer.parseInt((getnoofbhk.getText()).isEmpty() ? "0" : getnoofbhk.getText());
        bathroom = Double.parseDouble((getnoofrestrooms.getText()).isEmpty() ? "0.0" : getnoofrestrooms.getText());

        if (name.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || pincode.isEmpty() || price == 0.0 || bathroom == 0.0) {
            JOptionPane.showMessageDialog(null, "Please enter the missing field to continue!");
            flag = false;
        }
        if (price == 0.0) {
            lblrentinvalid.setVisible(true);
            flag = false;
        }
        if (bhk == 0) {
            lblbhkinvalid.setVisible(true);
            flag = false;
        }
        if (bathroom == 0.0) {
            lblrestroominvalid.setVisible(true);
            flag = false;
        }
        if (flag) {
            disableLabels();
            int selectedRow = housingtable.getSelectedRow();
            Asset asset = (Asset) housingtable.getValueAt(selectedRow, 0);
            asset.setAssetName(getname.getText());
            asset.setAddress(getadd.getText());
            asset.setCity(getcity.getText());
            asset.setZip(getzipcode.getText());
            asset.setState(getstate.getText());
            int bhkget = Integer.parseInt(getnoofbhk.getText());
            asset.setBedroom(bhkget);
            asset.setBaths(Double.parseDouble(getnoofrestrooms.getText()));
            asset.setCost(Double.parseDouble(getprice.getText()));
            String statusget = String.valueOf(availcomboBox.getSelectedItem());
            asset.setAvail(statusget);
            asset.setMerchant(useraccount);
            system.setAssetDirectory(assetDirectory);
            JOptionPane.showMessageDialog(null, "House details Updated!");
            getname.setText("");
            getadd.setText("");
            getzipcode.setText("");
            getstate.setText("");
            getnoofbhk.setText("");
            getnoofrestrooms.setText("");
            getprice.setText("");
            getsoldto.setText("");
            getcity.setText("");
            populateTable();
        }
      
      
    }//GEN-LAST:event_btnalterdetailsActionPerformed

    public void disableLabels() {
        lblrestroominvalid.setVisible(false);
        lblbhkinvalid.setVisible(false);
        lblnameinvalid.setVisible(false);
        lblrentinvalid.setVisible(false);
    }
    private void getnoofbhkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getnoofbhkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getnoofbhkActionPerformed

    private void getnoofrestroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getnoofrestroomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getnoofrestroomsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> availcomboBox;
    private javax.swing.JButton btnalterdetails;
    private javax.swing.JButton btnalterhousedetails;
    private javax.swing.JButton btndiscard;
    private javax.swing.JButton btnpotentialcust;
    private javax.swing.JTextField getadd;
    private javax.swing.JTextField getcity;
    private javax.swing.JTextField getname;
    private javax.swing.JTextField getnoofbhk;
    private javax.swing.JTextField getnoofrestrooms;
    private javax.swing.JTextField getprice;
    private javax.swing.JTextField getsoldto;
    private javax.swing.JTextField getstate;
    private javax.swing.JTextField getzipcode;
    private javax.swing.JTable housingtable;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblavail;
    private javax.swing.JLabel lblbhk;
    private javax.swing.JLabel lblbhkinvalid;
    private javax.swing.JLabel lblcityname;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnameinvalid;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblrentinvalid;
    private javax.swing.JLabel lblrestroominvalid;
    private javax.swing.JLabel lblrestrooms;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lblsubsubtitle;
    private javax.swing.JLabel lblsubtitle;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblzipcode;
    // End of variables declaration//GEN-END:variables
}
