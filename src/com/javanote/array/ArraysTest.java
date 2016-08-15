package com.javanote.array;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
//		int[] a = new int[]{3, 4, 5, 6};
//		int[] a2 = new int[]{3, 4, 5, 6};
//		
//		System.out.println("a数组和a2数组是否相等: " + Arrays.equals(a, a2));
//		
//		int[] b = Arrays.copyOf(a, 6);
//		System.out.println("a数组和b数组是否相等: " + Arrays.equals(a, b));
//		
//		System.out.println(Arrays.toString(b));
		
		//要打印几行
		int line = 10;
		
		//offset是起始的星星数, offset+=2,是每次循环offset自增2,所以显示成1,3,5,7,9...
		for (int i = 1, offset = 1; i <= line; i++, offset += 2) {
			
			for (int k = line; k > i; k--) {
				System.out.print(" ");
			}			
			
			for (int j = 1; j <= offset; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 	}
	
}

//  *
// ***
//*****