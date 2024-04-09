package com.mkpits.overriding;

public class MethodOverRiding {
	static Rectangle obj;
		public static void main(String[] args) {
			
		MethodOverRiding m=new MethodOverRiding();
		 
			obj=new Rectangle();
			obj.getData(5,6);
			obj.area();
			obj=new Triangle();
			obj.getData(10, 5);
			obj.area();
			
			m.check();
	}

		public void check() {
			obj.area();
		}
}