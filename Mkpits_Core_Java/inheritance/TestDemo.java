package com.mkpits.inheritance;

public class TestDemo {

	public String fName,lName;

	public void fetchData(String fName,String lName) 
	{
		this.fName=fName;
		this.lName=lName;
	}
	
	public void display() 
	{
		System.out.println("Your Name is :"+fName+" "+lName);
	}

}
