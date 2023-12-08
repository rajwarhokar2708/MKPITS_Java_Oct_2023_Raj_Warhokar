package com.mkpits.operator;

public class UnaryOperators {

	public static void main(String[] args) {
		UnaryOperators operator =new UnaryOperators();
		operator.increment();
		System.out.println("----------------------------------------------");
		operator.decrement();
		

	}

	public void decrement() {
		int a=20;//m=20
		System.out.println("Decrement Operator");
		System.out.println(--a);//p=19 m=19
		System.out.println(--a);//p=18 m=18
		System.out.println(a--);//p=18 m=17
		System.out.println(a--);//p=17 m=16
		System.out.println(a--);//p=16 m=15
		System.out.println(--a);//p=14 m=14
		System.out.println(--a);//p=13 m=13
		System.out.println(a);//p=13
		System.out.println();
		
	}
	
	// post increment operator use the existing value first and after that increase that value by 1 in memory
	// pre increment operator use change value directly and save into the memory
	public void increment() {
		int a=5;
		System.out.println("Increment Operator");
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a);
		
	}

}
