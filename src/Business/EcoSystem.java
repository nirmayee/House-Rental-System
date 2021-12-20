/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Asset.AssetDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.MoneyContractor.MoneyContractorEmployeeDirectory;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
import Business.Role.Role;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author Kiran
 */
public class EcoSystem extends Organisation{
    private static EcoSystem business;
    private OrganisationDirectory organisationDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private MoneyContractorEmployeeDirectory moneyContractorEmployeeDirectory;
    private AssetDirectory AssetDirectory;    
    private ArrayList<Network> nwkCatalog;

    private EcoSystem() {
        super(null);
        nwkCatalog = new ArrayList<Network>();
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public AssetDirectory getAssetDirectory() {
        return AssetDirectory;
    }

    public void setAssetDirectory(AssetDirectory AssetDirectory) {
        this.AssetDirectory = AssetDirectory;
    }

    
    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }

    public void setOrganisationDirectory(OrganisationDirectory organisationDirectory) {
        this.organisationDirectory = organisationDirectory;
    }  
    
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
     public static void setInstance(EcoSystem esystem) {
        business = esystem;
    }
     
    public Network generateAndAppendNwk() {
        Network network = new Network();
        nwkCatalog.add(network);
        return network;
    }
    
    public ArrayList<Network> getNwkCatalog() {
        return nwkCatalog;
    }

    public void setNwkCatalog(ArrayList<Network> nwkCatalog) {
        this.nwkCatalog = nwkCatalog;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    public boolean verifySameNwk(String nwkName) {
        for (Network nwk : business.getNwkCatalog()) {
            if (nwk.getName().toLowerCase().equals(nwkName.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
    
    public boolean veriftEntSame(String enterpriseName) {
        for (Network nwk : business.getNwkCatalog()) {
            for (Enterprise ent : nwk.getEnterpriseDirectory().getEnterpriseList()) {
                if (ent.getName().toLowerCase().equals(enterpriseName.toLowerCase())) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public Boolean verifyPassFormat(String pass) {
        Pattern patt;
        patt = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
        Matcher matcher = patt.matcher(pass);
        boolean bool = matcher.matches();
        if (!bool) {
            JOptionPane.showMessageDialog(null, "Invalid password!\nPassword must contain at least one digit [0-9].\n"
                    + "Password must contain at least one lowercase Latin character [a-z].\n"
                    + "Password must contain at least one uppercase Latin character [A-Z].\n"
                    + "Password must contain at least one special character like ! @ # & ( ).\n"
                    + "Password must contain a length of at least 8 characters and a maximum of 20 characters.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    
    public boolean verifySameUser(String user_Name) {
        boolean flag = true;
        for (Network nwk : business.getNwkCatalog()) {
            for (Enterprise ent : nwk.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount usrAcc : ent.getUserAccountDirectory().getUserAccountList()) {
                    if (usrAcc.getUserName().toLowerCase().equals(user_Name.toLowerCase())) {
                        flag = false;
                    }
                }
                for (Organisation org : ent.getOrganisationDirectory().getOrganisationList()) {
                    for (UserAccount usrAcc : org.getUserAccountDirectory().getUserAccountList()) {
                        if (usrAcc.getUserName().toLowerCase().equals(user_Name.toLowerCase())) {
                            flag = false;
                        }
                    }
                }
            }
        }
        if ("admin".equals(user_Name.toLowerCase())) {
            flag = false;
        }
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Sorry! " + user_Name + " already exists in the system!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
    
    public Boolean verifyMailFormat(String mail) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN
                = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(mail);
        if (matcher.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid format of email! Ex: hello@hello.com", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public Boolean verifyContactFormat(String contactNo) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(contactNo);
        if (matcher.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please enter valid format of phone! Ex: 9876543210", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean isVoid(String stringNum) {
        if (stringNum.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isDouble(String stringNum) {
        if (stringNum == null) {
            return false;
        }
        try {
            double dbl = Double.parseDouble(stringNum);
        } catch (NumberFormatException numFormatExp) {
            return false;
        }
        return true;
    }
    
     public boolean isInt(String stringNum) {
        if (stringNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(stringNum);
        } catch (NumberFormatException numFormatExp) {
            return false;
        }
        return true;
    }
     
     public boolean verifySameMail(String mail, String usrName) {
        for (Network n : business.getNwkCatalog()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organisation o : e.getOrganisationDirectory().getOrganisationList()) {
                    for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                        if (u.getMailId() != null) {
                            if (u.getMailId().toLowerCase().equals(mail.toLowerCase()) && !u.getUserName().equals(usrName)) {
                                JOptionPane.showMessageDialog(null, "Sorry! This Email Address already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
     
      public boolean verifySameContact(String contactNo, String usrName) {
        for (Network nwk : business.getNwkCatalog()) {
            for (Enterprise ent : nwk.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organisation org : ent.getOrganisationDirectory().getOrganisationList()) {
                    for (UserAccount usrAcc : org.getUserAccountDirectory().getUserAccountList()) {
                        if (usrAcc.getContactnumber() != null) {
                            if (usrAcc.getContactnumber().equals(contactNo) && !usrAcc.getUserName().equals(usrName)) {
                                JOptionPane.showMessageDialog(null, "Sorry! This Contact Number already exists in our system", "Error!", JOptionPane.ERROR_MESSAGE);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
      
      @Override
    public ArrayList<Role> getCorrespondingRole() {
        ArrayList<Role> rolesList = new ArrayList<Role>();
        rolesList.add(new SysAdminRole());
        return rolesList;
    }

    
    public static void sendEmailMessage(String emailId, String body) {
    String to = emailId;
    String from = "houserentalsystem123@gmail.com";
    String pass = "houserentalsystem";
    String host = "localhost";
    
    Properties properties = System.getProperties();
    //String host = "smtp.gmail.com";
   
    properties.put("mail.smtp.host","smtp.gmail.com");
    properties.put("mail.smtp.user", from);
    properties.put("mail.smtp.port", "587");
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    properties.put("mail.smtp.starttls.enable", "true");
    properties.put("mail.smtp.starttls.required","true");

    Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
       protected PasswordAuthentication getPasswordAuthentication()
       {
           return new PasswordAuthentication(from,pass);
       }
    });
    try {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject("New User Registration");
        message.setText(body);
        Transport.send(message);
        System.out.println("Sent email successfully....");
    } catch (MessagingException mex) {
        JOptionPane.showMessageDialog(null, "Not a valid Mail Address");
        mex.printStackTrace();
    }
}    

    

    

    
    
}
