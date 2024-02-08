package com.mkpits.abstraction;

public class CallingAbstractClass {

	public static void main(String[] args) {
		Shape s1=new Circle("Red",4.2);
		Shape s2=new Rectangle("Blue",12,5);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
	}

}
