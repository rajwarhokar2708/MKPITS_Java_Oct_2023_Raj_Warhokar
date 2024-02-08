package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class ConvertStringArrayIntoInt {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[]str=new String[5];
		System.out.println("Welcom");
		for (int i = 0; i < str.length; i++) 
		{
			str[i]=br.readLine();
		}
		
		int arr[]=new int[str.length];
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=Integer.parseInt(str[i]);
		}
		System.out.println("int arr");
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
