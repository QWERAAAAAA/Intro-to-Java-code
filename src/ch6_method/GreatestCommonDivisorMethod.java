package ch6_method;

// 方法用来模块化代码
// 示例：求两个整数的最大公约数

import java.util.Scanner;
public class GreatestCommonDivisorMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1,n2));
	}
	
	public static int gcd(int n1, int n2) {
		int gcd = 1;
		int k = 2;
		while(k <= n1 && k <= n2) {
			if(n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}
		return gcd;
	} 
}

/*
 * 	将求最大公约数的代码封装到一个方法中，有以下优点：
 * 	1. 与其他代码分开，逻辑更加清晰，可读性更强
 *  2. 计算最大公约数的错误限定在gcd方法中，缩小了调试的范围
 *  3. 其他程序可以重复使用gcd方法
 */

