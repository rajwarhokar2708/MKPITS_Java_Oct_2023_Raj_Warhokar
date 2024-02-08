package com.mkpits.generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IntegerArrayList {

	public static void main(String[] args) {
		IntegerArrayList integerArrayList=new IntegerArrayList();
		integerArrayList.integerList();

	}

	private void integerList() {
		List<Integer> num2=new ArrayList<Integer>();
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A number how many Element you want to add :");
		int range = 0;
		try {
			range=Integer.parseInt(reader.readLine());
		}catch(IOException obj) {
			obj.printStackTrace();
		}
		int num1=0;
		for(int i=0;i<range;i++) {
			System.out.println("Enter a number :");
			try {
				num1=Integer.parseInt(reader.readLine());
			}catch(IOException obj) {
				obj.printStackTrace();
			}
			num2.add(num1);
		}
		
		for (int i : num2) {
			System.out.println(i);
		}
		
			
	}

}

	
