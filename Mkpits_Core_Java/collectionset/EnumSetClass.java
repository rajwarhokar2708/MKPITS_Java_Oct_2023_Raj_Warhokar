package com.mkpits.collectionset;

import java.util.EnumSet;
import java.util.Set;

enum EnumClass{
	NAGPUR,AMARAVTI,WARDA,GONDIA,PUNE,MUMBAI,
	RAJ, HARSH,SIR;
}

public class EnumSetClass {
	public static void main(String[] args) {
		Set<EnumClass> enums;
		//Here Enum Class is predefined Class and of is a predefined method of this class
		enums= EnumSet.of(EnumClass.NAGPUR,EnumClass.AMARAVTI,EnumClass.WARDA,EnumClass.GONDIA,EnumClass.PUNE,EnumClass.MUMBAI);
		System.out.println(enums);
		
		
//		enums = EnumSet.of(EnumClass.HARSH,EnumClass.RAJ);
//		System.out.println(enums);
		
		
	}
}
