/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Utsav Chadha
 */
public class LabAssistantWorkRequest extends WorkRequest {
    DrWorkRequest DoctorWorkRequest;
    private String testResult;
    private String labsign;
    private ArrayList<LabTest> LabTestList = new ArrayList<LabTest>();

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public DrWorkRequest getDoctorWorkRequest() {
        return DoctorWorkRequest;
    }

    public void setDoctorWorkRequest(DrWorkRequest DoctorWorkRequest) {
        this.DoctorWorkRequest = DoctorWorkRequest;
    } 

    public String getLabsign() {
        return labsign;
    }

    public void setLabsign(String labsign) {
        this.labsign = labsign;
    }

    public ArrayList<LabTest> getLabTestList() {
        return LabTestList;
    }

    public void setLabTestList(ArrayList<LabTest> LabTestList) {
        this.LabTestList = LabTestList;
    }
    
    
}
