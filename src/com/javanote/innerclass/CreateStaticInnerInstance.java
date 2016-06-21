package com.javanote.innerclass;

/**
 * 静态类和非静态内部类的区别是在创建内部类对象时,静态内部类只需使用外部类即可调用构造器,而非静态内部类必须使用外部类对象来调用构造器
 * 相比之下,使用静态内部类比使用非静态内部类要简单很多,只要把外部类当成静态内部类的包空间即可.
 * 
 * @author wangdong
 *
 */

class StaticOut {
	static class StaticIn {
		public StaticIn () {
			System.out.println("静态内部类的构造器");
		}
	}
}

public class CreateStaticInnerInstance {
	
	public static void main(String[] args) {
		StaticOut.StaticIn in = new StaticOut.StaticIn();
		
	}

}
