package com.yozoe.concurrent;

public class DeamonThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		DeamonThread t = new DeamonThread();
		t.setDaemon(true);
		//守护线程在所有前台线程执行完毕后自动退出
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
}
