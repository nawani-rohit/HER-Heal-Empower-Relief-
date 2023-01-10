/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.UserAccount;
import java.util.ArrayList;
import business.Employee.Employee;
import business.Role.Role;
/**
 *
 * @author Utsav Chadha
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccntList;

    public UserAccountDirectory() {
        userAccntList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccntList() {
        return userAccntList;
    }
    
    public UserAccount authenticateUserAccnt(String username, String password){
        for (UserAccount ua : userAccntList)
            if (ua.getUsername().equals(username) && ua.getPwd().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccnt(String username, String password, Employee employee, Role role){
        UserAccount userAccnt = new UserAccount();
        userAccnt.setUsername(username);
        userAccnt.setPwd(password);
        userAccnt.setEmp(employee);
        userAccnt.setRole(role);
        userAccntList.add(userAccnt);
        return userAccnt;
    }
    
    public boolean checkUserIsUnique(String username){
        for (UserAccount ua : userAccntList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public UserAccount searchUserAccnt(String username, String Password){
        for (UserAccount ua : userAccntList){
            if(ua.getUsername().equals(username)&& ua.getPwd().equals(Password)){
                return ua;
            }
        }
        return null;
    }
    
    public boolean CheckIsValidInput(String s) {

        boolean field_status = false;    
        char [] chkpwd = s.toCharArray();
        int lower_case=0, upper_case=0, digits=0;

        if (s.length() > 8) 
        field_status = true;

        for ( int i = 0;  i < chkpwd.length; i++) {
            if(Character.isDigit(chkpwd[i]))
                digits++;
            if(Character.isLowerCase(chkpwd[i]))
                lower_case++;
            if(Character.isUpperCase(chkpwd[i]))
                upper_case++;
            
            
        }

        if ( !(lower_case  > 0 ))
            field_status = false;

        if ( !(upper_case  > 0 ))
            field_status = false;

        if ( !(digits > 0 ))
            field_status = false;

        return field_status;
    }

}
