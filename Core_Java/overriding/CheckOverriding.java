package com.mkpits.overriding;

public class CheckOverriding {

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.getData(5,6);
		t.area();
		new Rectangle().area();
		t.area();
	}

}
