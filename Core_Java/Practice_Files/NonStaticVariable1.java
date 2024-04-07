package com.mkpits.variable_scope;

public class NonStaticVariable1 {
	//Non-Static variable can call using only object it is the only way to call Non-static variable
	public boolean correctDirection;
	public byte value;
	public short ticketNo;
	public int price;
	public long mobileNumber;
	public float pie;
	public double accountBalance;
	public char alphabet;

	public static void main(String[] args) {
		// All type of datatype and his value
		NonStaticVariable1 nsv1=new NonStaticVariable1();
		
		
		System.out.println("Default value of boolean datatype is :"+nsv1.correctDirection);
		System.out.println("Default value of byte datatype is :"+nsv1.value);
		System.out.println("Default value of short datatype is :"+nsv1.ticketNo);
		System.out.println("Default value of int datatype is :"+nsv1.price);
		System.out.println("Default value of long datatype is :"+nsv1.mobileNumber);
		System.out.println("Default value of float datatype is :"+nsv1.pie);
		System.out.println("Default value of double datatype is :"+nsv1.accountBalance);
		System.out.println("Default value of char datatype is :"+nsv1.alphabet);
		System.out.println("heyy buddy");

	}

}
