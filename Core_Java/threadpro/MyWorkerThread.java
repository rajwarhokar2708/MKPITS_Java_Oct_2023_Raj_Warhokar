package com.mkpits.threadpro;

public class MyWorkerThread extends Thread {
	String message;
	
	public MyWorkerThread(String s) {
		this.message=s;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(Start) message ="+message);
		processmesssage();
		System.out.println(Thread.currentThread().getName()+"End");
	}

	private void processmesssage() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
