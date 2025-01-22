package com.lionbank;

/**
 * This class represents a bank account.
 *
 * This is our first example of a Java class.
 *
 * @version 1.0, 1/8/2025
 * @author John Crabtree
 */
public class Account {
	private int id;
	private double balance;
	
	public Account(int accountNumber) {
		id = accountNumber;
		balance = 0.0;
	}
	
	public Account(int accountNumber, double initailBalance) {
		id = accountNumber;
		balance = initailBalance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public double withdraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			return amount;
		}
		return 0.0;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return "" + id + ": Balance: " + balance;
	}
}
