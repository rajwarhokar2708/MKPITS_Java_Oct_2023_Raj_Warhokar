package com.mkpits.collection;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Student> studentsList=new ArrayList<Student>();
		studentsList.add(new Student("Raj", 101));
		studentsList.add(new Student("Vinay", 102));
		studentsList.add(new Student("Harsh", 103));
		studentsList.add(new Student("Ashiq", 104));
		
		ArrayList<Student> studentsList1=new ArrayList<Student>();
		studentsList1.add(new Student("Raj", 101));
		studentsList1.add(new Student("Regved", 105));
		studentsList1.add(new Student("Pranav", 106));
		studentsList1.add(new Student("Khausthub", 107));
		
		for (Student student : studentsList) {
			System.out.println(student);
		}
		System.out.println("\n--------------------------------------\n");
		
		for (Student student : studentsList1) {
			System.out.println(student);
		}
		System.out.println("\n--------------------------------------\n");

		
		studentsList.addAll(studentsList1);
		for (Student student : studentsList) {
			System.out.println(student);
		}
	}

}
