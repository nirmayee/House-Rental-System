/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.AssetManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class AssetManagerOrganisation extends Organisation{
    
    public AssetManagerOrganisation(String name) {
        super(name);
    }
    
    @Override
    public ArrayList<Role> getCorrespondingRole() {
        ArrayList<Role> rolesList = new ArrayList();
        rolesList.add(new AssetManagerRole());
        return rolesList;
    }
       @Override
    public Type getType() {
        return Organisation.Type.AssetManager;
    } 
    
}
