package com.mkpits.collectionLinkedLIst;

import java.util.LinkedList;

public class GeteMethodLinkedList {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.add("Paris");
		list.add("Washington");
		list.add("Japan");
		list.add("America");
		list.add("America");
		System.out.println(list.get(2));//returns a specific index element 
		System.out.println(list.getFirst());//returns a first index element 
		System.out.println(list.getLast());//returns a last index element 
		System.out.println(list.getClass());//return the class name which class object is used
		

	}

}
