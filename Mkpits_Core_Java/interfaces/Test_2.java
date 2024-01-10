package com.mkpits.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_2 implements Test_1{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	@Override
	public void createAcc() throws IOException {
		System.out.println("Enter your Name : ");
		String name=br.readLine();
		System.out.println("Enter Email :-");
		String email=br.readLine();
		System.out.println("Enter mobile number :");
		long moNum=Long.parseLong(br.readLine());
		System.out.println("Enter Pin code :");
		int pinCode=Integer.parseInt(br.readLine());
		System.out.println("Enter gender :");
		char gender=(char) br.read();
		System.out.println("Enter address :");
		String address=br.readLine();
		
		
		System.out.println();
		
		
		
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accDetails() {
		
		
	}
	


}
