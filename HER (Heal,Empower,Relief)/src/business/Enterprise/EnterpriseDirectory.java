/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        
        if(type==Enterprise.EnterpriseType.CaseReporter){
            enterprise=new CaseReporterEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.MedicalServices){
            enterprise=new MedicalServicesEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Investigation){
            enterprise=new InvestigationEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.ASIT){
            enterprise=new ASITEnterprise(name);
            enterpriseList.add(enterprise);
        }
//        if(type==Enterprise.EnterpriseType.Pharmaceutical){
//            enterprise=new PharmaceuticalEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
        if(type==Enterprise.EnterpriseType.Rehabilitation){
            enterprise=new RehabEnterprise(name);
            enterpriseList.add(enterprise);
        }  
        return enterprise;
    }
    
    public Enterprise searchEnterprisebyname(String Name){
        for(Enterprise etp: enterpriseList){
            if(Name.equalsIgnoreCase(etp.getName())){
                return etp;
            }
        }
        return null; 
    }
    
    public Enterprise searchEnterprisebyType(Enterprise.EnterpriseType type){
        for(Enterprise etp : enterpriseList){
            if(type.equals(etp.getEnterpriseType())){
                return etp;
            }
        }
        return null;
    }
}
