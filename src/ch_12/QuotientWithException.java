package ch_12;

import java.util.Scanner;
public class QuotientWithException {
	public static int quotient(int num1, int num2) {
		if(num2 == 0)
			throw new ArithmeticException("Divisor cannot be zero");	// 抛出一个异常.
		return num1 / num2;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		try {
			int result = quotient(num1,num2);
			System.out.println(num1 + " / " + num2 + " is " + result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Exception: an integer cannot be divided by zero.");
		}
		
		System.out.print("Execution continus ...");
	}
}
/*
 异常是一个从异常类创建的对象，此时的异常类为java.lang.ArithmeticException
 构造方法ArithmeticException(str)被调用来构建一个异常，其中str是描述异常的消息
 异常抛出时，正常的执行流程被中断，将异常从一个地方传递到另一个地方
 try块和catch块：
 	1. try块包含可能有异常的句子，和正常情况下执行的代码
 	2. 异常被catch块所捕获，catch块中的代码执行以处理异常
 	3. 执行完catch块之后，程序不返回throw语句，而执行catch块后的下一条语句
	
*/

/*
 * 	分析：catch块的头部
 * 	catch(ArithmeticException ex)
 * 	标识符ex类似方法中的参数（形参），ArithmeticException指明了catch块可以捕获的异常类型。
 * 	一旦捕获到该异常，就可以从catch块体中的参数访问这个抛出的值。
 */
