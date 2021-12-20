/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UI.Admin.BrokerAdminWorkAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author nemod
 */
public class BrokerAdmin extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise,Network network, EcoSystem business) {
        return new BrokerAdminWorkAreaPanel(userProcessContainer, account,organisation, enterprise, network, business);
    }
    
}
