package com.mkpits.exception;

public class DefaultHandling {

	public static void main(String[] args) {
		// TODO Unchecked Exception 
		//In this Unchecked Exception If error throws then it brake a code and  below code is not exceuted
		int []arr=new int[5];
	//	System.out.println(arr[5]);//During runtime Thorws Array Index Out Of Bound Exception
		
		int x=10,y=0;
		System.out.println(x/y);//during Runtime Throws Airthmetic Exception
	}

}
