package com.mkpits.controlflowstructure;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {
	
		static BufferedReader br; //Object reference of BufferReader class
		static RegistrationForm rf; //Object reference of This Class
		
		String name ,email,address,mobileNo;
		long accountNumber;
		int age,pinCode,accountPin,accountType;
		float balance,withdrawAmount,dAmount;
		
	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome To Raj Bank :");
		
		br=new BufferedReader(new InputStreamReader(System.in));	//contructor of BufferReader Class
		rf=new RegistrationForm();	//Contructor of Registration Class
		 rf.details();
		 System.out.println("--------------------------------------------------------------------\n---------------------------------------------------------------");
		 System.out.println("Thank You For Using Raj Bank web site");
	}
	
	

	public void details() throws NumberFormatException, IOException {
		char ch='y';
		while(ch=='Y'||ch=='y') {
		
		System.out.println("Enter your choice:\n1) Create Account\n2) Deposite\n3) Withdraw\n4) Check Balance\n5) Account Details "); 
		int choice=Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			rf.createAccount();
		break;
		case 2:
			rf.deposite();
			break;
		case 3:
			rf.withdraw();
			break;
		case 4:
			rf.checkBalance();
			break;
		case 5:
			rf.accountDetails();
		
		}
		System.out.println("Do you want to continue press y/n");
		ch=(char)br.read();
		br.readLine();
		}
			
	}
	public void accountDetails() {
		System.out.println("Holder Name :"+name);
		System.out.println("Holder Email :"+email);
		System.out.println("Holder Address :"+address);
		System.out.println("Holder Mobile Number :"+mobileNo);
		System.out.println("Holder Pin-Code :"+pinCode);
		System.out.println("Holder Age :"+age);
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
		
		
		
	}



	public void checkBalance() throws NumberFormatException, IOException {
		System.out.println("Enter your Account Number :");
		accountNumber=Long.parseLong(br.readLine());
		System.out.println("Enter Your Account Pin:");
		accountPin=Integer.parseInt(br.readLine());
		if((accountNumber==123456789)&&accountPin==1234) {
			System.out.println("Your Account Balance is :"+balance);
		}else {
			System.out.println("Invalid Account Number or Id");
		}
		
	}

	public void withdraw() throws NumberFormatException, IOException {
		System.out.println("Enter your Account Number :");
		accountNumber=Long.parseLong(br.readLine());
		System.out.println("Enter Your Account Pin:");
		accountPin=Integer.parseInt(br.readLine());
		if((accountNumber==123456789)&&accountPin==1234) {
			System.out.println("Withdraw Amount :"); 
			withdrawAmount=Float.parseFloat(br.readLine());
			if(withdrawAmount>balance) {
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
		accountNumber=Long.parseLong(br.readLine());
		System.out.println("Enter Your Account Pin:");
		accountPin=Integer.parseInt(br.readLine());
		
		if((accountNumber==123456789)&&accountPin==1234) {
			System.out.println("Enter a Deposite Amount :");
			dAmount=Float.parseFloat(br.readLine());
			System.out.println("Your amount Successfully Deposite \n----------------------------------------------------------- ");
			System.out.println("Your Current Balance is :"+(dAmount+balance));	
		}else {
			System.out.println("Invalid Account Number or Id");
		}
		
		
	}

	public void createAccount() throws IOException {
		System.out.println("Enter your Name :");
		name=br.readLine();
		
		System.out.println("Enter your Email :");
		email=br.readLine();
		 String regex = "^(.+)@(.+)$";    
	        Pattern pattern = Pattern.compile(regex);   
	        Matcher matcher = pattern.matcher(email);
	        if (!matcher.matches()) {
					System.out.println("Email Not Valid");
				}
		
		System.out.println("Enter your age :");
		age=Integer.parseInt(br.readLine());
		
		System.out.println(" Your Permenent Address :");
		address=br.readLine();
		
		System.out.println("Pin-Code :");
		pinCode=Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter a Mobile Number :");
		mobileNo=br.readLine();
		while(mobileNo.isEmpty()|| mobileNo.length()!=10 || !mobileNo.matches("//d+")) {
			System.out.println("Invalid Mobile Number Plese Enter Valid Mobile Number");
			mobileNo=br.readLine();
			break;
		}
		
		
		long otp=(long)Math.floor(Math.random()*1000000);
		int otp1;
		do {
		System.out.println("otp is:"+otp);
		System.out.println("Enter OTP :");
		otp1=Integer.parseInt(br.readLine());
		}while (otp!=otp1);
		
		System.out.println("Enter Account type :\n1)Saving account \n2)Current Account ");
		accountType=Integer.parseInt(br.readLine());
		System.out.println("Please Pay minimum balance 5000 :");
		balance=Float.parseFloat(br.readLine());
		
		
		System.out.println("Account Successfully Created !\nYour details :\n--------------------------------------------");
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Age :"+age);
		System.out.println("Perement Address :"+address);
		System.out.println("Pin-Code :"+pinCode);
		System.out.println("Mobile Number :"+mobileNo);
		
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

