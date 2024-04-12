package com.mkpits.model;

public class Student {
	private String firstName;
	private String lastName;
	private boolean isgoidCustomer;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isIsgoidCustomer() {
		return isgoidCustomer;
	}
	public void setIsgoidCustomer(boolean isgoidCustomer) {
		this.isgoidCustomer = isgoidCustomer;
	}
	public Student(String firstName, String lastName, boolean isgoidCustomer) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isgoidCustomer = isgoidCustomer;
	}
}
