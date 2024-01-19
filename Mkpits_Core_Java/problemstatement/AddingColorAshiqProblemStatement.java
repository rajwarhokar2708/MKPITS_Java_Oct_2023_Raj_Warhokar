package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AddingColorAshiqProblemStatement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter num how many element you want");
		int num=Integer.parseInt(br.readLine());
		List<String> color=new ArrayList<String>();
		String addColor;
		for (int i = 0; i < num; i++) {
			System.out.println("Enter Color");
			addColor=br.readLine();
			color.add(addColor);
		}
		for (String c : color) {
			System.out.println(c);
		}
		System.out.println("Enter Index in which you want to add color ");
		int index=Integer.parseInt(br.readLine());
		System.out.println("Enter Color in which you want to add this "+index+" index");
		String indexColor=br.readLine();
		color.add(index-1, indexColor);
		for (String s : color) {
			System.out.println(s);
		}
		
		System.out.println("Enter Index in which you want to add color ");
		int index1=Integer.parseInt(br.readLine());
		System.out.println("Enter Color in which you want to add this"+index+"index");
		String indexColor1=br.readLine();
		color.set(index1-1, indexColor1);
		for (String s : color) {
			System.out.println(s);
		}
		
	}

}
