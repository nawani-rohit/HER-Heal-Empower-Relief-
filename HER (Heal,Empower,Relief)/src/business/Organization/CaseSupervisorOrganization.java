/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.CaseSupervisorRole;
import business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author rohit
 */
public class CaseSupervisorOrganization extends Organization{
    public CaseSupervisorOrganization() {
        super(Organization.Type.CaseSupervisingOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CaseSupervisorRole());
        return roles;
    }
}
