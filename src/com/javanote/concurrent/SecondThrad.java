package com.javanote.concurrent;

public class SecondThrad implements Runnable {

	private int i;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 20) {
				SecondThrad st = new SecondThrad();
				new Thread(st).start();
				new Thread(st).start();
			}
		}
	}

}
