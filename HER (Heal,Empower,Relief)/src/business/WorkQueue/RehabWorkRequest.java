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
public class RehabWorkRequest extends WorkRequest {
    DrWorkRequest DoctorWorkRequest;
    private ArrayList<MedicalReport> medicalReports = new ArrayList<MedicalReport>();

    public DrWorkRequest getDoctorWorkRequest() {
        return DoctorWorkRequest;
    }

    public void setDoctorWorkRequest(DrWorkRequest DoctorWorkRequest) {
        this.DoctorWorkRequest = DoctorWorkRequest;
    }

    public ArrayList<MedicalReport> getMedicalReport() {
        return medicalReports;
    }

    public void setMedicalReport(ArrayList<MedicalReport> medicines) {
        this.medicalReports = medicines;
    }
}
