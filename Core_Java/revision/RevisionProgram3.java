package com.mkpits.revision;

import java.util.ArrayList;

public class RevisionProgram3 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		
		list1.add("red");list1.add("black");list1.add("blue");
		list2.add("purple");list2.add("Black");list2.add("blue");
		System.out.println("List 1:-"+list1);
		System.out.println("List 2:-"+list2);
		
		list1.addAll(list2);
		
		System.out.println("List 1+2:-"+list1);
		
	}

}
