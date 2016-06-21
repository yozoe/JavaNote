package com.javanote.innerclass;

public class SubClass extends Out.In {

	//创建非静态内部类的构造器时,必须保证子类构造器可以调用非静态内部类的构造器
	
	public SubClass(Out out, String msg) {
		out.super(msg);
	}

}
