/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

//import Business.Role.RepairRole;
import Business.Role.RepairRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nemod
 */
public class RepairOrganisation extends Organisation{
    public RepairOrganisation(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getCorrespondingRole() {
        ArrayList<Role> rolesList = new ArrayList();
        rolesList.add(new RepairRole());
        return rolesList;
    }
       @Override
    public Type getType() {
        return Organisation.Type.Repair;
    }  
    
}
