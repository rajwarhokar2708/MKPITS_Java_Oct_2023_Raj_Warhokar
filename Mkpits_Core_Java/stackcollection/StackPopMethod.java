package com.mkpits.stackcollection;

import java.util.Stack;

public class StackPopMethod {

	public static void main(String[] args) {
		
		Stack<String> stack=new Stack<String>();
		stack.push("Mankapur");
		stack.push("Besa");
		stack.push("Manish Nagar");
		stack.push("Mahal");
		stack.push("Itwari");
		
		System.out.println(stack);
		
		stack.pop();//pop method delete a first element of stack 
		System.out.println(stack);
		System.out.println("removed First Item of stack "+stack.pop());
		System.out.println(stack);
		
		
		
	}

}
