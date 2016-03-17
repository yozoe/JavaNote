package com.yozoe.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		File file = new File("src/com/yozoe/file/FileReaderTest.java");
		
		FileReader fr = new FileReader(file);
		
		char[] cbuf = new char[32];
		
		int hasRead = 0;
		while ((hasRead = fr.read(cbuf)) > 0) {
			System.out.println(new String(cbuf, 0, hasRead));
		}
		
		fr.close();
	}
}
