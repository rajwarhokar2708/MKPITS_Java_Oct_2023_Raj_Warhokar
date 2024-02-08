package com.mkpits.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {
	static int attempt;
	public static void main(String[] args) throws NumberFormatException, IOException {
		NumberGame ng=new NumberGame();
		ng.game();

	}

	public void game() throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int randomValue=(int)Math.floor(Math.random()*100);
		
	
		
		for(int i=1;i<=10;i++) {
			System.out.println(randomValue);
			System.out.println("Enter a value 1 to 100 :");
			int uValue=Integer.parseInt(br.readLine());
			
		if(randomValue<uValue) {
			System.out.println("Your Value is greater Enter Value Again");
		}
		if(randomValue>uValue) {
			System.out.println("Your Value is Smaller Enter Value Again");
		}
		if(randomValue==uValue) {
			System.out.println("Value Matched you Win !");
			attempt=i;
			System.out.println("You take "+attempt+" Attempt");
			break;
		}
		
		
		}
		
		 
		
	}

}
