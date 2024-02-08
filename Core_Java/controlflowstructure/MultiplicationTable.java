package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
	static BufferedReader br;
	static MultiplicationTable mt;
	public static void main(String[] args) throws NumberFormatException, IOException {
		mt=new MultiplicationTable();
		br=new BufferedReader(new InputStreamReader(System.in));
		
		//mt.multipicationTable();
		mt.fibonissSeries();
		//mt.sumOfNaturalNumber();
	

	}

	public void sumOfNaturalNumber() throws NumberFormatException, IOException {
		System.out.println("Enter Number :");
		int value=Integer.parseInt(br.readLine());
		
		int n=1;
		for (int i=0;i<value;i++) {
			n=i+n;
			System.out.println(n+i);
		}
		
		
		
		
		}
		
	

	public  void multipicationTable() throws NumberFormatException, IOException {
		System.out.println("Enter Number :");
		int num=Integer.parseInt(br.readLine());
		for(int i=1;i<=10;++i) {
			int num1=num*i;
		System.out.println(num+"*"+i+"="+(num1));	
		}
		
	}

	public void fibonissSeries() throws NumberFormatException, IOException {
		int num1=0,num2=1;
		System.out.println(num1+"\n"+num2);
		for(int i=2;i<10;i++) {
			i=num1+num2;
			System.out.println(i);
			num1=num2;
			num2=i;
		}
		
	}

}
