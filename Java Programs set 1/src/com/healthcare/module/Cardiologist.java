package com.healthcare.module;

public class Cardiologist extends Doctor{
	public Cardiologist(String name) {
		super(name, "Cardiologist");
	}

	@Override
	public void diagnose(Patient patient) {
		System.out.println("Cardiologist " + name + " diagnosing patient: " + patient.getName());
		if(patient.getIllness().toLowerCase().contains("Heart")) {
			System.out.println("Diagnosis: Heart issues");
		} 
		else {
			System.out.println("Diagnosis: No heart issue");
		}
		
	}
	

}
