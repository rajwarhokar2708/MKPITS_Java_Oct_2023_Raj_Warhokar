package com.mkpits.collectionset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRemoveAllMethod {
	

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.addAll(Arrays.asList(new Integer[] {52,65,42,65,85,74}));
		set.forEach(System.out::println);
		System.out.println("----------------------------------------------");
		
		Set<Integer> set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {25,63,65,52,1,8}));
		set2.forEach(System.out::println);
		System.out.println("----------------------------------------------");
		
//		set.removeAll(set2);//remove all method remove a duplicate element
//		set.forEach(System.out::println);
		
		set.remove(52);//Remove method delete a sepicifed element
		set.forEach(System.out::println);
		System.out.println("----------------------------------------------");
		
		
		
	}

}
