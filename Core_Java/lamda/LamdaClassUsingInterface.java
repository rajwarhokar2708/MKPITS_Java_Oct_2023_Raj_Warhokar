package com.mkpits.lamda;

public class LamdaClassUsingInterface {
	
	interface Opreations{
		void square(int sqr);
	}
	public static void main(String[] args) {
		
		Opreations o=(int sqr) -> System.out.println(sqr*sqr);
		o.square(5);
	}

}
