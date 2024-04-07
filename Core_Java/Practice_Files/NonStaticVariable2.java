package com.mkpits.variable_scope;

public class NonStaticVariable2 {
	
	//Non static variable can call by object always 
	//Their is the only way to call non static variable is create object and call by object. variable name eg(objectname.variableName)

	public boolean correctDirection=true;
	public byte value=2;
	public short ticketNo=897;
	public int price=1000;
	public long mobileNumber=9538527890l;
	public float pie=3.14f;
	public double accountBalance=45144.56541;
	public char alphabet='r';

	public static void main(String[] args) {
		NonStaticVariable2 nsc2=new NonStaticVariable2();
		
		System.out.println("Say its Correct Direction true or false ="+nsc2.correctDirection);
		System.out.println("Value is :"+nsc2.value);
		System.out.println("Ticket number :"+nsc2.ticketNo);
		System.out.println("Headset price :"+nsc2.price);
		System.out.println("Mobile number :"+nsc2.mobileNumber);
		System.out.println("Pie value is : "+nsc2.pie);
		System.out.println("Account balance :"+nsc2.accountBalance);
		System.out.println("Alphabet :"+nsc2.alphabet);
		System.out.println("heyy buddy");
	}

}
