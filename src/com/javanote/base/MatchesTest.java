package com.javanote.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesTest {
	public static void main(String[] args) {
		String[] mails = {
			"kongyeeku@163.com",
			"kongyeeku@gmail.com",
			"ligang@crazyit.org",
			"wawa@abc.xx"
		};
		String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
		Pattern mailPattern = Pattern.compile(mailRegEx);
		Matcher matcher = null;
		for (String mail : mails) {
			if (matcher == null) {
				matcher = mailPattern.matcher(mail);
			}
			else {
				//reset()方法可将现有的Matcher对象应用于新的字符序列
				matcher.reset(mail);
			}
			//matches()方法要求整个字符串和Pattern完全匹配时才返回true,lookingAt()只要字符串以Pattern开头就会返回true.
			String result = mail + (matcher.matches() ? "是" : "不是")
				+ "一个有效的邮件地址!";
			System.out.println(result);
		}
	}
}
