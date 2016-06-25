package com.javanote.array;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int[] a = new int[]{3, 4, 5, 6};
		int[] a2 = new int[]{3, 4, 5, 6};
		
		System.out.println("a数组和a2数组是否相等: " + Arrays.equals(a, a2));
		
		int[] b = Arrays.copyOf(a, 6);
		System.out.println("a数组和b数组是否相等: " + Arrays.equals(a, b));
		
		System.out.println(Arrays.toString(b));
 	}
	
}
