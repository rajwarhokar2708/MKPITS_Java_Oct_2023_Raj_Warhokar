package com.mkpits.collectionLinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;

public class DescendingItreatorMethodLinkedList {

	public static <E> void main(String[] args) {
		
		LinkedList es=new LinkedList();
		es.add("Raj");
		es.add("Vinay");
		es.add("Vaibhav");
		es.add("Chethan");
		es.add("Harsh");
		
		es.add(25);
		
		System.out.println(es);
		
		
		
		
		//This method prints a decending order of element
		//Using Iterator class we use LinkedList decending order method
		Iterator<E> iterator=es.descendingIterator();
		System.out.println(iterator);
		while (iterator.hasNext()) {
			 E integer = iterator.next();
			System.out.println(integer);
			
		}

	}

}
