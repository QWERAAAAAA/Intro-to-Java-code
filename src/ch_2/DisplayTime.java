package ch_2;

// 运算符%求余的使用 + 幂运算
// 计算以秒为单位的时间量所包含的分钟数和余下的秒数。

import java.util.Scanner;
public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int seconds = input.nextInt();
		int mins = seconds / 60;
		seconds = seconds % 60;
		System.out.println("It's " + mins + " : " + seconds);
		
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(4, 0.5));
	}
}

/*
 * 幂运算分析：
 * 	1. 使用了Math类中的pow(a,b)方法来计算a^b
 * 	2. 运用Math.pow(a,b)调用。这里的a,b是pow方法的参数。
 */
