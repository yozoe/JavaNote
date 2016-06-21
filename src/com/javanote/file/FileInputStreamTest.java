package com.javanote.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		File file = new File("src/com/yozoe/file/FileInputStreamTest.java");
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] bbuf = new byte[1024];
			int hasRead = 0;
			while ((hasRead = fis.read(bbuf)) > 0) {
				System.out.println(new String(bbuf, 0, hasRead));
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
