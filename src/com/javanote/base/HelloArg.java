package com.javanote.base;

import java.text.MessageFormat;
import java.util.Date;

public class HelloArg {

	public static void main(String[] args) {
		String msg = "Hello,{0}!Toady is {1}";
		System.out.println(MessageFormat.format(msg, "yeeku", new Date()));
	}
	
}
