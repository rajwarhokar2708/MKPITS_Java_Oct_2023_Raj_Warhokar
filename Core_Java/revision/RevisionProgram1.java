package com.mkpits.revision;

import java.util.ArrayList;

public class RevisionProgram1 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		
		list1.add("red");list1.add("black");list1.add("blue");
		list2.add("purple");list2.add("Black");list2.add("blue");
		
		ArrayList<String> result=new ArrayList<String>();
		for (String string : list1) {
			result.add(list2.contains(string)?"yes":"No");
			
		}
		
		System.out.println(result);
	}

}
