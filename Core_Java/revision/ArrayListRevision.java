package com.mkpits.revision;

import java.util.ArrayList;

public class ArrayListRevision {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(421);
		list.add(422);
		list.add(423);
		list.add(424);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
//		System.out.println(list);

	}

}
