package day12;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

class Patient implements Serializable //marker interface(means no methods or fields)
{
	int id;
	String name;
	String disease;
	int age;
	public Patient(int id, String name, String disease, int age)
	{
	this.id=id;
	this.name=name;
	this.disease=disease;
	this.age=age;
    }
 
	public String toString()
	{
		return id + " - "+ name + " - " + disease + " - " + age;
	}
}

public class PatientApp {

	public static void main(String[] args) {
		LinkedList<Patient> patientList = new LinkedList<>();
		Scanner sc= new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
            System.out.println("Enter Patient " + (i + 1) + " ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name:");
            String name = sc.nextLine();

            System.out.println("Enter Disease:");
            String disease = sc.nextLine();

            System.out.println("Enter Age:");
            int age = sc.nextInt();
            sc.nextLine();

            patientList.add(new Patient(id, name, disease, age));
        }

		
		
		
		
		//save patient object to file
		try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("patients.dat"));
            out.writeObject(patientList);
            out.close();
            System.out.println("Patient list saved.");
        } catch (IOException e) {
            System.out.println("Error saving patient list.");
        }
		//Read patient object from file
		try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("patients.dat"));
            LinkedList<Patient> loadedList = (LinkedList<Patient>) in.readObject();
            in.close();
            System.out.println("Loaded patient list:");
            for (Patient p : loadedList) {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println("Error loading patient list.");
        }
		

	}

}
