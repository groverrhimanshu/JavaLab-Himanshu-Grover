package day6;
import java.util.Scanner;

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class User {
    int pin;
    double balance;

    public User(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePin(int enteredPin) throws InvalidPinException {
        if (this.pin != enteredPin) {
            throw new InvalidPinException("Invalid PIN entered.");
        }
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. Current balance: ₹" + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance to withdraw ₹" + amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
    }

    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }
}

public class Handling {
    
    
    static User[] users = {
        new User(1234, 5000),
        new User(2345, 8000),
        new User(3456, 10000)
    };

    
    public static User findUserByPin(int enteredPin) {
        for (User user : users) {
            if (user.pin == enteredPin) {
                return user;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User currentUser = null;
        int attempts = 0;
        boolean authenticated = false;

        try {
            System.out.println("Welcome to the ATM");

            while (attempts < 3 && !authenticated) {
                System.out.print("Enter 4-digit PIN: ");
                int pin = sc.nextInt();
                currentUser = findUserByPin(pin);

                if (currentUser == null) {
                    System.out.println("Access Denied: Invalid PIN.\n");
                    attempts++;
                } else {
                    try {
                        currentUser.validatePin(pin);
                        authenticated = true;
                        break;
                    } catch (InvalidPinException e) {
                        System.out.println("Access Denied: " + e.getMessage() + "\n");
                        attempts++;
                    }
                }
            }

            if (!authenticated) {
                System.out.println("Maximum login attempts exceeded. Card blocked.");
                return;
            }

            
            int choice;
            do {
                System.out.println("\n--- ATM MENU OPTIONS ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        currentUser.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ₹");
                        double depositAmount = sc.nextDouble();
                        currentUser.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ₹");
                        double withdrawAmount = sc.nextDouble();
                        try {
                            currentUser.withdraw(withdrawAmount);
                        } catch (InsufficientBalanceException e) {
                            System.out.println("Transaction Failed: " + e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }

            } while (choice != 4);

        } finally {
            sc.close();
            System.out.println("\nSession ended. Please take your card.");
        }
    }
}


///MultiThreading
///package wd;
 
/*class TicketBooking
{
	int availableSeats=1;
public synchronized void bookTicket(String name)
{
	if(availableSeats>0)
	{
		System.out.println(name + " is booking ticket...");
		try {
			Thread.sleep(1000);
		    }
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	System.out.println(name +" successfully booked the ticket!");
	availableSeats--;
	}
	else
	{
	System.out.println(" sorry "+ name +" , seat already booked!");
 
	}
	}
	}
class User extends Thread
{
	TicketBooking booking;
	String userName;
	public User (TicketBooking booking, String userName)
	{
		this.booking=booking;
		this.userName=userName;
	}
	public void run()
	{
		booking.bookTicket(userName);
	}
}
 
public class TicketBookingSystem {
 
	public static void main(String[] args)
	{
		TicketBooking booking=new TicketBooking();
		
		User user1=new User(booking,"Renu");
		User user2=new User(booking,"Sai");
		User user3=new User(booking,"Mahasa");
        user1.start();
        user2.start();
        user3.start();
	}
 
}*/
 
