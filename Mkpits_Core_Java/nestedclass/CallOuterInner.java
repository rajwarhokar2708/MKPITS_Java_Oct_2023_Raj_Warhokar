package com.mkpits.nestedclass;

import com.mkpits.nestedclass.OuterClass.InnerClass;
import com.mkpits.nestedclass.OuterClass.InnerClass.AnotherInnerClass;

public class CallOuterInner {

	public static void main(String[] args) {
		OuterClass outerClass=new OuterClass();
		System.out.println("num 1 :- "+outerClass.num1);
		
		InnerClass innerClass=outerClass.new InnerClass();		
		AnotherInnerClass innerClass2=innerClass.new  AnotherInnerClass();
		innerClass2.getData();
		
		System.out.println("\nAddition of Num1 and Num2 :-"+(outerClass.num1+innerClass2.num2));
	}

}
