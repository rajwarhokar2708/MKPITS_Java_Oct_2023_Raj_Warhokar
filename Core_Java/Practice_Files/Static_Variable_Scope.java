package com.mkpits.variable_scope;

public class Static_Variable_Scope {
	
	public static String email="rajwarhokar@gmail.com";

	public static void main(String[] args) {
		//Static variable value cannot delocate
		//Static variable cannot call in method they call in only class
		//There are three type to call Static variable
		//1)call by variable in same class 
		//2)call by class name and variable name (class_name.variable_name)
		//it is mostly use in project and it is access in any class in current package
		//3)call by object or call by instance
		
		String bank_Name="SBI";
				
				System.out.println("Bank Name :"+bank_Name);
				System.out.println("Email :"+email);
		
	}
}
