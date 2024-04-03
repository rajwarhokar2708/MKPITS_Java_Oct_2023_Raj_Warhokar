package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class ScoundLargestNumberInArray 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		ScoundLargestNumberInArray numberInArray=new ScoundLargestNumberInArray();
		numberInArray.largestNumber();
	}

	private void largestNumber() throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Array Size :- ");
		
		int size=Integer.parseInt(reader.readLine());
		int arr[]=new int [size];
		System.out.println("Enter Array :-");
		for(int userLoop=0;userLoop<size;userLoop++)
		{
			arr[userLoop]=Integer.parseInt(reader.readLine());
		}
		
		
		int temp;
		int oLoop;
		
		
		for(oLoop=0;oLoop<arr.length;oLoop++)
		{
			for(int iLoop=oLoop+1;iLoop<arr.length;iLoop++) 
			{
				if(arr[oLoop]<arr[iLoop])
				{
					temp=arr[oLoop];
					arr[oLoop]=arr[iLoop];
					arr[iLoop]=temp;
				}
			}
			
		}
		
		
		int largest=arr[0];
		
		for (int i : arr) 
		{
			System.out.println(i);
		}
		
		
		int secLargest = 0;
		for(int i=arr.length-1; i>0; i--) 
		{
			if(largest> arr[i]) 
			{
				secLargest= arr[i];
			}
		}
		
		
		System.out.println("Secound largest Digit in Array :- "+secLargest);
	}

}

