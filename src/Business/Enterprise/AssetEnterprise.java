/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AssetManagerRole;
import Business.Role.ConstructorRole;
import Business.Role.MerchantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class AssetEnterprise extends Enterprise{
    public AssetEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Asset);
    }

    @Override
    public ArrayList<Role> getCorrespondingRole() {
        roles = new ArrayList<Role>();
        roles.add(new ConstructorRole());
        roles.add(new AssetManagerRole());
        roles.add(new MerchantRole());
        return roles;
    }
    
}
