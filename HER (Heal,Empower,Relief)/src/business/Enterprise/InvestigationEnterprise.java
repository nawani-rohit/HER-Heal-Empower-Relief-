/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Enterprise.Enterprise;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class InvestigationEnterprise extends Enterprise {
    public InvestigationEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Investigation);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
