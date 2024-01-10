package com.mkpits.abstraction;

public class Circle extends Shape {
	double radius;
	public Circle(String color,double radius) {
		super(color);
		System.out.println("Circle contructer executed ");
		this.radius=radius;
	}
	@Override
	public double area() {
		System.out.println("Circle Class area method executed ");
		double sum=2*Math.PI*Math.pow(radius,0);
		return sum;
	}
	@Override
	public String toString() {
		
		return "Circle Color is :("+super.getColor()+") and Area is :"+area();
	}
	
	
}
