package ch6_method;

// 第六章 方法

/*	1. 定义方法：public static 返回值 方法名（形参列表）{}
 * 	2. 举个例子：public static int max(int num1, int num2){}	
 * 	3. 分析：本章的所有方法都使用静态修饰符static
 * 			定义时，对于每一个参数进行独立的数据类型声明
 * 	4. 调用方法：两种途径
 * 		1） 如果方法返回一个值，对方法的调用通常就当作一个值处理
 * 			- int large = max(3,4)	调用方法max(3,4)并将其结果赋值给变量
 * 			- System.out.print(max(3,4))		打印调用max(3,4)后的返回值
 * 
 * 		2）如果方法返回void，对方法的调用必须是一条语句
 * 			- show();		调用show方法
 */


public class TestMax {
	public static void main(String[] args) {
		int i = 5, j = 2;
		int k = max(i,j);
		System.out.println("The maximum of " + i + " and " + j + " is " + k);
	}
	
	public static int max(int num1, int num2) {
		int result;
		if(num1 > num2)
			result = num1;
		else
			result = num2;
		return result;
	}
}

/*
 * 	方法 —— 代码共享和重用
 * 	除了在自己的类内调用max方法，还可以在其他类在调用它
 * 	通过 类名.方法名（TestMax.max()）来调用
 * 
 */
