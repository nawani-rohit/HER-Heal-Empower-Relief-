/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.RehabCounselor;
import business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author rohit
 */
public class RehabCenterOrganization extends Organization{
    public RehabCenterOrganization() {
         super(Organization.Type.RehabCenter.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> roles = new ArrayList();
        roles.add(new RehabCounselor());
        return roles;
    }
}
