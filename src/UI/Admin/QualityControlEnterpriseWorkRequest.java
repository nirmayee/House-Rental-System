/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
import Business.Role.CameraManRole;
import Business.Role.ExaminerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RegistrationRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class QualityControlEnterpriseWorkRequest extends javax.swing.JPanel {

    /**
     * Creates new form QualityControlEnterpriseWorkRequest
     */
    private JPanel usrPrcCont;
    private EcoSystem business;
    private UserAccount usrAccount;
    private Enterprise enterprise;
    private Network network;
    private OrganisationDirectory organisationDirectory;
    
    public QualityControlEnterpriseWorkRequest(JPanel usrPrcCont, UserAccount usrAccount, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
          this.usrPrcCont = usrPrcCont;
        this.usrAccount = usrAccount;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        this.organisationDirectory = enterprise.getOrganisationDirectory();
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblworkrequest.getModel();

        model.setRowCount(0);

        for (WorkRequest workRequest : enterprise.getWorkQueue().getWrkReqList()) {
            if (workRequest instanceof RegistrationRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = ((RegistrationRequest) workRequest).getAvail();
                row[2] = ((RegistrationRequest) workRequest).getUserName();
                row[3] = ((RegistrationRequest) workRequest).getName();
                row[4] = ((RegistrationRequest) workRequest).getUserMailId();
                row[5] = ((RegistrationRequest) workRequest).getUserCity();
                row[6] = ((RegistrationRequest) workRequest).getOrgType();
                row[7] = ((RegistrationRequest) workRequest).getNetwork();
                model.addRow(row);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblquality = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblworkrequest = new javax.swing.JTable();
        btndecline = new javax.swing.JButton();
        btnallow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(44, 68, 80));
        jPanel3.setMinimumSize(new java.awt.Dimension(1058, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(1058, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(lblicon1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitle)
                .addContainerGap(743, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1230, 80));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        lblquality.setBackground(new java.awt.Color(0, 0, 0));
        lblquality.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblquality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblquality.setText("QUALITY CONTROL DETAILS");
        lblquality.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblworkrequest.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tblworkrequest.setForeground(new java.awt.Color(25, 56, 82));
        tblworkrequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Demands", "Availibility", "Username", "Name", "Mailid", "Address", "Organization Types", "Network Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
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
        tblworkrequest.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(tblworkrequest);

        btndecline.setBackground(new java.awt.Color(255, 255, 255));
        btndecline.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndecline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cross-mark-48.png"))); // NOI18N
        btndecline.setText("DECLINE");
        btndecline.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btndecline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeclineActionPerformed(evt);
            }
        });

        btnallow.setBackground(new java.awt.Color(255, 255, 255));
        btnallow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnallow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-verification-tick-mark-for-digital-certification-document-24.png"))); // NOI18N
        btnallow.setText("ALLOW");
        btnallow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnallow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnallow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallowActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-account-100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(btnallow)
                        .addGap(129, 129, 129)
                        .addComponent(btndecline))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblquality, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblquality))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndecline, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnallow))
                .addGap(42, 42, 42))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1230, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 766, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeclineActionPerformed

        int selectedRow = tblworkrequest.getSelectedRow();

        if (selectedRow >= 0) {
            RegistrationRequest request = (RegistrationRequest) tblworkrequest.getValueAt(selectedRow, 0);
            request.setAvail("Rejected");
            JOptionPane.showMessageDialog(null, "User request has been removed successfully");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to process.");
            return;
        }
    }//GEN-LAST:event_btndeclineActionPerformed

    private void btnallowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallowActionPerformed

        int selectedRow = tblworkrequest.getSelectedRow();

        if (selectedRow >= 0) {
            RegistrationRequest request = (RegistrationRequest) tblworkrequest.getValueAt(selectedRow, 0);
           
            if (request.getOrgType() == Organisation.Type.CameraMan) {
                Organisation org = organisationDirectory.createOrganisation(request.getOrgType(), request.getName());
                Employee emp = org.getEmployeeDirectory().generateEmp(request.getName());
                UserAccount ua1 = org.getUserAccountDirectory().generateUserAcc(request.getUserName(), request.getUserPassword(), emp, new CameraManRole());
            }else if (request.getOrgType() == Organisation.Type.Examiner) {
                Organisation org = organisationDirectory.createOrganisation(request.getOrgType(), request.getName());
                Employee emp = org.getEmployeeDirectory().generateEmp(request.getName());
                UserAccount ua1 = org.getUserAccountDirectory().generateUserAcc(request.getUserName(), request.getUserPassword(), emp, new ExaminerRole());
            } 

            request.setAvail("Completed");
            JOptionPane.showMessageDialog(null, "User account has been activated successfully");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a request to process.");
            return;
        }
    }//GEN-LAST:event_btnallowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnallow;
    private javax.swing.JButton btndecline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblquality;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblworkrequest;
    // End of variables declaration//GEN-END:variables
}
