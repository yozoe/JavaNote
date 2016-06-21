package com.javanote.innerclass;

public class StaticTest {

	private class In {}
	
	public static void main(String[] args) {
		/**
		 * 不允许在外部类的静态成员中直接使用非静态内部类
		 */
//		new In();
	}
	
}
