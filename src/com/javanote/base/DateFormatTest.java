package com.javanote.base;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import javafx.scene.input.DataFormat;

public class DateFormatTest {
	
	public static void main(String[] args) throws ParseException {
		Date dt = new Date();
		Locale[] locals = {Locale.CHINA, Locale.US};
		
		DateFormat[] df = new DateFormat[16];
		
		for (int i = 0; i < locals.length; i++) {
			df[i * 8] = DateFormat.getDateInstance(DateFormat.SHORT, locals[i]);
			df[i * 8 + 1] = DateFormat.getDateInstance(DateFormat.MEDIUM, locals[i]);
			df[i * 8 + 2] = DateFormat.getDateInstance(DateFormat.LONG, locals[i]);
			df[i * 8 + 3] = DateFormat.getDateInstance(DateFormat.FULL, locals[i]);
			df[i * 8 + 4] = DateFormat.getDateInstance(DateFormat.SHORT, locals[i]);
			df[i * 8 + 5] = DateFormat.getDateInstance(DateFormat.MEDIUM, locals[i]);
			df[i * 8 + 6] = DateFormat.getDateInstance(DateFormat.LONG, locals[i]);
			df[i * 8 + 7] = DateFormat.getDateInstance(DateFormat.FULL, locals[i]);
		}
		
		for (int i = 0; i < locals.length; i++) {
			String tip = i == 0 ? "----中国日期格式----" : "----美国日期格式----";
			System.out.println(tip);
			
			System.out.println("SHORT的日期格式: " + df[i * 8].format(dt));
			System.out.println("MEDIUM的日期格式: " + df[i * 8 + 1].format(dt));
			System.out.println("LONGT的日期格式: " + df[i * 8 + 2].format(dt));
			System.out.println("FULL的日期格式: " + df[i * 8 + 3].format(dt));
			System.out.println("SHORT的日期格式: " + df[i * 8 + 4].format(dt));
			System.out.println("MEDIUM的日期格式: " + df[i * 8 + 5].format(dt));
			System.out.println("LONG的日期格式: " + df[i * 8 + 6].format(dt));
			System.out.println("FULL的日期格式: " + df[i * 8 + 7].format(dt));
			
			String str1 = "2014-12-12";
			String str2 = "2014年12月10日";
			
			System.out.println(DateFormat.getDateInstance().parse(str1));
			System.out.println(DateFormat.getDateInstance(DateFormat.LONG).parse(str2));
			
			//被解析的字符串必须符合日期字符串的要求
//			System.out.println(DateFormat.getDateInstance().parse(str2));
			
		}
	}

}
