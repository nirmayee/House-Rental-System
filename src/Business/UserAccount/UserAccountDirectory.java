/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount userAcc : userAccountList) {
            if (userAcc.getUserName().toLowerCase().equals(username.toLowerCase()) && userAcc.getPassword().equals(password)) {
                return userAcc;
            }
        }
        return null;
    }
    
    public UserAccount generateUserAcc(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setName(employee.getName());
        userAccount.setAvail("Available");
        userAccountList.add(userAccount);
        return userAccount;
    }
    
}
