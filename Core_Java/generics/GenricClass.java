package com.mkpits.generics;

public class GenricClass {

	public static void main(String[] args) {
		
		Integer[]intArr= {1,2,3,4,56};
		PrintSum<Integer> printIntArr=new PrintSum<>();
		printIntArr.print(intArr);
		
		Double[]doubleArr= {12.2,5.2,56.5,85.2,45.6};
		PrintSum<Double> printDouArr=new PrintSum<>();
		printDouArr.print(doubleArr);
		
//		String[]stringArr= {"Raj","Ashiq","Pranav","Kaustubh","Sanket"};
//		PrintSum<Number> printStringArr=new PrintSum<Number>();
//		printStringArr.print(stringArr);
	}

}
