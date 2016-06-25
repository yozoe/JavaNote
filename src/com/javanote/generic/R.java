package com.javanote.generic;

public class R<T> {

	/**
	 * 不能在静态变量声明使用类型形参,不管为泛型的类型形参传入哪一种类型实参,对于java来说他们依然被当成同一个类处理,在内存中也只占一块内存空间
	 * 因此在静态方法,静态初始化块或者静态变量的声明和初始化中不允许使用类型形参
	 * 由于系统中不会真正生成泛型类,所以instanceof运算符后不能使用泛型类
	 */
//	static T info;
	
	T age;
	
	public void foo (T msg) {
		
	}
	
	/**
	 * 不能在静态方法声明中使用类型形参
	 */
//	public static void bar (T msg) {
//		
//	}
}
