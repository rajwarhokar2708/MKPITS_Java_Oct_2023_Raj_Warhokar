package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchElementInString {

	public static void main(String[] args) throws IOException {
		SearchElementInString seis=new SearchElementInString();
		seis.search();
		
		

	}

	public  void search() throws IOException {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Email Address with Proper Casing: ");
			String emailUsername = input.readLine();
			byte j = 0,k = 0,p = 0, q = 0;
			
			for (int i = 0; i < emailUsername.length(); i++)
			{
				int cPoint= emailUsername.codePointAt(i);
				
				if (cPoint>= 65 && cPoint<= 90)
				{
					
					System.out.println("CharAt["+i+"] is = "+(char)cPoint+" Is UPPER-CASE Character.");
					
					j++;
				}
				
				if (cPoint>= 97 && cPoint<= 122)
				{
					
					System.out.println("CharAt["+i+"] is = "+(char)cPoint+" Is LOWER-CASE Character.");
					k++;
				}
				
				if (cPoint>= 48 && cPoint<= 57)
				{
					
					System.out.println("CharAt["+i+"] is = "+(char)cPoint+" Is  a DIGIT.");
					p++;
				}
				
				if ((cPoint>= 35 && cPoint<= 38)|| cPoint== 46 || cPoint == 64)
				{
					System.out.println("CharAt["+i+"] is = "+(char)cPoint+" Is  a Special Character.");
					q++;
				}
				
			}
			System.out.println("----------------------------------------------");
			System.out.println("No. of Upper-Case Characters : "+j);
			System.out.println("No. of Lower-Case Characters : "+k);
			System.out.println("No. of Digit : "+p);
			System.out.println("No. of Special Characters : "+q);	
	}

}
