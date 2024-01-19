package com.mkpits.collection;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		//Genric version with Type safety 
		ArrayList<String> strArr=new ArrayList<String>();
		strArr.add("Nagpur");
		strArr.add("America");
//		strArr.add(1);//It Shows compile time error because we set a datatype in ArrayList
		
		for (String string : strArr) {
			System.out.println("Genric data :-"+string);
		}
		
		
		//Non genric version its not a type safety
		ArrayList list=new ArrayList();
		list.add("String");
		list.add(1);
		list.add(25.5);
		list.add(true);//Non genric accept all type of datatype that why this is non type safety
		
		
		for (Object object : list) {
			System.out.println("\nNon genric data :-"+object);
		}
		
	}

}
