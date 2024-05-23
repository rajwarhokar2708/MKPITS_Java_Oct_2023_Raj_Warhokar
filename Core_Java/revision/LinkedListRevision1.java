package com.mkpits.revision;

import java.util.LinkedList;

public class LinkedListRevision1 {

	public static void main(String[] args) {
		LinkedList<Integer> es=new LinkedList<>();
		es.add(1);
		es.add(10);
		es.add(5);
		es.add(4);
		es.add(120);
		
		System.out.println(es);
		
		for (Integer integer : es) {
			System.out.println(integer);
		}
		

	}

}
