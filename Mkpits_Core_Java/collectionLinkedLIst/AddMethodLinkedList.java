package com.mkpits.collectionLinkedLIst;

import java.util.LinkedList;
import java.util.List;

public class AddMethodLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> lList=new LinkedList<String>();
		lList.add("Paris");
		lList.add("Washington");
		lList.add("Japan");
		lList.add("America");
		lList.add("China");
		System.out.println(lList);
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Vinay");
		linkedList.add("Ashiq");
		linkedList.add("Harsh");
		linkedList.add("Sanket");
		linkedList.add("Samkisha");
		System.out.println(linkedList);
		
		
		
//		lList.add(2,"India");
//		System.out.println(lList+"\n---------------------------------\n");
//		
		lList.addAll(linkedList);
//		System.out.println("-->"+lList);
		for (String string : lList) {
			System.out.println("-->"+string);
		}
		System.out.println("------------------------------------------------");
		
		lList.addAll(3, linkedList);//This add all  method add a complete list in specific index of existing list
		for (String string : lList) {
			System.out.println("-->"+string);
		}
		
		lList.addFirst("India");
		System.out.println(lList);
		lList.addLast("Pranav");
		System.out.println(lList);
		
		lList.clone();
		System.out.println(lList);
		
		System.out.println(lList.contains("Harsh"));
		


	}

}
