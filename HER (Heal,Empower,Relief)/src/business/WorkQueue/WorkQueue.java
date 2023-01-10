/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class WorkQueue {
    private ArrayList<CaseReporterWorkRequest> caseReporterWorkRequestList;
    private ArrayList<LawyerWorkRequest> LawyerworkRequestList;
    private ArrayList<PsychiatristWorkRequest> psychiatristWorkRequestList;
    private ArrayList<CounselorWorkRequest> CounselorworkRequestList;
    private ArrayList<DrWorkRequest> DoctorworkRequestList;
    private ArrayList<LabAssistantWorkRequest> LabAssistanceWorkRequest;
    private ArrayList<RehabCounselorWorkRequest> RehabCounselorWorkRequest;
     
    
    public WorkQueue() {
        caseReporterWorkRequestList = new ArrayList<CaseReporterWorkRequest>();
        LawyerworkRequestList=new ArrayList<LawyerWorkRequest>();
        psychiatristWorkRequestList=new ArrayList<PsychiatristWorkRequest>();
        CounselorworkRequestList = new ArrayList<CounselorWorkRequest>();
        DoctorworkRequestList = new ArrayList<DrWorkRequest>();
        LabAssistanceWorkRequest = new ArrayList<LabAssistantWorkRequest>();
        RehabCounselorWorkRequest = new ArrayList<RehabCounselorWorkRequest>();
    }

    public ArrayList<CaseReporterWorkRequest> getCaseReporterWorkRequestList() {
        return caseReporterWorkRequestList;
    }

    public ArrayList<LawyerWorkRequest> getLawyerworkRequestList() {
        return LawyerworkRequestList;
    }

    public ArrayList<PsychiatristWorkRequest> getPsychiatristWorkRequestList() {
        return psychiatristWorkRequestList;
    }

    public ArrayList<CounselorWorkRequest> getCounselorworkRequestList() {
        return CounselorworkRequestList;
    }

    public ArrayList<DrWorkRequest> getDoctorworkRequestList() {
        return DoctorworkRequestList;
    }

    public ArrayList<LabAssistantWorkRequest> getLabAssistanceWorkRequest() {
        return LabAssistanceWorkRequest;
    }

    public ArrayList<RehabCounselorWorkRequest> getRehabCounselorWorkRequest() {
        return RehabCounselorWorkRequest;
    }

    public void setCaseReporterWorkRequestList(ArrayList<CaseReporterWorkRequest> caseReporterWorkRequestList) {
        this.caseReporterWorkRequestList = caseReporterWorkRequestList;
    }

    public void setLawyerworkRequestList(ArrayList<LawyerWorkRequest> LawyerworkRequestList) {
        this.LawyerworkRequestList = LawyerworkRequestList;
    }

    public void setPsychiatristWorkRequestList(ArrayList<PsychiatristWorkRequest> psychiatristWorkRequestList) {
        this.psychiatristWorkRequestList = psychiatristWorkRequestList;
    }

    public void setCounsellarworkRequestList(ArrayList<CounselorWorkRequest> CounsellarworkRequestList) {
        this.CounselorworkRequestList = CounsellarworkRequestList;
    }

    public void setDoctorworkRequestList(ArrayList<DrWorkRequest> DoctorworkRequestList) {
        this.DoctorworkRequestList = DoctorworkRequestList;
    }

    public void setLabAssistanceWorkRequest(ArrayList<LabAssistantWorkRequest> LabAssistanceWorkRequest) {
        this.LabAssistanceWorkRequest = LabAssistanceWorkRequest;
    }

    public void setRehabCounselorRequest(ArrayList<RehabCounselorWorkRequest> RehabCounselorWorkRequest) {
        this.RehabCounselorWorkRequest = RehabCounselorWorkRequest;
    }
    
    public int getcountbytypesa(String type)
    {
        int count=0;
        
        for(CaseReporterWorkRequest hp: caseReporterWorkRequestList)
        {
            
            if(hp.getAssaultType().equalsIgnoreCase(type))
            {
                count++;
            }
        }
        return count;
    }
}
