/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Organization.Organization.Type;
import java.util.ArrayList;
/**
 *
 * @author rohit
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.CaseReporter.getValue())){
            organization = new CaseReporterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PhysicalExaminationCenter.getValue())){
            organization = new PhysicalExaminationCenterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MRIScanCenter.getValue())){
            organization = new MRIScanCenterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CounsellingOrganization.getValue())){
            organization = new CounsellingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LegalServices.getValue())){
            organization = new LegalServicesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CaseSupervisingOrganization.getValue())){
            organization = new CaseSupervisorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MentalHealthCenterOrganization.getValue())){
            organization = new MentalHealthCenterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RehabCenter.getValue())){
            organization = new RehabCenterOrganization();
            organizationList.add(organization);
        }
//         else if (type.getValue().equals(Type.Rehabilitation.getValue())){
//            organization = new RehabCenterOrganization();
//            organizationList.add(organization);
//        }
        return organization;
    }
    
    public Organization searchOrganizationbyname(String Name){
        for(Organization org: organizationList){
            if(Name.equalsIgnoreCase(org.getName())){
                return org;
            }
        }
        return null; 
    }
}
