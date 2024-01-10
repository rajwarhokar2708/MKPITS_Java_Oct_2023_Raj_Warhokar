package com.mkpits.inheritance;

public class TestDemo2 extends TestDemo{
	
	long mobile_No,pinCode;
	public void integerData(int  mobile_No,int  pinCode) 
	{
		this.mobile_No=mobile_No;
		this.pinCode=pinCode;
	}
	public void display() 
	{
		super.display();
		System.out.println("Mobile number : "+mobile_No+"\nPin Code :"+pinCode);
		
	}
	
	
	
}
