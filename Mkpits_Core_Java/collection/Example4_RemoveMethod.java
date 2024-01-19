package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example4_RemoveMethod {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Nagpur");
		list.add("Jaipur");
		list.add("Lucknow");
		list.add("Indore");
		list.add("Jaipur");
		list.add("Hydrabad");
		list.add("Indore");
		System.out.println(list);
		System.out.println("----------------------------------");

		
		
		List<String> list2=new ArrayList<String>();
		list2.add("Delhi");
		list2.add("Mumbai");
		list2.add("Lucknow");
		list2.add("Delhi");
		list2.add("Amravati");
		list2.add("Pune");
		list2.add("Nashik");
		System.out.println(list2);
		System.out.println("----------------------------------");

		
		
		list.remove(2);//In this remove method it remove using index it remove element
		for (String string : list) {			
			System.out.println(string);
		}
		
		list.remove("Jaipur");
		for (String string : list) {
			System.out.println(string);
		}
		list.addAll(list2);
		System.out.println("--------------------------");
		for (String string : list) {
			System.out.println(string);
		}
		
		list.removeAll(list2);//remove all method remove the present list  
		System.out.println("----------------------------------");
		for (String string : list) {
			System.out.println(string);
		}
		boolean t=((list.get(2)).equals("Lucknow"));
		System.out.println(t);
		
		
		
	}

}
