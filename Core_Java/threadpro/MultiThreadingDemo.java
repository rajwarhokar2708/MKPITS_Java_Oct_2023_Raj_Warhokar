package com.mkpits.threadpro;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		MyThread3SleepMethod thread1=new MyThread3SleepMethod();
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyThread3SleepMethod thread2=new MyThread3SleepMethod();
		thread2.start();
//		thread2.start();
		
	}

}
