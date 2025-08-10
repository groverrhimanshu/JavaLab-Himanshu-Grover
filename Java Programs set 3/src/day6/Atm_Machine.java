package day6;
import java.util.Scanner;

class InvalidPinException extends Exception{
	public InvalidPinException(String message) {
		super(message);
	}
}


public class Atm_Machine {
	final int CORRECT_PIN =1234;
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pin: ");
		int enteredPin = sc.nextInt();
		try {
			if(enteredPin != CORRECT_PIN) {
				throw InvalidPinException ("Invalid Pin. Try Again");
			}
			System.out.println("Correct Pin. Welcome");
			catch(InvalidException e){
				System.out.println("Access Denied: " +e.getMessage());
			}
			finally {
				System.out.println("Transaction Session Ended. Please remove your card");
			}
		sc.close();
		

	

}
