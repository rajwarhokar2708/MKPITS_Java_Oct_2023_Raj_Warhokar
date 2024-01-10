package com.mkpits.typecasting;

public class PracticeInTypeCasting {
	static int pinCode,iD;
	public static void main(String[] args) {
		
		PracticeInTypeCasting obj=new PracticeInTypeCasting();
		PracticeInTypeCasting object=new PracticeInTypeCasting(465,550030);
		PracticeInTypeCasting obj2=new PracticeInTypeCasting(object);
		
	double d=106465454.56;
	int i=(int)d;
	System.out.println(i);
	}
	public PracticeInTypeCasting() {
		pinCode=440030;
		iD=123;
		System.out.println("PinCode :"+pinCode+"\n"+"ID :"+iD);
	}
	public PracticeInTypeCasting(int iD,int pinCode) {
		iD=456;
		pinCode=550030;
		System.out.println("Id :"+iD+"\n Pin code :"+pinCode);
	}
	public PracticeInTypeCasting(PracticeInTypeCasting obj) {
		iD=obj.iD;
		pinCode=obj.pinCode;
	}
}