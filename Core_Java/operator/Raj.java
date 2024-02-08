package com.mkpits.operator;

public class Raj {
		int a = 20;  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Raj r = new Raj();
         r.preincrement();
         r.preincrement();
         r.preincrement();
         
         r.postincrement();
         r.postincrement();
         r.postincrement();
	}
	private void postincrement() {
		//int a=20;
		System.out.println(a++);
		System.out.println(a++);
	}
	private void preincrement() {
		//int a=20;
		System.out.println(++a);
		System.out.println(++a);
		 
	
	}

}
