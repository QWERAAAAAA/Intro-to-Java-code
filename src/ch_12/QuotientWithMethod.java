package ch_12;

// 如果让方法来处理异常 —— bad code

import java.util.Scanner;
public class QuotientWithMethod { 
  public static int quotient(int number1, int number2) {
    if (number2 == 0) {
      System.out.println("Divisor cannot be zero");
      System.exit(1);			// exit(1)表示异常终止、exit(0)表示正常终止，exit终止整个程序
    }

    return number1 / number2;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter two integers
    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    
    int result = quotient(number1, number2);
    System.out.println(number1 + " / " + number2 + " is " 
      + result);
  }
}

/*
 * 	分析：如果number2为0，程序会在第10行终止。
 * 	则显然是个问题，不应该让方法来终止程序 —— 一个由调用者决定是否终止程序。
 */
