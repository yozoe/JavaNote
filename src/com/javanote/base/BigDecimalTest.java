package com.javanote.base;

import java.math.BigDecimal;

public class BigDecimalTest {
	
	public static void main(String[] args) {
		BigDecimal f1 = new BigDecimal("0.05");
		
		/**
		 * 如果必须使用double作为BigDecimal的参数,不要直接将该double浮点数作为构造参数创建,应该通过BigDecimal.valueOf(double value)静态方法来创建.
		 */
		BigDecimal f2 = BigDecimal.valueOf(0.01);
		BigDecimal f3 = new BigDecimal(0.05);
		
		System.out.println("使用String作为bigDecimal构造器参数: ");
		System.out.println("0.05 + 0.01 = " + f1.add(f2));
		
		System.out.println("使用double作为BigDecimal构造器参数: ");
		System.out.println("0.05 + 0.01 = " + f3.add(f2));
	}

}
