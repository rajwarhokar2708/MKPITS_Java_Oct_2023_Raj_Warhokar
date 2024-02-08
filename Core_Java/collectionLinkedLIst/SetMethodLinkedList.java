package com.mkpits.collectionLinkedLIst;

import java.util.Iterator;
import java.util.LinkedList;

public class SetMethodLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(52);
		list.add(53);
		list.add(54);
		list.add(55);
		list.add(56);
		System.out.println(list);
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(91);
		list2.add(92);
		list2.add(93);
		list2.add(94);
		list2.add(95);
		
		list2.set(2,52);//Set method replace a Specific index of data
		System.out.println(list2);
		
//		Iterator<Integer> iterator=list.descendingIterator();
//		System.out.println(list);
//		while (iterator.hasNext()) {
//			Integer integer = (Integer) iterator.next();
//			System.out.println(integer);
//			
//		}
		
			
//		System.out.println(list.containsAll(list2));//This contain all check a all contain in exitsting list
//		
//		System.out.println(list.element());//Element method print first element in list
		
		System.out.println(list.lastIndexOf(54));	//LastIndexof method works a Take a element shows his index 	
		
		

	}

}
