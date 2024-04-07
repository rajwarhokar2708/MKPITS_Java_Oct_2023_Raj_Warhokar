package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public class Pra {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Nagpur");
		list.add("Jaipur");
		list.add("Lucknow");
		list.add("Indore");
		list.add("Jaipur");
		list.add("Hydrabad");
		list.add("Indore");
		list.add("Indore");
		list.add("Indore");
		list.add("Indore");
		list.add("Indore");
		list.add("Indore");
		list.add("Indore");
		
		System.out.println(list);
		System.out.println(list.size());
//		System.out.println(list.clear());//Clear method Clear a complete list 
//		System.out.println(list.contains("Jaipur"));//Contains method check a contain present in list 
	
		
		list.trimToSize();
		for (String string :list) {
			System.out.println(string);
		}
		System.out.println("-----------------------------");
		System.out.println(list.size());
		
//		System.out.println(list.clone());
		
	}
}