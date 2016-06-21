package com.javanote.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			/*
			 * 处理流的优势:
			 * 1.使用处理流进行输入/输出操作更简单
			 * 2.使用处理流的执行效率更高
			 */
			PrintStream ps = new PrintStream(fos);
			ps.println("普通字符串");
			ps.println(new PrintStreamTest());
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
