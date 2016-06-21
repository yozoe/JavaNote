package com.javanote.innerclass;

public class Outer {
	
	private int outProp = 9;
	
	class Inner {
		private int inProp = 5;
		
		public void acessOuterProp () {
			System.out.println("外部类的outProp值:" + outProp);
		}
	}
	
	public void acessInnerProp () {
		/**
		 * 外部类不能直接访问内部类的实例变量,要访问必须显式创建内部类对象
		 */
//		System.out.println("内部类的inProp值:" + inProp);
		System.out.println("内部类的inProp值:" + new Inner().inProp);
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.acessInnerProp();
	}
	
}
