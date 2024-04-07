package com.mkpits.stackcollection;

import java.util.Stack;

public class StackPeakMethod {

	public static void main(String[] args) {
		
		Stack<Double> stack = new Stack<Double>();
		stack.push(20.2);
		stack.push(30.2);
		stack.push(40.5);
		stack.push(55.6);
		stack.push(90.9);
		System.out.println(stack);
		
		stack.peek();//Peek method return a First index value but it not delete a value or index
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.empty());//Empty method return a boolean value if a stack is empty
		
		System.out.println(stack.search(55.6));//Search method return a stack element position but not return a index position
		

	}

}
