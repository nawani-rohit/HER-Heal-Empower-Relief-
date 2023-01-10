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
public class CaseReporterEnterprise extends Enterprise {
    public CaseReporterEnterprise(String name){
        super(name,EnterpriseType.CaseReporter);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
