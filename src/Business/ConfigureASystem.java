/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Kiran
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
    EcoSystem system = EcoSystem.getInstance();
    
    
    
        Employee emp = system.getEmployeeDirectory().generateEmp("admin");
        
        UserAccount usracc = system.getUserAccountDirectory().generateUserAcc("admin", "admin", emp, new SysAdminRole());
        
        return system;
    }
}

