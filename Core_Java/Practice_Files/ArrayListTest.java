package com.mkpits.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> colorList=new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Black");
		colorList.add("White");
		colorList.add("Green");
		
		
		List<Integer> numList=new ArrayList<>();
		numList.add(1);
		numList.add(22);
		numList.add(34);
		numList.add(55);
		numList.add(78);
		
		//Using Itreator Itreting Array List 
		Iterator<String> itr=colorList.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			
		}
		
		//Using For Loop Itreting ArrayList
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		

		//For Each Loop Itreting ArrayList
		for (String string : colorList) {
			System.out.println(string);
		}
		
	}

}
