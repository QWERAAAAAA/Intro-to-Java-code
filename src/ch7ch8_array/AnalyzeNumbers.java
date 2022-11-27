package ch7ch8_array;

/********************************************************
FileName:		分析数字
Author:        	M12J10
Created:       	2022/11/26
Description:	数组的基本应用。编写一个程序，找到大于大于平均值的数字。
********************************************************/


public class AnalyzeNumbers {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		double[] numbers = new double[n];	// !!!
		double sum = 0;
		
		System.out.print("Enter the numbers: ");
		for(int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		double average = sum / n;
		
		int count = 0;		// 记录大于平均值的数字的个数
		for(double e : numbers) {
			if(e > average)
				count++;
		}
		
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + count);
	}
}
