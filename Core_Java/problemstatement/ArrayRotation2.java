package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRotation2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayRotation2 rotation2=new ArrayRotation2();
		rotation2.rotation();

	}

	public void rotation() throws NumberFormatException, IOException {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		int rotate=Integer.parseInt(br.readLine());
		int rotation=3;
		int [] arr= {1,2,3,4};
		int len=arr.length;
		int arr1[] = new int[arr.length];
		int arr2[]=new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[len-1]=arr[i];
			len--;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr1[j]);
		}
	}	
	

}
