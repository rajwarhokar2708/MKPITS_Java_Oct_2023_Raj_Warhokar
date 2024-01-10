package com.mkpits.method;

public class CallingMethod2 {
	public static void main(String[] args) {
		//calling by objectname
		MethodDeclaration md=new MethodDeclaration();
		md.getAllData();
		//Calling by instance
		//By using instance we call only one method or variable
		new MethodDeclaration().getEmail();
	}

}
