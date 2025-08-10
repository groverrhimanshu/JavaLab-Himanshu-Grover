package day10;
import java.util.Scanner;
import java.util.HashSet;

class Patient {
	private int id;
	private String name;
	private String disease;
	

public Patient(int id, String name, String disease){
	this.id=id;
	this.name=name;
	this.disease=disease;
}
public boolean equals(Object o) {
	if(this==o) 
		return true;
	if(!(o instanceof Patient)) 
		return false;
	Patient other = (Patient) o;
	return this.id = other.id;
}
public int hashcode(){
	return Integer.hashCode(id);
}
public String toString() {
	return "Patient ID: " +id+ " ,Name: " +name+ " ,Disease: " + disease;
}
}

public class HospitalRegistration {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		HashSet<Patient> patientset = new HashSet<>();
		
		while (true) {
            System.out.println("Hospital Registration System");
            System.out.println("1. Register Patient");
            System.out.println("2. View all Registered Patients");
            System.out.println("3. Exit");
            System.out.println("Enter Choice: ");
            int choice = SC.nextInt();
            
            switch(choice)
            {
            case 1:
            	System.out.print("Enter Patient ID: ");
            	int id = SC.nextInt();
            	SC.nextLine();
            	
            	System.out.print("Enter Patient Name: ");
            	String name = SC.nextLine();
            	
            	System.out.print("Enter Patient Disease: ");
            	String disease = SC.nextLine();
            	
            	Patient newPatient = new Patient(id, name, disease);
            	
            	if(patientset.add(newPatient)) {
            		System.out.print("Patient Registration successful!");
            	}
            	else
            	{
            		System.out.print("Patient with ID " +id+ "i1s already registered");
            	}
            	break;
            	
            case 2:
                  System.out.println("\nRegistered Patients:");
                  for (Patient p : patientset) {
                        System.out.println(p);
                    }
                
                break;
                
            case 3:
            	System.out.println("Exitingg");
            	return;
            	
            	default:
            		System.out.println("Exitingg");
            		
            	
            }

	}

}}
