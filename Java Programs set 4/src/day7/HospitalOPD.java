package day7;
import java.util.ArrayList;
import java.util.Scanner;

class Patient{
	private String name;
	private int age;
	private String disease;
	
	public Patient(String name,int age, String disease) {
		this.name = name;
		this.age = age;
		this.disease = disease;
		
	}
	public String getName() {
		return name;
	}
	public void displayDetails() {
		System.out.println("Name: " + name+ " Age: " +age+ " Disease: " +disease);
	}
}

public class HospitalOPD {

	public static void main(String[] args) {
		ArrayList<Patient> patientList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		patientList.add(new Patient("Vinay Bhat", 45, "Fever"));
		patientList.add(new Patient("Sushmita Sen", 49, "BP"));
		patientList.add(new Patient("Salman Khan", 53, "Marriage"));
		
		while(true)
		{
			System.out.println("\n Hospital OPD Menu: ");
			System.out.println("1. Add New Patient: ");
			System.out.println("2. Display New Patients");
			System.out.println("3. Search Patient by Name");
			System.out.println("4. Exit");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			
			sc.nextLine();
			
			switch(choice)
			{
			case 1: 
				System.out.print("Enter Patient Name : ");
				String name = sc.nextLine();
				System.out.println("Enter Patient Age : ");
				int age = sc.nextInt();
				System.out.println("Enter Patient Disease : ");
				String disease = sc.nextLine();
				patientList.add(new Patient(name,age,disease));
				System.out.println("Patient added successfully!");
				break;
				
				
				
			case 2:
				System.out.println("All Registered Patients : ");
				for(Patient p : patientList)
				{
					p.displayDetails();
				}
				break;
				
			case 3: 
				System.out.println("Enter Patient Name to Search.");
				String searchName = sc.nextLine();
				boolean found = false;
				
				for(Patient p: patientList)
				{
					if(p.getName().equalsIgnoreCase(searchName))
					{
						p.displayDetails();
						found = true;
					}
					if(!found)
					{
						System.out.println("No Patient Found with name : " + searchName);
					}
				break;
				}
					
			case 4:
				System.out.println("Exiting...");
				sc.close();
				return;
				
			default: 
				System.out.println("Invalid choice!");
				
				
					
					
					
				}
				
				
			}
			
		

		}

}
