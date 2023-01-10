/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.CaseReporterRole;
import business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author rohit
 */
public class CaseReporterOrganization extends Organization {
    public CaseReporterOrganization() {
        super(Organization.Type.CaseReporter.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CaseReporterRole());
        return roles;
    }
}
