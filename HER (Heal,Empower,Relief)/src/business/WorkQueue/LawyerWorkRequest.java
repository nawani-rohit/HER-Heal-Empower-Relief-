/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Encounter.EncounterLawyer;
import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class LawyerWorkRequest extends WorkRequest{
    CaseReporterWorkRequest CaseReporterWorkRequest;
    ArrayList<EncounterLawyer> LawyerEncounter = new ArrayList<EncounterLawyer>();

    public CaseReporterWorkRequest getCaseReporterWorkRequest() {
        return CaseReporterWorkRequest;
    }

    public void setCaseReporterWorkRequest(CaseReporterWorkRequest CaseReporterWorkRequest) {
        this.CaseReporterWorkRequest = CaseReporterWorkRequest;
    }

    public ArrayList<EncounterLawyer> getLawyerEncounter() {
        return LawyerEncounter;
    }

    public void setLawyerEncounter(ArrayList<EncounterLawyer> LawyerEncounter) {
        this.LawyerEncounter = LawyerEncounter;
    }
}
