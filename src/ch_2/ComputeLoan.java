package ch_2;

//示例：设计一个计算贷款支付的程序。
//输入利率、贷款额度、支付的年数
//输出月支付额度、总支付额度

import java.util.Scanner;
public class ComputeLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter annual interest rate, loan amount and number of years as an integer: ");
		double rate = input.nextDouble();
		double loan = input.nextDouble();
		int years = input.nextInt();
		
		double monthRate = rate / 1200;
		double monthPay = (loan * monthRate) / (1 - (1 / Math.pow((1+monthRate), years*12)));
		double totalPay = monthPay * years * 12;
		
		System.out.println("The monthly payment is $" + ((int)(monthPay * 100) / 100.0));
		System.out.print("The total payment is $" + ((int)(totalPay * 100) / 100.0));
	}
}


