package com.javanote.innerclass;

public class AccessStaticInnerClass {
	
	static class StaticInnerClass {
		private static int prop1 = 5;
		private static int prop2 = 9;
	}
	
	public void accessInnerProp () {
		
//		System.out.println(prop1);
		
		System.out.println(StaticInnerClass.prop1);
		
		System.out.println(new StaticInnerClass().prop2);
		
	}
	
	public static void main(String[] args) {
		new AccessStaticInnerClass().accessInnerProp();
	}

}
