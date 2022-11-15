package ch_2;

// 运算符：将华氏度转化为摄氏度
import  java.util.Scanner;
public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fahrenheit = input.nextDouble();
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	}
}

// 要注意除法！两个整数相除的商为整数。