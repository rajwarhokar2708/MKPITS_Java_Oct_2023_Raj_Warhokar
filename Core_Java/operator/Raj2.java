package com.mkpits.operator;

public class Raj2 {
	
	public static void main(String[] args) {
	Raj2 r=new Raj2();
	AssignmentOperators obj=new AssignmentOperators();
	obj.addEqualTO();
	obj.equalTo();
	r.m1();
	r.m2();
	
	int ch1 = 'A';// If we use int as a data-type of charcter output is gives a assci code  
	int c = 'B';
	
	System.out.println(++ch1);
	System.out.println(++c);
	
	  char ch = '0';
      System.out.println(ch-- + --ch);
	}

	private void m1() {
		char ch='A';
		System.out.println("Post-increment value of character :"+ ch++);
	}
	public void m2() {
		char ch='Z';
		ch++;
		System.out.println("Pre-increment value of character :"+ ++ch);
	}

}
