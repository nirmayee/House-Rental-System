/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CameraManRole;
import Business.Role.ExaminerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class QualityControlEnterprise extends Enterprise{
    
     public QualityControlEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.QualityControl);
    }

    @Override

    public ArrayList<Role> getCorrespondingRole() {
        roles = new ArrayList<Role>();
        roles.add(new CameraManRole());
        roles.add(new ExaminerRole());
        return roles;
    }
    
}
