package com.mkpits.operator;

public class AssignmentOperators {

	public static void main(String[] args) {
		AssignmentOperators opretor=new AssignmentOperators();
		opretor.equalTo();
		opretor.addEqualTO();
		opretor.subEqualTo();
		opretor.mulEqualTo();
		opretor.divEqualTo(64,8);
		opretor.moduleEqualTo(12,5);

	}

	private void  moduleEqualTo(float a,float b) {
		System.out.println("Module is :"+(a%=b));
	}

	private void divEqualTo(int a ,int b) {
		System.out.println("Division is :"+(a/=b));
		
	}

	private void mulEqualTo() {
		int a=12,b=6;
		System.out.println("Multipication is :"+(a*=b));
		
	}

	private void subEqualTo() {
		int a=65,b=35;
		System.out.println(a-=b);
		
	}

	private void addEqualTO() {
		int a=5,b=6; 
		System.out.println(a+=b);//(a=a+b)
		
	}

	private void equalTo() {
		int a=5,b=6; 
		System.out.println(a==b);
	}

}
