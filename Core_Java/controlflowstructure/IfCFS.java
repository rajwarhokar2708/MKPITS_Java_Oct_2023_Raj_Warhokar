package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfCFS {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name :");
		String name=br.readLine();
		if(name.equals("Raj")) {
			System.out.println("Login Successfull.......");
		}else {
			System.out.println("Login Unsuccessfull");
		}
			
		

	}

}
