package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveRetainClass {

	public static void main(String[] args) {
		
		List<String> name=new ArrayList<String>();
		name.add("Raj");
		name.add("Vinay");
		name.add("Harsh");
		name.add("Pranav");
		name.add("Samiksha");
		
		for (String n : name) {
			System.out.println(n);
		}
		System.out.println("\nList Names 2 :\n");
		
		List<String> names2 = new ArrayList<String>();
		if(names2.isEmpty()) {
		names2.add("Harsh");
		names2.add("Regved");
		names2.add("Karan");
		names2.add("Vinay");
		names2.add("Khaustubh");
		}
		
		for (String n : names2) {
			System.out.println(n);
		}
		System.out.println("\nAdding Two List in One\n");
		
		name.addAll(names2);//Add method add a List1 in to List2
		for (String n : name) {
			System.out.println(n);
		}
		
		System.out.println("\n"+name.size());//Shows the size of List
		System.out.println("\nRemove All\n");
		
//		name.removeAll(names2);//Remove method remove same name form both List and show list1 remaing element
//		for (String n : name) {
//			System.out.println(n);
//		}
		
		System.out.println("\nRetain all method \n");
		
		name.retainAll(names2);//Retain method print 1st list and 2nd list same element and then it print complete 2nd list
		for (String n : name) {
			System.out.println(n);
		}

	}

}
