package com.javanote.annotation;

class Apple1 {
	@Deprecated
	public void info() {
		System.out.println("Apple的info方法");
	}
}

public class DeprecatedTest {
	public static void main(String[] args) {
		new Apple1().info();
	}
}
