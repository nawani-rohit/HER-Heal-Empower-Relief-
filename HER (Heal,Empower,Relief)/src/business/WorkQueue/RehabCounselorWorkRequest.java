/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import java.util.ArrayList;
/**
 *
 * @author Utsav Chadha
 */
public class RehabCounselorWorkRequest extends WorkRequest  {
    DrWorkRequest DoctorWorkRequest;
    private ArrayList<MedicalReport> medicines = new ArrayList<MedicalReport>();

    public DrWorkRequest getDoctorWorkRequest() {
        return DoctorWorkRequest;
    }

    public void setDoctorWorkRequest(DrWorkRequest DoctorWorkRequest) {
        this.DoctorWorkRequest = DoctorWorkRequest;
    }

    public ArrayList<MedicalReport> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<MedicalReport> medicines) {
        this.medicines = medicines;
    }
}
