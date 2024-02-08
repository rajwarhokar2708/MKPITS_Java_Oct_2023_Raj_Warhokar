package com.mkpits.string;

public class StringClass {
	public static void main(String[] args) {
		String newString = new String();
		byte[] b = { 65, 66, 67, 68, 69, 50 };
		char ch[] = { 'x', 'y', 'z', '1', '2' };
		String s1 = new String();
		System.out.println("-->" + s1);
		String s2 = new String(b);
		System.out.println(s2);
		String s3 = new String(b, 1, 3);
		System.out.println(s3);
		String s4 = new String(b, 1, 0, 3);
		System.out.println(s4);
		System.out.println("-----------------------------------------");

		String name = "Raj Warhokar";
		String name2 = "Raj Warhokar";
		String name3 = "Kaustubh anjankar";
		System.out.println(name.charAt(6));// 6 index wala character print karega
		System.out.println(name.chars());
//		System.out.println(name.codePointAt(5));//UniCode print karega 5 index wale charcter ka
		System.out.println(name.codePointBefore(5));//
		System.out.println(name.codePointCount(1, 7));
		System.out.println(name.compareTo(name2));
		System.out.println(name.compareToIgnoreCase(name2));
		System.out.println(name.concat(name2));
		System.out.println(name.contains(name2));// contain method check krta hai ke secound string me jo data hai vo
													// first me hai ke nhi if hai to true print karega nhi to false
		System.out.println(name.contentEquals(name2));
		System.out.println(name.endsWith("r"));// jo charcter method me pass karege vo check karega ke vo string ke last
												// charcter se same hai ya nhi
		System.out.println();
		
		
	}
}
