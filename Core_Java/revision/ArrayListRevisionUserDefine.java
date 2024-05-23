package com.mkpits.revision;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListRevisionUserDefine {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "Harsh Gupta"));
		list.add(new Employee(2, "Samiksha Gupta "));
		list.add(new Employee(3, "Samiksha Tai "));
		list.add(new Employee(2, "Pranav Armarfakar "));
		
//		System.out.println(list);
//		
//		for (Employee employee : list) {
//			System.out.println(employee);
//		}
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
		
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			Employee employee = (Employee) iterator.next();
//			System.out.println(employee.id +" "+employee.Name);
//		}
	}

}
