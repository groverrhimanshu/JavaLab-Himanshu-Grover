package loop;

public class Bank {
	    private String accountHolder;
	    private double balance;	    
	    public Bank(String name, double initialDeposit) {
	        accountHolder = name;
	            balance = initialDeposit;     
	    }  
	    public double getBalance() {
	        return balance;
	    } 
	    public void deposit(double amount) {
	            balance += amount;
	            System.out.println("Deposited ₹" + amount);	        
	    }	    
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrawn ₹" + amount);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }    
	    public void showAccountInfo() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Available Balance: ₹" + balance);
	    }	    
	    public static void main(String[] args) {
	        
	    }
	}
