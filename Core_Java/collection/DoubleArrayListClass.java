package com.mkpits.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DoubleArrayListClass {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a num how many element you want to add :-");
		List<Double> arrDouble=new ArrayList<Double>();
		try {
			int range=Integer.parseInt(br.readLine());
			double decimalNum=0;
			for (int i = 0; i < range; i++) {
				System.out.println("Enter decimal number :");
				decimalNum=Double.parseDouble(br.readLine());
				arrDouble.add(decimalNum);
			}
			
		}catch(IOException obj) {
			obj.printStackTrace();
		}
		
		for (Double double1 : arrDouble) {
			System.out.println(double1);
		}
				
	}

}
