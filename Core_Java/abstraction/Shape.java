package com.mkpits.abstraction;

public abstract class Shape {
	String color;
	
	public abstract double area();
	
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape Constructor Executed -->");
		this.color=color;
	}
	
	public String getColor() {
		return color;
		
	}
}
