package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleDimensionArray {

	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String anArray[]=new String[5];
	for(int i=0;i<anArray.length;i++) {
		System.out.println("Enter a name :");
		anArray[i]=br.readLine();
	}
	for(int i=0;i<anArray.length;i++) {
		System.out.println(anArray[i]);
	}
	
	}
	
}