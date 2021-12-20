/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MoneyContractor;

import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class MoneyContractorEmployeeDirectory {
    ArrayList<MoneyContractorEmployee> moneyContractorEmployeeList = new ArrayList<MoneyContractorEmployee>();

    public ArrayList<MoneyContractorEmployee> getPackersMoversList() {
        return moneyContractorEmployeeList;
    }

    public void setMoneyContractorEmployeeList(ArrayList<MoneyContractorEmployee> moneyContractorEmployeeList) {
        this.moneyContractorEmployeeList = moneyContractorEmployeeList;
    }
    
    public String createMoneyContractorEmployeeId(){
        return "MoneyContractorEmployee" + (moneyContractorEmployeeList.size() + 1);
    }
    
    
}
