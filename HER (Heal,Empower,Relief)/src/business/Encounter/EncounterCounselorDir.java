/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Encounter;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Utsav Chadha
 */
public class EncounterCounselorDir {
    private ArrayList<EncounterCounselor> Encounters;
    private HashMap<String,ArrayList<EncounterCounselor>> EncounterDirectory;

    public EncounterCounselorDir() {
       EncounterDirectory=new HashMap<String,ArrayList<EncounterCounselor>>();
       Encounters=new ArrayList<EncounterCounselor>();
    }

    public ArrayList<EncounterCounselor> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<EncounterCounselor>> getEncounterDirectory() {
        return EncounterDirectory;
    }
}
