package com.mkpits.stackcollection;

import java.util.Stack;

public class StackPushMethod {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(10);//push method add a element in stack 
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		System.out.println(stack);
		
		for (Integer foeEachLopp : stack) {
			System.out.println("--->"+foeEachLopp);
		}


	}
	
}
