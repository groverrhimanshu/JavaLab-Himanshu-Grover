package com.healthcare.module;

import java.util.Scanner;

public class HealthcareModule {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PatientService service = new PatientServiceImpl();

		System.out.print("Enter number of patients to add: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for patient " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Illness: ");
            int illness = sc.nextline();
            
       
		Patient p1 = new Patient(id,name,age,illness);
        Patient p2 = new Patient(id,name,age,illness);

        service.registerPatient(p1);
        service.registerPatient(p2);

        System.out.println("\nPatient Details:");
        service.showPatientDetails();
        service.showPatientDetails();
        service.showAllPatients();
       

      
        
        
        
    }
	}}
	


