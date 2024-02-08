package com.mkpits.overriding;

public class Rectangle {
	int w,h;
	
	public void getData(int w,int h) {
		this.w=w;
		this.h=h;
	}
	protected void area() {
		int a=w*h;
		System.out.println("Rectangle Class :"+a);
	}


}
