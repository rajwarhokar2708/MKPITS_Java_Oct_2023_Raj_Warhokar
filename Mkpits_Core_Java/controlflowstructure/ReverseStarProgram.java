package com.mkpits.controlflowstructure;

public class ReverseStarProgram {

	public static void main(String[] args) {
		ReverseStarProgram r=new ReverseStarProgram();
		r.triangle();
		
		
	}

	public void triangle() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
			}
		
	}

}