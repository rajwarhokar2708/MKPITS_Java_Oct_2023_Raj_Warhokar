package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rotaion :");
		int input=Integer.parseInt(reader.readLine());
		int arr[]= {1,2,3,4,5,6};
//		System.out.println(arr[0]);
		int arr1;
		for(int i=0;i<input;i++) {
			arr1=arr[0];
			arr[0]=arr[1];
			arr[1]=arr[2];
			arr[2]=arr[3];
			arr[3]=arr[4];
			arr[4]=arr[5];
			arr[5]=arr1;
		}
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
