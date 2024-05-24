package com.mkpits.threadpro;

public class PrintThread1 extends Thread{
	Table t;
	public PrintThread1(Table table) {
		this.t=t;
	}
	
	@Override
	public void run() {
		t.printTable(5);
	}
}
