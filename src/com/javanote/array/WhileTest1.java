package com.javanote.array;

import java.util.Random;
import java.util.Scanner;

class WhileTest1 
{
	public static void main(String[] args) 
	{
		Random random = new Random();// 生成随机数
		int randomNum = random.nextInt(10) + 1;
		Scanner scanner = new Scanner(System.in);// 创建扫描器
		boolean flag = true;// 循环条件
		int guessTime = 3;// 输入次数
		while (true) {
			System.out.println("请输入你要猜的数字:");
			int guessNum = scanner.nextInt();
			guessTime--;
			if (guessTime <= 0) {
				System.out.println("没机会了,正确答案是" + randomNum);
				break;
			}
			
			if (guessNum > randomNum) {
				System.out.println("大了，还有" + guessTime + "机会");
			} else if (guessNum < randomNum) {
				System.out.println("小了，还有" + guessTime + "机会");
			} else {
				System.out.println("正确");
				break;
			}

		}

	}
}