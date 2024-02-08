package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example3_IndexOf {

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
		System.out.println("\n-----------------------------\n");
		

		
		
		System.out.println("Index of method --> "+list.indexOf("Jaipur"));
		//indexOf method return a First occerence of element index
		System.out.println("Last Index of method --> "+list.lastIndexOf("Jaipur"));
		//lastIndexOf method return a Last occerence of element index
		
		int index=list.indexOf("Indore");
		System.out.println("--->"+index);
		int lastIndex=list.lastIndexOf("Indore");
		System.out.println("--->"+lastIndex);

		
		

	}

}
