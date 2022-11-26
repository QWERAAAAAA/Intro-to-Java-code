package ch_12;

// 1. 演示异常：异常如何创建以及如何抛出 —— 经常出现在我们的程序中

import java.util.Scanner;
public class Quotient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		// System.out.print(num1 + "/" + num2 + " is " + (num1/num2));
		
		if (num2 != 0)
			System.out.print(num1 + "/" + num2 + " is " + (num1/num2));
		else
			System.out.print("DIvisor cannot be zero.");
		
	}
}

/*
 * 	Enter two integers:3 0
 * 	输入被除数为0，产生一个运行时错误
 *	Exception in thread "main" java.lang.ArithmeticException: / by zero
 *	at ch_12.Quotient.main(Quotient.java:13)
 */

/*
 * 我们可以在我们的代码中增加if语句进行这个问题的处理 —— 异常处理
 */
