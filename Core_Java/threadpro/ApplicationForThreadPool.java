package com.mkpits.threadpro;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationForThreadPool {

	public static void main(String[] args) {
		ExecutorService executor= Executors.newFixedThreadPool(1);
		
		for (int i = 0; i < 1; i++) {
			Runnable worker= new MyWorkerThread(" task "+i);
			executor.execute(worker);
		}
		
		executor.shutdown();
		
		
		while (!executor.isTerminated()) {System.out.println("running");}
//		boolean var=executor.isTerminated();
//			System.out.println(var);
		System.out.println("Finised All Threads");
	}

}
