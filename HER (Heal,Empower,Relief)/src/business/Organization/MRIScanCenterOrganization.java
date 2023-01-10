/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;
import business.Role.LabAssistantRole;
import business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Utsav Chadha
 */
public class MRIScanCenterOrganization extends Organization {
    public MRIScanCenterOrganization() {
        super(Organization.Type.MRIScanCenter.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistantRole());
        return roles;
    }
}
