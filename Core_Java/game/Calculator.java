package com.mkpits.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	static BufferedReader br;
	public static void main(String[] args) throws NumberFormatException, IOException {
		Calculator cal=new Calculator();
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Calculator");
		cal.add();

	}

	public void add() throws NumberFormatException, IOException {
		System.out.println("Enter number :");
		long num1=Long.parseLong(br.readLine());
		long num2;
		System.out.println("Enter + - * /");
		char opr=(char) br.read();br.readLine();
		char ch=opr;
		
		switch(ch)
		{
		case '+':
			System.out.println("Enter number :");
			 num2=Long.parseLong(br.readLine());
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case '-':
			System.out.println("Enter number :");
			num2=Long.parseLong(br.readLine());
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case '*':
			System.out.println("Enter number :");
			num2=Long.parseLong(br.readLine());
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case '/':
			System.out.println("Enter number :");
			num2=Long.parseLong(br.readLine());
			System.out.println(num1+"/"+num2+"="+(num1/num2));
			break;
			
		}
		
	}

}
