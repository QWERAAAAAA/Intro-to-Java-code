package ch_2;

// 将营业税值显示为小数点后两位
import java.util.Scanner;
public class SalesTax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter purchase amount: ");
		
		double amount = input.nextDouble();
		double tax = amount * 0.6;
		System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
		System.out.println("Sales tax is $" + (int)(tax * 1000) / 1000.0);	// 那保留小数点后三位也相同啦
	}
}

/*
 * 	分析：假设输入197.55
 * 	则 tax * 100 是1185.3
 * 	(int)(tax * 100) 是 1185，这样使用int已经把小数点第二位之后的都舍弃了
 * 	(int)(tax * 100) / 100.0，再除以100.0又恢复了原来的大小。
*/
