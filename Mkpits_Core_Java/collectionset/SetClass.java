package com.mkpits.collectionset;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		
		//In below line we added set list to aaray list using addAll method
		set.addAll(Arrays.asList(new String[] {"Audi","Nano","Lamborgini","Kia","Vitara Breza","Nano","Tata"}));
		set.forEach(System.out::println);
		System.out.println("--------------------------------------");
		
		Set<String> set2 =new HashSet<String>();
		set2.addAll(Arrays.asList(new String[] {"Honda","Kia","Tata","Honda","Hundai","Bugati","Alto"}));
		set2.forEach(System.out::println);
		System.out.println("--------------------------------------");
		
//		set.addAll(set2);//And this addAll method add both list in set list
//		set.forEach(System.out::println);
//		System.out.println("--------------------------------------");
		
//		set.removeAll(set2);//remove all method remove a duplicate element
//		set.forEach(System.out::println);
//		System.out.println("--------------------------------------");

		
		set.retainAll(set2);
		System.out.println("Retain all \n");
		set.forEach(System.out::println);
		System.out.println("--------------------------------------");

		
		
		
		
		
		
		
		
//		Set<String> set1=new HashSet<String>();
//		set1.add("Aa");
//		System.out.println(set1.hashCode());
		
		
		
		
		
		
		
		
		
		
//		set.add("Audi");
//		set.add("Nano");
//		set.add("Lamborgini");
//		set.add("Kia");
//		set.add("Vitra Breza");
//		set.add("Nano");
//		set.add("Tata");
//		System.out.println(set);
		
//		set.forEach(System.out::println);
//		System.out.println("-------------------------------------------");
//		
//		Set<String> set1=new HashSet<String>();
//		set1.add("Honda");
//		set1.add("Kia");
//		set1.add("Tata");
//		set1.add("Honda");
//		set1.add("Hundai");
//		set1.add("Bugati");
//		set1.add("Alto");
//		set1.forEach(System.out::println);
//		System.out.println("-------------------------------------------");
//		
//		set.addAll(set1);//Add all method add both the List but if duplicate element are shown so it print only one of them  
//		set.forEach(System.out::println);

		
		
	}

}
