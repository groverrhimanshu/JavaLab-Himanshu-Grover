package com.bank.module;

public class Account {
	protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

}
class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }
}
