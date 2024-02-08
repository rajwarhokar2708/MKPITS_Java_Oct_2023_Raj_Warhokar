package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example2_SetMehod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Nagpur");
		list.add("Jaipur");
		list.add("Lucknow");
		list.add("Indore");
		list.add("Jaipur");
		list.add("Hydrabad");
		list.add("Indore");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("\n-----------------------------\n");
		
	
		
		list.add(3,"Uttar_Pradesh");//These add method add a element in specific index
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println(list.size());
		System.out.println("\n-----------------------------\n");
		
		list.set(3,"Manali");//These set method replace a element on specific index
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println(list.size());//Size method shows the size of list elements
	}

}
