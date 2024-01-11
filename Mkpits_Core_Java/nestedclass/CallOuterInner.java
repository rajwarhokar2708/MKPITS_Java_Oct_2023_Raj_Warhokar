package com.mkpits.nestedclass;

import com.mkpits.nestedclass.OuterClass.InnerClass;

public class CallOuterInner {

	public static void main(String[] args) {
		OuterClass outerClass=new OuterClass();
		System.out.println("num 1 :- "+outerClass.num1);
		InnerClass innerClass=outerClass.new InnerClass();
		System.out.println("Num 2 :- "+innerClass.num2);
		innerClass.getData();
		
		System.out.println("\nAddition of Num1 and Num2 :-"+(outerClass.num1+innerClass.num2));
	}

}
