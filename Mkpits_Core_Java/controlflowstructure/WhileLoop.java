package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number :");
		int num1=Integer.parseInt(reader.readLine());
		System.out.println("Enter a number :");
		int num2=Integer.parseInt(reader.readLine());
		while (num1<num2) {
			System.out.println("");
		}
	}

}
