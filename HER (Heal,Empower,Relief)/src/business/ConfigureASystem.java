/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;
import business.Employee.Employee;
import business.Role.SystemAdminRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author Utsav Chadha
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
       Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
       
       UserAccount ua = system.getUserAccountDirectory().createUserAccnt("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
}
