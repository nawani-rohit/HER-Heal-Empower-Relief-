/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Encounter.EncounterPsychiatrist;
import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class PsychiatristWorkRequest extends WorkRequest{
    CaseReporterWorkRequest caseReporterWorkRequest;
    ArrayList<EncounterPsychiatrist> HPEncounter = new ArrayList<EncounterPsychiatrist>();

    public CaseReporterWorkRequest getCaseReporterWorkRequest() {
        return caseReporterWorkRequest;
    }

    public void setCaseReporterWorkRequest(CaseReporterWorkRequest caseReporterWorkRequest) {
        this.caseReporterWorkRequest = caseReporterWorkRequest;
    }

    public ArrayList<EncounterPsychiatrist> getHPEncounter() {
        return HPEncounter;
    }

    public void setHPEncounter(ArrayList<EncounterPsychiatrist> HPEncounter) {
        this.HPEncounter = HPEncounter;
    }
}
