package com.mkpits.method;

public class MethodWithArugument {

	public static void main(String[] args) {
		String getFirstName="Raj";
		String getLastName="Kumar";
		String getEmail="rajkumar@gmail.com";
		long getMobileNo=258963147l;
		String getPassword="raj@12234";
		String getGender="Male";
		int getPinCode=440030;
		MethodWithArugument mWA=new MethodWithArugument();
		mWA.firstName(getFirstName);
		mWA.lastName(getLastName);
		mWA.email(getEmail);
		mWA.mobileNumber(getMobileNo);
		mWA.password(getPassword);
		mWA.gender(getGender);
		mWA.pinCode(getPinCode);
		}

	public void pinCode(int getPinCode) {
		System.out.println("Pin Code :-"+getPinCode);
		
	}

	public void gender(String getGender) {
		System.out.println("Gender :-"+getGender);
		
	}

	public void password(String getPassword) {
		System.out.println("Password :-"+getPassword);
		
	}

	public void mobileNumber(long getMobileNo) {
		System.out.println("Mobile nuber :-"+getMobileNo);
		
	}

	public void email(String getEmail) {
		System.out.println("Email :-"+getEmail);
	}

	public void lastName(String getLastName) {
		System.out.println("Last Name :-"+getLastName);
		
	}

	public void firstName(String getFirstName) {
		System.out.println("First Name :-"+getFirstName);
		
	}
}
