package com.mkpits.threadpro;

public class PrintThread2 extends Thread{
	Table t;
	
	public PrintThread2(Table table) {
		t=table;
	}
	
	@Override
	public void run() {
		t.printTable(7);
	}
}
