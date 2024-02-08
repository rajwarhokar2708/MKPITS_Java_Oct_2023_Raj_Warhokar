package com.mkpits.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConstrutorThis {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name :");
		String name=br.readLine();
		System.out.println("Enter your email :");
		String email=br.readLine();
		System.out.println("Enter your Mobile No. :");
		long mobileNo=Long.parseLong(br.readLine());
		System.out.println("Enter your Age :");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter your password");
		String password=br.readLine();
		String pass="raj@123";
		
		
		
		if(password.equals(pass)) {
			System.out.println("Your name is :"+name);
			System.out.println("Your Email Id is :"+email);
			System.out.println("Mobile No :"+mobileNo);
			System.out.println("Your Age :"+age);
			System.out.println("---------------------------");
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Password incorrect Login Unsuccessful");
		}
		
	
	}

}
