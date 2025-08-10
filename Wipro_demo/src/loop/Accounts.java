package loop;

class Accounts {
	void displayDetails() {
        System.out.println("Types: Saving Account, Current Account");
        System.out.println("Balance" );
        
    }
}
class Savings extends Accounts{
	void SavingDetails() {
		System.out.println("Type: Saving Account");
        System.out.println("Balance: 100000");
	}
}
class Current extends Accounts{
	void CurrentDetails() {
		System.out.println("Type: Current Account");
        System.out.println("Balance: 500000");
	}
}
