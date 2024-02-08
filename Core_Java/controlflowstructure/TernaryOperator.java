package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TernaryOperator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Num 1 :");
		int num1=Integer.parseInt(br.readLine());
		System.out.println("Enter Num");
		int num2=Integer.parseInt(br.readLine());
		
		System.out.println((num1>num2)?"Num 1 is Greater than Num2":"Num2 is Gretater than Num1");
		
	}

}
