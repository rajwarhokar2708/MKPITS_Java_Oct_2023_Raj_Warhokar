package com.mkpits.threadpro;

public class Application {

	public static void main(String[] args) {
		
		MyThread m1 = new MyThread();
		m1.start();
		
		MyTheread2 t2=new MyTheread2();
		Thread t=new Thread(t2);
		t.start();

	}

}
