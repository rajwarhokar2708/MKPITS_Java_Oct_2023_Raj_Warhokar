package com.mkpits.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveChar {

	public static void main(String[] args) {
		RemoveChar rc=new RemoveChar();
		rc.removeChar();
		

	}

	public void removeChar() {
		String name="Raj Warhokar";
		int range=name.length();
		char ch[]=new char[range];
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length ;j++) {
				if(name.charAt(i)==name.charAt(j)) {
					
				}
			}
		}
		
	}

}
