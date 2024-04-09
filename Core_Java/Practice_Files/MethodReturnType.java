package com.mkpits.method;

public class MethodReturnType {

	public static void main(String[] args) {
		MethodReturnType mRT=new MethodReturnType();
		System.out.println("First Name :-"+mRT.getFirstName());
		System.out.println("Last Name :-"+mRT.getLastName());
		System.out.println("Email :-"+mRT.getEmail());
		System.out.println("Mobile No. :-"+mRT.getPassword());
		System.out.println("Pin code :-"+mRT.getPinCode());
		System.out.println("Gender :-"+mRT.getGender());
		System.out.println("Password :-"+mRT.getPassword());
	}
	public String getFirstName() {
		String name="Raj";
		
		return name;
	}
	public String getLastName() {
		String lName="Kumar";
		return lName;
	}
	public String getEmail() {
		String email="rajkumar@gmail.com";
		return email;
	}
	public long getMobileNo() {
		long mobileNumber=7020881363l;
		return mobileNumber;
	}
	public int getPinCode() {
		int pinCode=440030;
		return pinCode;
	}
	public String getGender() {
		String gender="male";
		return gender;
	}
	public String getPassword() {
		String password="raj@1234";
		return password;
	}
	
}


