package com.javanote.innerclass;

class Out {
	class In {
		public In (String msg) {
			System.out.println(msg);
		}
	}
}

public class CreateInnerInstance {

	public static void main(String[] args) {
		Out.In in = new Out().new In("测试信息");
		
		/**
		 * 非静态内部类必须使用外部类对象来调用
		 */
		
		Out out = new Out();
		in = out.new In("测试信息");
	}
	
}
