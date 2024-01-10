package com.mkpits.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOF {

	public static void main(String[] args) {
		CopyOF co=new CopyOF();
		//In copyOf method First 5 number print
		//if you put a limit 4 First 4 number print
		//co.copyOf();
		int num[]= {1,2,3,4,5,6,7,8,9};
		int newnum[]=Arrays.copyOf(num,5);
		for (int i : newnum) {
			System.out.println(i);
			
			
			
		}
		
	}

	private void copyOf() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//	System.out.println("Enter a number :");
		
		String str1="Raj Warhokar";
		String str2="Raj Warhokar";
		String str3="Ashik";
		String str4="Ashik";
		
		
		if(str1==str2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

		
		if(str3==str4) {
			System.out.println(true);
		}else
		{
			System.out.println(false);
		}
		
		
	}

}
