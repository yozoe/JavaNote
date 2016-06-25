package com.javanote.generic;

/**
 * 系统会把Apple<T>类里的T形参当成Object类型处理
 * 
 * @author wangdong
 *
 */

public class A2 extends Apple {

	public String getInfo () {
		return super.getInfo().toString();
	}
	
}
