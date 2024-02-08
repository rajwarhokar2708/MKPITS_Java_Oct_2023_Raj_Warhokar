package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubGetData extends GetData {
	
	public void getMobile(long number) {
		System.out.println("Mobile Number :"+number);
	}
	public void getGender(char gender) {
		System.out.println("Gender :"+gender);
	}
	public void getPinCode(int pinCode) {
		System.out.println("Pin Code :"+pinCode);
	}
	
	public void getDetails() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Name :");
		String fName=br.readLine();
		while(fName.isEmpty()) {
			System.out.println("Plese Enter Name :");
			fName=br.readLine();
			
		}
		System.out.println("Enter Last Name :");
		String lName=br.readLine();
		System.out.println("Enter Email :");
		String email=br.readLine();
//		String regex=(!,@,#,$,&,*,%);
		System.out.println("Enter Mobile Number :");
		long number=Long.parseLong(br.readLine());
		System.out.println("Enter Gender :");
		char gender=(char)br.read();br.readLine();
		System.out.println("Enter Pin Code :");
		int pinCode=Integer.parseInt(br.readLine());
		
		System.out.println("\n-------------------------------------------\n");
		
		getFname(fName);
		getLname(lName);
		getEmail(email);
		getMobile(number);
		getGender(gender);
		getPinCode(pinCode);
		
	}
	
}
