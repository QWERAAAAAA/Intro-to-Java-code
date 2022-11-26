package ch_12;

// 输入错误异常，让其重新输入
import java.util.*;
public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.print("Enter an integer: ");
				int num = input.nextInt();		// 这里可能会抛出一个异常InputMismatchException
				
				System.out.println("The number entered is " + num);
				
				continueInput = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Try again. (Incorrect input: an integer is required)");
				input.nextLine();		// 丢弃当前当输入行，所以用户可以键入一个新行
			}
		}while(continueInput);
	}
}
// good code！

/*	分析：
 * 	1. 当执行到input.nextInt()时，如果输入不是一个整数，就会出现一个InputMismatchException异常
 * 	2. input.nextLine()语句丢弃当前当输入行，所以用户可以键入一个新行。
 * 	3. 变量continueInput来控制循环
 */
