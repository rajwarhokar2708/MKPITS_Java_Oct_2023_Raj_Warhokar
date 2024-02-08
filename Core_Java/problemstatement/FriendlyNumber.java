package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FriendlyNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		FriendlyNumber number=new FriendlyNumber();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a two number");
		int input=Integer.parseInt(br.readLine());
		int input2=Integer.parseInt(br.readLine());
		number.getFriendlyNumber(input,input2);
		
	}

	public void getFriendlyNumber(int input,int input2) {
		int sum=0,temp=0,sum2=0,temp2=0;
		for (int fLoop = 1; fLoop <input; fLoop++) {
			if(input%fLoop==0) {
				sum+=fLoop;
			}
		}
		if(input==sum) {
			temp=input/sum;
		}else {
			temp=-1;
		}
		
		
		for (int sLoop = 1; sLoop <input2; sLoop++) {
			if(input2%sLoop==0) {
				sum2+=sLoop;
			}
		}
		if(input2==sum2) {
			temp2=input2/sum2;
		}
		
		if(temp==temp2) {
			System.out.println("It is Friendly Number");
		}
		else {
			System.out.println("It is NOT Friendly Number");
		}

	}

}
