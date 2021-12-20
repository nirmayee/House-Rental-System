/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> empList;

    public EmployeeDirectory() {
        empList = new ArrayList();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public Employee generateEmp(String name){
        Employee emp = new Employee();
        emp.setName(name);
        empList.add(emp);
        return emp;
    }
    
    
    
}
