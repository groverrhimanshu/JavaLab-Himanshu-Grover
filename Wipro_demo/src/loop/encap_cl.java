package loop;

public class encap_cl {

	public static void main(String[] args) {
		
		//1. Employee 
		Employee emp = new Employee(50000);
        System.out.println("Initial Salary: ₹" + emp.getSalary());
        emp.setSalary(60000);
        emp.showDetails();
		
		//2. Bank Account
		/*Bank account = new Bank("Amit Sharma", 10000);

        account.showAccountInfo();

        account.deposit(5000);
        account.withdraw(3000);
        account.withdraw(15000); // should show "Insufficient balance"

        account.showAccountInfo();*/
		
		//5. voting
		Voting voter1 = new Voting("Himanshu", "V12");
        Voting voter2 = new Voting("Grover", "V56");

        voter1.showVoterInfo();
        voter1.castVote();   

        System.out.println();

        voter2.showVoterInfo();
        voter2.castVote();
		
		//3. car
		/*Car c1 = new Car();
		c1.getar();
		c1.getcar();
		c1.getCar();
		c1.displayinfo();*/
		
	}
}

