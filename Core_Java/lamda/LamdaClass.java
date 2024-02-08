package com.mkpits.lamda;

import java.util.ArrayList;

public class LamdaClass {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mankapur");
		list.add("Koradi");
		list.add("Wadi");
		list.add("Besa");
		list.add("Mahal");
		
		//Itreting list using lamda expression 
		list.forEach(System.out::println);//lamda expression syntax both are valid
//		list.forEach(n->System.out.println("------>"+n));
		

	}

}
