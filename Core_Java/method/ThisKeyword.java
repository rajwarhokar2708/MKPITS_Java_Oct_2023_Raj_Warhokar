package com.mkpits.method;

public class ThisKeyword {
	String  fName,lName;
	public static void main(String[] args) {
	ThisKeyword tkw=new ThisKeyword();
	tkw.getName("Raj","Warhokar");
	tkw.getPrint();
	tkw.getData();
	tkw.getTrail();
	tkw.getTrail2();
	tkw.getassign("Vinay","Karan");
	tkw.vinay();
	}

	private void getPrint() {
		System.out.println(fName+"  "+lName);
	}
	//Using 'this' keyword 
	private void getName(String fName, String lName) {
		this.fName=fName;
		this.lName=lName;
		System.out.println("My name is :-");
	}
	public void getData() {
		String Name=this.fName;
		String LName=this.lName;
		System.out.println(Name+LName);
	}
	public void getTrail() {
		fName="Akash";
		lName="Gautam";
		System.out.println("First name :"+fName+"\nLast name :"+lName);
	}
	public void getTrail2() {
		System.out.println(fName+" "+lName);
	}
	public void getassign(String fName,String lName) {
		this.fName=fName;
		this.lName=lName;
		System.out.println(fName+" "+lName);
	}
	public void vinay() {
		System.out.println(fName+" "+lName);
	}

}
