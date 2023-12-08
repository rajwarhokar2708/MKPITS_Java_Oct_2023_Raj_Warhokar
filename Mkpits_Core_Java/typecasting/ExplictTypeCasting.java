package com.mkpits.typecasting;

public class ExplictTypeCasting//(Narrowing or Mannual Casting) 
{

	public static void main(String[] args) {
		long mobileNum=7020881l;//Premitive data-type into Premitive data-type
		int convension=(int)mobileNum; 
		System.out.println("Long Mobile Number Value Casting into Integer :"+convension);
		
		
		//In object data-type 
		String smartMobile_Price="15465.46";//Premitive data-type to User data-type
		int i=(int)Float.parseFloat(smartMobile_Price);
		float productPrice=Float.parseFloat(smartMobile_Price);
		System.out.println(i);
		System.out.println("Object value converted into premitive datatype value :"+productPrice);
		
		short num=23;
		byte by=(byte)num;
		System.out.println(by);
		
		int harsh=5;

		
		
	}

}
