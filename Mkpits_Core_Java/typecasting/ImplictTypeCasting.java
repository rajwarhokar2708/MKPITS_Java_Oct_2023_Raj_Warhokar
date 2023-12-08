package com.mkpits.typecasting;

public class ImplictTypeCasting//(It callled Wideing also)
{
	//implict is a type casting method 
	
	//type casting is to change a value of one datatype into another datatype
	
	//if destination type variable is larger than source type variable,-
	//-but reverse is not allowed.
	
	//If we add two integral number than it take by default integer value
	public static void main(String[] args) {
		//ImplictTypeCasting itc=new ImplictTypeCasting();
		short num1=1;
		short num2=2;
		int value=num1 + num2;
		System.out.println(value);
		ImplictTypeCasting.implict();
	}

	public static void implict() {
		byte b=8;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		boolean bo=true;
		boolean bo1=bo;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bo);
		System.out.println(bo1);
		
		
	}

}
