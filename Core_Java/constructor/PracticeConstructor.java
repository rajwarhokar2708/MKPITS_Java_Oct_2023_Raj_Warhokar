package com.mkpits.constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeConstructor {
	int a,b,add;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	PracticeConstructor obj=new PracticeConstructor();
		
		PracticeConstructor obj2=new PracticeConstructor(obj);
		
		PracticeConstructor object=new PracticeConstructor(440030, 7020880);
	
	}
	public PracticeConstructor() {
		a=10;
		b=20;
		System.out.println("No parameter construtor executed.");	
	}
	
	public PracticeConstructor(int pinCode,int mobileNo) {
		System.out.println("PinCode : "+pinCode+"\nMobile Number :"+mobileNo);
		
		
	}
	
	public PracticeConstructor(PracticeConstructor add) {
		a=add.a;
		b=add.b;
		int c=a+b;
		System.out.println(c);
		
	}
	
}
