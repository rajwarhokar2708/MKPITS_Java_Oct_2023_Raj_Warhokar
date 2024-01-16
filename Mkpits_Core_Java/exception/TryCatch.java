package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In Try Catch Exception If Error are found It throws excpetion and Execute below Code 
		int []arr1=new int [5];
		int x=10,y=0;
		try {
			System.out.println(arr1[5]);
		}catch(Exception e){
			e.printStackTrace();//printStackTrace method shows the excepition on console And run a below code
		}
		System.out.println("------>");
		
		try {
			System.out.println(x/y);
		}catch(Exception e) {
			e.getStackTrace();//getStackTrace method will not shows the excepition on console And run a below code
		}
		System.out.println("--->Ok");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a name: ");
		try {
			String name=br.readLine();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception");
		}

	}

}
