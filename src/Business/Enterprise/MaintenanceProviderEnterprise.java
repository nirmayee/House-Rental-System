/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.MoneyContractorRole;
import Business.Role.MovpacRole;
import Business.Role.RepairRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class MaintenanceProviderEnterprise extends Enterprise {
    
     public MaintenanceProviderEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.MaintenanceProvider);
    }

    @Override

    public ArrayList<Role> getCorrespondingRole() {
        roles = new ArrayList<Role>();
        roles.add(new RepairRole());
        roles.add(new MovpacRole());
        roles.add(new MoneyContractorRole());
        return roles;
    }
    
}
