package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Example1_AddMethod {

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
		
		List<String> list2=new ArrayList<String>();
		list2.add("Delhi");
		list2.add("Mumbai");
		list2.add("Pune");
		list2.add("Delhi");
		list2.add("Amravati");
		list2.add("Pune");
		list2.add("Nashik");
		
		list.add(3,"Banglore");//Adding element on specific index
		for (String string : list) {
			System.out.println(string);
		}
		
		list.addAll(list2);
		System.out.println(list);//Adding another Complete list2 on list1
		
		StringJoiner joiner = new StringJoiner(" # ");//String Joiner Class Join the element in betwwen two element
		joiner.add(list.get(2)).add(list.get(3));
		System.out.println("-->"+joiner);
	}

}
