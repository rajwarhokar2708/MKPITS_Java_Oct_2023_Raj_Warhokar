package com.mkpits.collectionLinkedLIst;

import java.util.LinkedList;

public class IndexOfMethodLinkedList {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("Paris");
		list.add("Washington");
		list.add("Japan");
		list.add("America");
		list.add("America");
		
//		LinkedList<String> linkedList=new LinkedList<String>();
//		linkedList.add("Vinay");
//		linkedList.add("Ashiq");
//		linkedList.add("Harsh");
//		linkedList.add("Sanket");
//		linkedList.add("Samkisha");
		
//		System.out.println("Index Of Japan Element is :"+list.indexOf("Japan"));
//		System.out.println("First index element :"+list.lastIndexOf(list));
		System.out.println(list.lastIndexOf("America"));//Returns last occurence of element
		System.out.println(list.indexOf("America"));//Returns first occurence of element
//		System.out.println(list.getClass());
		
	}

}
