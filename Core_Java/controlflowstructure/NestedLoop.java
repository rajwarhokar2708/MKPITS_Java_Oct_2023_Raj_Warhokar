package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NestedLoop {
	 static NestedLoop nl;
	 static BufferedReader br;
	public static void main(String[] args) {
		nl=new NestedLoop();
		br=new BufferedReader(new InputStreamReader(System.in));
		nl.starProgram();
		//nl.reverseStarProgram();
		//nl.triangleProgram();

	}
	public void triangleProgram() {
		for(int i=3;i<6;i++) {
			for(int j=0;j<i;j++)
			{
				
				
			System.out.print("*");
			}
			System.out.println("*");
		}
		
	}
	public void starProgram() {
		for(int i=0;i>5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println(" * ");
		}
		
	}
	public void reverseStarProgram() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}

}
