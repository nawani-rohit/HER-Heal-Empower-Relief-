/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

/**
 *
 * @author Utsav Chadha
 */
public class DrWorkRequest extends WorkRequest {
    CaseReporterWorkRequest CaseReporterWorkRequest;
    LabAssistantWorkRequest LabAssistanceWorkRequest;
    RehabCounselorWorkRequest RehabCounselorWorkRequest;
//    RehabilitationCaretakerWorkRequest  rehabilitationCaretakerWorkRequest;

//    public RehabilitationCaretakerWorkRequest getRehabilitationCaretakerWorkRequest() {
//        return rehabilitationCaretakerWorkRequest;
//    }

//    public void setRehabilitationCaretakerWorkRequest(RehabilitationCaretakerWorkRequest rehabilitationCaretakerWorkRequest) {
//        this.rehabilitationCaretakerWorkRequest = rehabilitationCaretakerWorkRequest;
//    }
    private String docsign;

    public CaseReporterWorkRequest getCaseReporterWorkRequest() {
        return CaseReporterWorkRequest;
    }

    public void setCaseReporterWorkRequest(CaseReporterWorkRequest CaseReporterWorkRequest) {
        this.CaseReporterWorkRequest = CaseReporterWorkRequest;
    }

    public String getDocsign() {
        return docsign;
    }

    public void setDocsign(String docsign) {
        this.docsign = docsign;
    }

    public LabAssistantWorkRequest getLabAssistanceWorkRequest() {
        return LabAssistanceWorkRequest;
    }

    public void setLabAssistanceWorkRequest(LabAssistantWorkRequest LabAssistanceWorkRequest) {
        this.LabAssistanceWorkRequest = LabAssistanceWorkRequest;
    }

    public RehabCounselorWorkRequest getRehabCounselorWorkRequest() {
        return RehabCounselorWorkRequest;
    }

    public void setRehabCounselorWorkRequest(RehabCounselorWorkRequest RehabCounselorWorkRequest) {
        this.RehabCounselorWorkRequest = RehabCounselorWorkRequest;
    }
}
