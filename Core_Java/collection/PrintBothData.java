package com.mkpits.collection;

public class PrintBothData {

	public static void main(String[] args) {
		Integer []intArr= {45,56,85,75,98};
		PrintIntegerArray3 array3=new PrintIntegerArray3();
		array3.print(intArr);
		
		
		String []strArr= {"India","America","Europe","Sri Lanka","Nepal"};
		PrintStringArray4 country=new PrintStringArray4();
		country.print(strArr);
		
		PrintFormalTypeArray array=new PrintFormalTypeArray();
		array.print(intArr);
		array.print(strArr);
	}

}
