package com.mkpits.threadpro;

public class Table {
//	public void printTable(int n) {
//		synchronized (this) {
//			for (int i = 1; i <=10; i++) {
//				System.out.println(n*i);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			
//		}
//	}
	
	synchronized public void printTable(int n) {
		for (int i = 1; i <=10; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
