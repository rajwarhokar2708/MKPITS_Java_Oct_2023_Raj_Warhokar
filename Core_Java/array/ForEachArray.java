package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.CopyOnWriteArrayList;

public class ForEachArray {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name :");
		String name=br.readLine();
		char ch[]=new char[name.length()];
		
		for(int i=0;i<ch.length;i++) 
		{
			ch[i]=name.charAt(i);
		}
		for (char c : ch) 
		{
			System.out.println(c);
		}
		System.out.println("Reverse Order");
		for(int i=ch.length-1;i>=0;i--) 
		{
			System.out.println(ch[i]);
		}
			
	}

}
