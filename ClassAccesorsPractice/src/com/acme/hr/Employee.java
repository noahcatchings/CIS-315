package com.acme.hr;

public class Employee{
	private Timesheet week = new Timesheet();
	protected int id;
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return "an employee with " + week.hours;
	}
}