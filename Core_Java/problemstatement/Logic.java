package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logic {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter num");
		
		
		long num=Long.parseLong(br.readLine());
		
		long sum=0,lastDigit=0;

		
		while(num>0 || sum>10 )
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			lastDigit=num%10; // last digit of num = 6
			sum+=lastDigit;
			num/=10;
			
		}
		System.out.println(sum);

	}

}
