package ch6_method;

//示例：将十六进制数转化为十进制数
//将一个十六进制数作为字符串输入：public static int hexToDecimal(String hex)

import java.util.Scanner;
public class Hex2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		
		System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));		
		// 字符可以是大写的或小写的，用toUpperCase方法将它们都转换为大写
	}
	
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for(int i = 0; i < hex.length(); i++) {		// 对十六进制的每一位
			char hexChar = hex.charAt(i);			// 取出当前位置的值
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);	// 累计到当前位的值 = 累计上一个位置的值*16 + 当前位置的值
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) {
		if(ch >= 'A' && ch <= 'F')	// ch是ABCDEF的情况
			return 10 + ch - 'A';
		else	// ch是0-9的情况
			return ch - '0';
	}
}
