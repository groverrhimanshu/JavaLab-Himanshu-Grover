package day10;
import java.util.Scanner;
import java.util.HashSet;

class Doctor{
	private int LicenceNumber;
	private String name;
	private String department;
	
	public Doctor(int LicenceNumber, String name, String department) {
		this.LicenceNumber = LicenceNumber;
		this.name = name;
		this.department = department;
	}
	
	public boolean equals(Object o) {
		if(this==o) 
			return true;
		if(!(o instanceof Doctor)) 
			return false;
		Doctor other = (Doctor) o;
		return this.LicenceNumber = other.LicenceNumber;
	}
	public int hashcode(){
		return Integer.hashCode(LicenceNumber);
	} 
	public String toString() {
		return "Doctor ID: " +LicenceNumber+ " ,Name: " +name+ " ,Department: " + department;
	}
	
}

public class DoctorRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Doctor> doctorset = new HashSet<>();
		
		while(true)
		{
			System.out.println("Doctor Registration");
            System.out.println("1. Register Doctor");
            System.out.println("2. View all Registered Doctors");
            System.out.println("3. Exit");
            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();
            
            switch(choice)
            {
            case 1:
            	System.out.print("Enter Doctor License Number: ");
            	int LicenceNumber = sc.nextInt();
            	sc.nextLine();
            	
            	System.out.print("Enter Doctor Name: ");
            	String name = sc.nextLine();
            	
            	System.out.print("Enter Doctor Department: ");
            	String department = sc.nextLine();
            	
            	Doctor newDoctor = new Doctor(LicenceNumber, name, department);
            	
            	if(doctorset.add(newDoctor)) {
            		System.out.print("Doctor Registration successfull!");
            	}
            	else
            	{
            		System.out.print("Doctor with License Number " +LicenceNumber+ "is already registered");
            	}
            	break;
            	
            case 2:
                  System.out.println("\nRegistered Doctors:");
                  for (Doctor d : doctorset) {
                        System.out.println(d);
                    }
                
                break;
                
            case 3:
            	System.out.println("Exitingg");
            	return;
            	
            	default:
            		System.out.println("Exitingg");
            		
            	
            }
		}

	}

}
