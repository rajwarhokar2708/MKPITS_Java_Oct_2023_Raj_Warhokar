package com.mkpits.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegistrationForm {
	String fName,lName,email,password;
	long mobileNo;
	int age;
	char gender;
	public static void main(String[] args) throws Exception {
		RegistrationForm rf=new RegistrationForm();
		rf.register();
	}

	public void register() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your First Name");
		fName=br.readLine();
		System.out.println("Enter your Last Name ");
		lName=br.readLine();
		System.out.println("Enter your Email");
		email=br.readLine();
		System.out.println("Enter Mobile Number");
		mobileNo=Long.parseLong(br.readLine());
		System.out.println("Enter your Age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter your gender");
		this.gender=(char)br.read();
		br.readLine();
		System.out.println("Enter your Password");
		password=br.readLine();
		
		
		
		
		System.out.println("Your name is :"+fName+" "+lName);
		System.out.println("Your Email ID :"+email);
		System.out.println("Mobile No :"+mobileNo);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
		System.out.println("Password :"+password);
		System.out.println("-----------------------------------------");
		System.out.println("Registration Successfully");
		
	}

}
