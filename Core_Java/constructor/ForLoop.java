package com.mkpits.constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.concurrent.CountDownLatch;

public class ForLoop{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int num=Integer.parseInt(br.readLine());
		for (int i=4;i>0;--i) {
			
			num=num*i;
			
		}
		System.out.println(num);
	}
}