package com.mkpits.threadpro;

public class MyThread3SleepMethod extends Thread{
		@Override
		public void run() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i = 0; i <5; i++) {
				System.out.println("====="+i+"======");
			}
		}
}
