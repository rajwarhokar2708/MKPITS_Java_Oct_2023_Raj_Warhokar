package com.mkpits.string;

public class StringBufferOverview {

	public static void main(String[] args) {
		StringBufferOverview buff=new StringBufferOverview();
		buff.buffer();

	}

	public void buffer() {
		String myStr="My name is khan --> ";
		StringBuffer detail=new StringBuffer(myStr);
		String str="Khan is my name";
		StringBuffer string1=new StringBuffer(str);
		System.out.println(string1);
		
		
		
		
		
		
		
		
		detail=detail.append(str);
		System.out.println(detail);
		
		detail=detail.delete(5,10);
		System.out.println(detail);
		
		int c=detail.capacity();
		System.out.println(c);
		
		System.out.println(detail.charAt(20));
		
		//System.out.println(detail.chars());
		
		System.out.println(detail.codePointAt(5));
		
//		System.out.println(detail.compareTo(detail2));
		
		System.out.println("index of"+detail.indexOf(str));
		
		System.out.println(detail.indexOf("Index of"+str, 5));
		
		//System.out.println(detail.insert(5, true));
		
		System.out.println(detail.length());
		
		System.out.println("off det wala hai ye"+detail.offsetByCodePoints(5, 10));
		
		System.out.println(detail.reverse());
		
		System.out.println(str.repeat(5));
		
		
		
	}

}
