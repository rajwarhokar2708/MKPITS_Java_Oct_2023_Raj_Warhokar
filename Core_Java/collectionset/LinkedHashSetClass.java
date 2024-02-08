package com.mkpits.collectionset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<String>();
		set.add("India");
		set.add("America");
		set.add("Europe");
		set.add("Japan");
		set.add("Rusia");
		
		Set<String> set2=new LinkedHashSet<String>();
		set2.add("Sri lanka");
		set2.add("China");
		set2.add("Bangladesh");
		set2.add("Europe");
		set2.add("China");
		
		
//		set.forEach(System.out::println);
		
		set.add("Japan");//Duplicate element cant add in set
//		set.forEach(System.out::println);
		
		set.remove("America");
		set.forEach(System.out::println);
		
		
		



	}

}
