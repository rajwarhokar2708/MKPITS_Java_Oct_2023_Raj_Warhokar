package com.mkpits.operator;

public class PracticeOperator {
	int a=65,b=32;
	public static void main(String[] args) {
		PracticeOperator obj=new PracticeOperator();
		obj.add();
		//obj.sub();
		//obj.increment();
		
	}

	private void increment() {
		int a=10;
		System.out.println((a++)+(a++)+(--a)+(a++)+(++a));
		//System.out.println(a);
		
	}

	private void sub() {
		System.out.println(a-=b);
		
	}

	private  void add() {
		int a=50,b=6;
		int c=a-b;
		
		System.out.println(c);
		System.out.println();
	}

}
