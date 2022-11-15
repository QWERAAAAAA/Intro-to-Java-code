package ch_2;

// 如何设计解决问题的策略，如何应用编程语言实现这个策略 —— 计算圆面积
// 练习基本的输入和输出

/*
 * 算法分析：
 * 		1. 读入半径
 * 		2. 利用公式计算面积
 * 		3. 显示面积
 */

import java.util.Scanner;		// Scanner类在java.util包中

public class ComputeArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		
		double radius = input.nextDouble();
		double area = radius * radius * 3.14159;
		
		System.out.println("The area of the circle of radius " + radius + " is " + area);
	}
}

/*
 * 	1. 输出：只需要使用println方法即可。
 * 	2. 输入：需要使用Scanner类创建它的对象(input)，以读取来自System.in的输入
 * 			Scanner input = new Scanner(System.in);
 * 		意思是：	声明了一个Scanner类型的变量(Scanner input)
 * 				创建了一个Scanner对象(new Scanner(System.in))
 * 				并且将它的引用值赋值给变量input
 */

/*	注意：字符串常量不可以跨行
 * 	以下示例是错误的！
 * 	System.out.println("Introduction to Java Programming,
 * 		by Y.");
 */

/*
 * 	print vs println
 * 	前者输出后不换行，后者换行
 */

/*	导入包 —— import语句
 * 	1. 明确导入：导入包中的单个类：		import java.util.Scanner;
 * 	2. 通配符导入：导入包中的所有类：		import java.util.*;
 */
