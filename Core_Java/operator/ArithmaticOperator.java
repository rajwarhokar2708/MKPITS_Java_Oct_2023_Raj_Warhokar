package com.mkpits.operator;

public class ArithmaticOperator {
	int a=65,b=35;
	int add=a+b;

	public static void main(String[] args) {
		ArithmaticOperator opretor=new ArithmaticOperator();
		
		opretor.add();
		
		System.out.println(opretor.sub());
		
		int mult=opretor.mul(5,6);
		System.out.println(mult);
		
		opretor.div(16,4);
		
		opretor.module();
		
		System.out.println(opretor.add);//call by variable 
		
	}

	private void module() {
		int a=32,b=12;
		int c =a+b;
		System.out.println("Addition of c is :"+c);
		
	}

	private void div(int a ,int b)//Call with Argument and parameter
	{
		int  c=a/b;
		System.out.println("Division of a and b is :"+c);
		
	}

	private int mul(int a,int b) //Call with argument-parameter and return type
	{
		int c=a+b;
		return c;
		
	}

	private int sub()// Call with return type
	{
		int a=35,b=5;
		int c=a-b;
		return c;
		
	}

	private void add()//Direct call
	{
		int a=12 ,b=5;
		int c=a+b;
		
		System.out.println(c);
		
	}

}
