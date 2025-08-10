package com.bank.module;
import java.util.Scanner;

public class BankApp {
	static Scanner sc = new Scanner(System.in);
    static BankService service = new BankServiceImpl();

	public static void main(String[] args) {
		static Scanner sc = new Scanner(System.in);
	    static BankService service = new BankServiceImpl();
	    while (true) {
            showMenu();
            int choice = sc.nextInt();

            if (choice == 1) {
                createAccount();
            } else if (choice == 2) {
                deposit();
            } else if (choice == 3) {
                withdraw();
            } else if (choice == 4) {
                showBalance();
            } else if (choice == 5) {
                showAllAccounts();
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    

    static void showMenu() {
        System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Show Balance\n5. All Accounts\n6. Exit");
        System.out.print("Choose: ");
    }

    static void createAccount() {
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Type (1 - Savings, 2 - Current): ");
        int type = sc.nextInt();

        Account acc;
        if (type == 1) {
            acc = new SavingsAccount(accNo, name, balance);
        } else {
            acc = new CurrentAccount(accNo, name, balance);
        }

        service.createAccount(acc);
    }

    static void deposit() {
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        Account acc = service.getAccountByNumber(accNo);
        if (acc != null) acc.deposit(amount);
        else System.out.println("Account not found.");
    }

    static void withdraw() {
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();

        Account acc = service.getAccountByNumber(accNo);
        if (acc != null) acc.withdraw(amount);
        else System.out.println("Account not found.");
    }

    static void showBalance() {
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();

        Account acc = service.getAccountByNumber(accNo);
        if (acc != null) acc.showBalance();
        else System.out.println("Account not found.");
    }

    static void showAllAccounts() {
        service.showAllAccounts();
    }

	}

}
