package com.javanote.array;

public class PrimitiveArrayTest {
	
	public static void main(String[] args) {
		int[] iArr;
		iArr = new int[5];
		for (int i = 0;i < iArr.length; i++) {
			iArr[i] = i + 10;
		}
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}

}
