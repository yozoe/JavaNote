package com.javanote.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {
	
	public static void main(String[] args) {
		String str = "我想求购一本<<疯狂Java讲义>>, 尽快联系我13500006666"
				+ "交朋友,电话号码是13611125565"
				+ "出售二手电脑,联系方式1589 9903312";
		
		Pattern p = Pattern.compile("((13\\d)|(15\\d))\\d{8}");
		Matcher m = p.matcher(str);
		
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}
