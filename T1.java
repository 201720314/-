package hkj;

import java.util.Random;

public class T1 {
	public static void main(String[] args) {
		printHeader();//开始
		printExandAn();//打印题目和答案
	}
	public static void printHeader() { 
		System.out.println("******每次运行程序可以得到一套50道题的习题及答案********");
	}
	public static void printExandAn() {
		int a = 0, b = 0, ac = 0;
		char p = '+';
		int s[] = new int[100];
		Random ran = new Random();
		System.out.println("习题如下：");
		for (int i = 0; i < 50; i++) {
			a = ran.nextInt(101);
			b = ran.nextInt(101);
			ac = ran.nextInt(2);
			if (ac == 1) {
				p = '+';
				s[i] = a + b;
			} else {
				p = '-';
				s[i] = a - b;
			}
			System.out.println((i + 1) + ":" + a + p + b + "= ");
		}
		System.out.println("答案如下：");
		for (int i = 0; i < 50; i++) {
			System.out.println((i + 1) + ": " + s[i]);
		}
	}
}
