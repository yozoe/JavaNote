package com.yozoe.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FilenameFilterTest {
	public static void main(String[] args) throws IOException {
		File file = new File(".");
		String[] nameList = file.list(new MyFilter());
		for (String name : nameList) {
			System.out.println(name);
		}
		
		file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		
		for (String name : nameList) {
			System.out.println(name);
		}
	}
	
	static class MyFilter implements FilenameFilter {

		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return name.endsWith(".java") || new File(name).isDirectory();
		}
		
	}
}
