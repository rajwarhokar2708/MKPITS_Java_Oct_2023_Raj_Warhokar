package com.mkpits.variable_scope;

public class Call_2 {
	
	//static block variable can not call outside the block but -
	//we call by object of this class by default static block are called
	static {
		String my_Name="Raj";
		System.out.println("My name is "+my_Name);
	}
	static String name="Raj";
	public static void main(String[]args) {
		System.out.println("password : "+Call_1.password);
		//System.out.println("My name is "+my_Name);
		//System.out.println(name);
	}

}
