package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrongNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int f = 0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number :");
		int fac=Integer.parseInt(br.readLine());
			f=fac*(fac-1);
			//System.out.println(fac+"\n"+f);
		for(int i=fac-2;i>1;i--) {
			f=f*i;
			//System.out.println(f);
		}
		System.out.println(f);
		if(fac==f) {
		System.out.println(fac+"this number is Strong NUmber :");
		}
		
	}

}
