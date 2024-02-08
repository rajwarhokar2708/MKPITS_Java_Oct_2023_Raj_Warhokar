package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleCatch {

	public static void main(String[] args) {
		/*
		 Using Multiple catch we thorws a error on console 
		 In Multiple catch we use more than one catch and we pass differnt exception on that
		 */
		int arr[]=new int[5];
		int x=10,y=0;
		
		try {
			System.out.println(arr[5]);
			System.out.println(x/y);
		}
		catch(ArrayIndexOutOfBoundsException|ArithmeticException obj) /*In this Senerio Check 
		a First Condition and it true ,means error occurs in that case so it print only First
		condition means(ArrayIndexOutOfBondException) , But if First condition is false so 
		it print secound condition and shows secound condition error 
		means(ArithmeticException)
		*/
		{
			obj.printStackTrace();
			
		}
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name :");
		String name=null;
		try {
			name=reader.readLine();
		}
		catch(ArrayIndexOutOfBoundsException obj) {
			obj.printStackTrace();
		}
		catch(ArithmeticException obj) {
			obj.printStackTrace();
		}
		catch(IOException obj) {
			obj.printStackTrace();
		}
		System.out.println(name);
	}

}
