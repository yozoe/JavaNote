package com.javanote.annotation;

public class Fruit {
	public void info() {
		System.out.println("水果的info方法...");
	}
}

class Apple extends Fruit {
	@Override
	public void info() {
		//加上@Override则父类必须有info方法
		System.out.println("苹果重写水果info方法...");
	}
}