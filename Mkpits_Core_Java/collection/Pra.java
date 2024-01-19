package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Pra {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Nagpur");
		list.add("Jaipur");
		list.add("Lucknow");
		list.add("Indore");
		list.add("Jaipur");
		list.add("Hydrabad");
		list.add("Indore");
		System.out.println(list);
		
//		System.out.println(list.clear());//Clear method Clear a complete list 
		System.out.println(list.contains("Jaipur"));//Contains method check a contain present in list 
		
		
		
	}
}