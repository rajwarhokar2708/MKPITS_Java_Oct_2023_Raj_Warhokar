package com.mkpits.operator;

public class Practice {

	public static void main(String[] args) {
		Practice p=new Practice();
		p.m1();
		p.m2();
	}
	 void m1(){
		String b ="ABC123";
		
		System.out.println(b.toLowerCase());
	}
	 public void m2() {
		 int i = 11;
         
	        int j = (i++);
	        System.out.println(j);
		}
}
