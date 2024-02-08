package com.mkpits.generics;

public class MyData1 <T>{
	public void print(T[]arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}
}
