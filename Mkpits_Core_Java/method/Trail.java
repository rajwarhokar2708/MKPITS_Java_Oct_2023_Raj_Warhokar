package com.mkpits.method;

public class Trail {
	static int add=23;
	
	char ch='r';
	
	
	public static void main(String[] args) {
		Trail t=new Trail();
		int a=10;
		System.out.println(a);
		
		System.out.println(add);
		
		System.out.println(t. ch);
		
		method();
		t.method2();
		t.sub();
		t.mul(5,6);
		System.out.println(t.div());
		int module=t.mod(56,9);
		System.out.println(module);
		
		int in=5;
		Integer i=new Integer(in);
		System.out.println(in);
		
		
		
		
		
		
	}


	private int mod(int i,int j) {
		int z=i%j;
		return z;
		
	}


	private int  div() {
		int i=45,j=5;
		int z=i/j;
		return z;
	}


	private void mul(int i, int j) {
		int z=i*j;
		System.out.println(z);
	}


	private void sub() {
		int a=1;
		int b=3;
		int c=a+b;
		System.out.println(c);
		
	}


	public void method2() {
		System.out.println("Method 2 print");
		
	}


	public static void method() {
		System.out.println("Okay Done !");
		
	}


	public void add() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
