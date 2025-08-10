package com.bank.module;
import java.util.Scanner;

public class BankServiceImpl implements BankService{

	Customer[] customers = new Customer[5];
    int index = 0;

    public void addCustomer(Customer c) {
        if (index < customers.length) {
            customers[index++] = c;
        }
    }

    public void showAllCustomers() {
        for (int i = 0; i < index; i++) {
            System.out.println(customers[i].getId() + " - " +
                               customers[i].getName() + " - Balance: ₹" +
                               customers[i].getBalance());
        }
	

}
    public void deposit(int id, double amount) {
        for (int i = 0; i < index; i++) {
            if (customers[i].getId() == id) {
                customers[i].deposit(amount);
                System.out.println("₹" + amount + " deposited.");
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    public void withdraw(int id, double amount) {
        for (int i = 0; i < index; i++) {
            if (customers[i].getId() == id) {
                if (customers[i].withdraw(amount)) {
                    System.out.println("₹" + amount + " withdrawn.");
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
        }
        System.out.println("Customer not found.");
    }
}
    
