package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringArrayList {

	public static void main(String[] args) {
		
		List<String> name=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter num How many names you want to add ");
		int num;
		
		try {
			num=Integer.parseInt(br.readLine());
			for (int i = 0; i < num; i++) {
				System.out.println("Enter your name :");
				String inputName=br.readLine();
				name.add(inputName);
			}
		}catch(IOException obj) {
			obj.printStackTrace();
		}
		for (String printName : name) {
			System.out.println(printName);
		}
	}

}
