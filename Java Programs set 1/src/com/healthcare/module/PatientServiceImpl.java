package com.healthcare.module;

public class PatientServiceImpl implements PatientService {
    private Patient[] patients = new Patient[4];
    private int count = 0;
    public void registerPatient(Patient patient) {
        if (count < patients.length) {
            patients[count] = patient;
            
            count++;
        } else {
            System.out.println("Cannot register more patients. Storage is full.");
        }
    }
   /* public void showPatientDetails(int patientId) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (patients[i].getId() == patientId) {
                System.out.println("ID: " + patients[i].getId());
                System.out.println("Name: " + patients[i].getName());
                System.out.println("Age: " + patients[i].getAge());
                System.out.println("Illness: " + patients[i].getIllness());
                found = true;
                break;
            }
        }
        
    }*/
    public void showAllPatients() {
        if (count == 0) {
            System.out.println("No patients added yet.");
        } else {
            for (int i = 0; i < count; i++) {
                patients[i].display();
            }
        }
    }
}