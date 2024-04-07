package com.mkpits.generics;

public class PrintSum <ArrDataType extends Number> {
	public void print(ArrDataType[] array) {
		int sum = 0;
		for (ArrDataType arr : array) {
			sum=arr.intValue();
		}
		System.out.println("---->"+sum);
	}
}
