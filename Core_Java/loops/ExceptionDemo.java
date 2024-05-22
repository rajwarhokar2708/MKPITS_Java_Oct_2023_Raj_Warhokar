package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionDemo {
	public static void main(String[] args) {
//		String name = null;
//		try {
//			System.out.println("Enter Your Name");
//			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//			name = reader.readLine();
//		}catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Exception aa raha hai");
//		}finally {
//			System.out.println("Finally Executed");
//		}
//		
//		System.out.println(name);
	
	//Outer try Block
		try {
			try {
				System.out.println("Going to divide by zero");
				int a=2/0;
			} catch (Exception e) {
//				System.out.println("Ho gya ");
				e.printStackTrace();
				
			}
			System.out.println("Succsed");
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}
