package com.javanote.innerclass;

public class StaticInnerClassTest {
	
	private int prop1 = 5;
	
	private static int prop2 = 9;
	
	static class StaticInnerClass {
		
		private static int age;
		
		public void accessOuterProp () {
			
			/**
			 * 静态内部类无法访问外部类的实例变量
			 */
			
//			System.out.println(prop1);
			System.out.println(prop2);
		}
		
	}

}
