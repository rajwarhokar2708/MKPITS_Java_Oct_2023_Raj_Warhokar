package com.mkpits.generics;

public class NonGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[]intArr= {1,2,3,4,5};
		MyData1<Integer> printInt=new MyData1<>();
		printInt.print(intArr);
		
		String[]stringArr= {"Raj","Ashiq","Pranav","Kaustubh","Sanket"};
		MyData1<String> printStr=new MyData1<>();
		printStr.print(stringArr);
		
		Double[]doubleArr= {12.5,15.5,65.25,2.5};
		MyData1<Double> printDouble=new MyData1<>();
		printDouble.print(doubleArr);
	}

}


//This class type is Also Valid 

//class MyData<T>{
//	public void print(T[]arr) {
//		for (T t : arr) {
//			System.out.println(t);
//		}
//	}
//}
