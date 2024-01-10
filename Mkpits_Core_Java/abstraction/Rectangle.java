package com.mkpits.abstraction;

public class Rectangle extends Shape {
	int length,width;
	
	public Rectangle(String color,int length,int width) {
		super(color);
		System.out.println("Rectangle Contructor executed -->");
		this.length=length;
		this.width=width;
	}

	@Override
	public double area() {
		double sum=length*width;
		return sum;
	}

	@Override
	public String toString() {
		
		return "Color of Circle :("+super.getColor()+") Area of Rectangle --> "+area();
	}

}
