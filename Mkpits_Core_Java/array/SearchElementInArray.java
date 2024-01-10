package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;


//Duplicate number print logic of array with position

public class SearchElementInArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SearchElementInArray sea=new SearchElementInArray();
		sea.search();
	
	}

	public void search() throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		
		System.out.println("Enter number :");
		int num=Integer.parseInt(br.readLine());
		for(int i=0;i<arr.length;i++) { 
			System.out.println(i);
			if(arr[i]==num) {
				System.out.println("Number is present at "+(i+1)+" position");
			}
		}
		
	}

}
