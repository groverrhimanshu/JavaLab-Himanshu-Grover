package com.bank.module;

public interface BankService {
	void addCustomer(Customer c);
    void showAllCustomers();
    void deposit(int id, double amount);
    void withdraw(int id, double amount);
    void createAccount(Account acc);
    Account getAccountByNumber(int accountNumber);
}
