/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;
import business.Encounter.EncounterCounselor;
import java.util.ArrayList;
/**
 *
 * @author Utsav Chadha
 */
public class CounselorWorkRequest extends WorkRequest {
     CaseReporterWorkRequest hswr;
    ArrayList<EncounterCounselor> ConslrEncounter = new ArrayList<EncounterCounselor>();

    public CaseReporterWorkRequest getHswr() {
        return hswr;
    }

    public void setHswr(CaseReporterWorkRequest hswr) {
        this.hswr = hswr;
    }

    public ArrayList<EncounterCounselor> getConslrEncounter() {
        return ConslrEncounter;
    }

    public void setConslrEncounter(ArrayList<EncounterCounselor> ConslrEncounter) {
        this.ConslrEncounter = ConslrEncounter;
    }
}
