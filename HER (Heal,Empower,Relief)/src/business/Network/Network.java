/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Network;

import business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author rohit
 */
public class Network {
    private String nameOfNetwork;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getNameOfNetwork() {
        return nameOfNetwork;
    }

    public void setNameOfNetwork(String nameOfNetwork) {
        this.nameOfNetwork = nameOfNetwork;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return nameOfNetwork;
    }
}
