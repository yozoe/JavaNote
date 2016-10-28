package com.javanote.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {
	
	
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		
		
		
		for (int i = 0; i < 10000000; i++) {
			TestCounter mc = new TestCounter();
			Future<Integer> result = pool.submit(mc);
			try {
				System.out.println(result.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	}
	
}

class TestCounter implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName());
//		Thread.sleep(2000);
		return 1;
	}
	
}	
