package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aashiqproblemstatement {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your String :- ");
		String str=br.readLine();
		String arr[];
		arr=str.split(" ");// split method string me se word split krte hai
		for (int loop = 0; loop < arr.length; loop++) {
			if(arr[loop].length()%2==0) {
				System.out.println(arr[loop]);
			}
		}

	}

}
