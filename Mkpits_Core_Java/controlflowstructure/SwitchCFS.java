package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCFS {
		static BufferedReader br;
		static SwitchCFS sCFS;
		float balance;
		
	public static void main(String[] args) throws IOException {
		br=new BufferedReader(new InputStreamReader(System.in));
		sCFS=new SwitchCFS();
		 sCFS.details();
		 System.out.println("--------------------------------------------------------------------\n---------------------------------------------------------------");
		 System.out.println("Thank You For Using Raj Bank web site");
	}
	
	

	public void details() throws NumberFormatException, IOException {
		char ch='Y';
		while(ch=='Y'||ch=='y') {
		
		System.out.println("Enter your choice:\n1) Create Account\n2) Deposite\n3) Withdraw\n4) Check Balance\n5) Account Details "); 
		int choice=Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			sCFS.createAccount();
		break;
		case 2:
			sCFS.deposite();
			break;
		case 3:
			sCFS.withdraw();
			break;
		case 4:
			sCFS.checkBalance();
			break;
		
		}
		System.out.println("Do you want to continue press y/n");
		ch=(char)br.read();
		br.readLine();
		}
			
	}
	public void checkBalance() throws NumberFormatException, IOException {
		System.out.println("Enter your Account Number :");
		long accountNumber=Long.parseLong(br.readLine());
		System.out.println("Enter Your Account Pin:");
		int accountPin=Integer.parseInt(br.readLine());
		if((accountNumber==123456789)&&accountPin==1234) {
			System.out.println("Your Account Balance is :"+balance);
		}else {
			System.out.println("Invalid Account Number or Id");
		}
		
	}

	public void withdraw() throws NumberFormatException, IOException {
		System.out.println("Enter your Account Number :");
		long accountNumber=Long.parseLong(br.readLine());
		System.out.println("Enter Your Account Pin:");
		int accountPin=Integer.parseInt(br.readLine());
		if((accountNumber==123456789)&&accountPin==1234) {
			System.out.println("Withdraw Amount :");
			float withdrawAmount=Float.parseFloat(br.readLine());
			if(withdrawAmount<=5001) {
				System.out.println("Insufficient balance");
			}else {
				System.out.println("You withdraw "+withdrawAmount+" Amount \n-------------------------------------------------");
			}
			System.out.println("Your Current Account Balance :"+(balance-withdrawAmount));
			
		}else {
			System.out.println("Invalid Account Number or Id"); 
		}
		
	}

	public void deposite() throws NumberFormatException, IOException {
		System.out.println("Enter your Account Number :");
		long accountNumber=Long.parseLong(br.readLine());
		System.out.println("Enter Your Account Pin:");
		int accountPin=Integer.parseInt(br.readLine());
		
		if((accountNumber==123456789)&&accountPin==1234) {
			System.out.println("Enter a Deposite Amount :");
			float dAmount=Float.parseFloat(br.readLine());
			System.out.println("Your amount Successfully Deposite \n----------------------------------------------------------- ");
			System.out.println("Your Current Balance is :"+(dAmount+balance));	
		}else {
			System.out.println("Invalid Account Number or Id");
		}
		
		
	}

	public void createAccount() throws IOException {
		System.out.println("Enter your Name :");
		String name=br.readLine();
		System.out.println("Enter your Email :");
		String email=br.readLine();
		System.out.println("Enter a Mobile Number :");
		long mobileNo=Long.parseLong(br.readLine());
		System.out.println("Enter your age :");
		int age=Integer.parseInt(br.readLine());
		System.out.println(" Your Permenent Address :");
		String address=br.readLine();
		System.out.println("Pin-Code :");
		int pinCode=Integer.parseInt(br.readLine());
		System.out.println("Enter Account type :\n1)Saving account \n2)Current Account ");
		int accountType=Integer.parseInt(br.readLine());
		System.out.println("Please Pay minimum balance 5000 :");
		balance=Float.parseFloat(br.readLine());
		
		System.out.println("Account Successfully Created !\nYour details :\n--------------------------------------------");
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Mobile Number :"+mobileNo);
		System.out.println("Age :"+age);
		System.out.println("Perement Address :"+address);
		System.out.println("Pin-Code :"+pinCode);
		switch(accountType) {
		case 1:
			System.out.println("Account Type : Saving Account");
			break;
		case 2:
			System.out.println("Account Type : Current Account");
			break;
			default:
				System.out.println("Invalid Input");
				
		}
		System.out.println("Your Account Balance is :"+balance);
		
		}
		
		
	}


