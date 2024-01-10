package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiboonaccisSerise {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int f1=0,f2=1;
		System.out.println(f1+"\n"+f2);
		
		for(int i=2;i<=10;i++) {
			int f3=f1+f2;
			System.out.println(f3);
		f1=f2;
		f2=f3;
		
		}
	}

}
