/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class ASITEnterprise extends Enterprise {
     public ASITEnterprise(String name){
        super(name,Enterprise.EnterpriseType.ASIT);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
