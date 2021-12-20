/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.MovpacRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class MoversPackersOrganisation extends Organisation{
    
    public MoversPackersOrganisation(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getCorrespondingRole() {
        ArrayList<Role> rolesList = new ArrayList();
        rolesList.add(new MovpacRole());
        return rolesList;
    }
       @Override
    public Type getType() {
        return Organisation.Type.MoversPackers;
    }  
    
}
