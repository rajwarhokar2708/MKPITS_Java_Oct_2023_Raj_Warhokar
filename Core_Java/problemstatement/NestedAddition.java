package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class NestedAddition {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		add();
		
	}

	public static void add() throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number :");
		int anInt=Integer.parseInt(br.readLine());
		int num=anInt/10;
		int num2=anInt%10;
		int num3=num+num2;
		int n=0,n1=0;
		System.out.println(num3);
		for(int i=10;i<num3;i++) {   
			n=num3/10;
			n1=num3%10;
			
			
			}
		System.out.println(n+n1);
		}
		
	}

