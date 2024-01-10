package com.mkpits.method;

public class CallingMethodIntoMethod {

	public static void main(String[] args) 
	{
		
		System.out.println(getDetail());
		System.out.println();
		System.out.print("");

	}

	private static String getDetail() 
	{
		
		return name()+"\n" +gender()+"\n" + mob();
		
	}

	private static long mob() {
		
		return 9834826072L;
	}

	private static char gender() {
		
		return 'M';
	}

	private static String name() {
		
		return "Ashik";
	}

}
