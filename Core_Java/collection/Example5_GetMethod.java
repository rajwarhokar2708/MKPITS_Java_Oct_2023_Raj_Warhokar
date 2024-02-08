package com.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class Example5_GetMethod {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Nagpur");
		list.add("Jaipur");
		list.add("Lucknow");
		list.add("Indore");
		list.add("Jaipur");
		list.add("Hydrabad");
		list.add("Indore");
		System.out.println(list);
		//Get method shows the data of specific index
		String firstIndex=(String) list.get(1);
		String thirdIndex=(String) list.get(1);
		System.out.println(firstIndex);
		System.out.println(thirdIndex);
		System.out.println(list.get(2));
		System.out.println(list.get(5));
		System.out.println(list);

	}

}
