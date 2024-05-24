package com.mkpits.threadpro;

public class SynchronizedApplication {

	public static void main(String[] args) {
		Table table=new Table();
		PrintThread1 thread1=new PrintThread1(table);
		PrintThread2 thread2=new PrintThread2(table);
		thread1.start();
		thread2.start();
	}

}
