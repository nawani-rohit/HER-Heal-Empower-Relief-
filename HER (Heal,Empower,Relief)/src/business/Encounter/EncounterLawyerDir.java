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
public class EncounterLawyerDir {
    private ArrayList<EncounterLawyer> Encounters;
    private HashMap<String,ArrayList<EncounterLawyer>> EncounterDirectory;

    public EncounterLawyerDir() {
       EncounterDirectory=new HashMap<String,ArrayList<EncounterLawyer>>();
       Encounters=new ArrayList<EncounterLawyer>();
    }

    public ArrayList<EncounterLawyer> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<EncounterLawyer>> getEncounterDirectory() {
        return EncounterDirectory;
    }
}
