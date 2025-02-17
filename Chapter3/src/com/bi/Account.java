package com.bi;

public class Account {
	private int id;
	private double balance;
	
	public Account(double balance) {
		this.id = 123;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
}