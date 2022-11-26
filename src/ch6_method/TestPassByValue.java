package ch6_method;

//方法中的值传递 —— 形参与实参
/*
* 	1. 参数顺序匹配。次序和数量上的匹配
* 	2. 如果实参为变量，则把变量的值传递给形参，无论形参在方法中是否改变，该变量都不受影响
* 		因为形参有独立于实参的存储空间
*/

public class TestPassByValue {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		System.out.println("Before invoking the swap method, num1 is "+ num1 + " and num2 is " + num2);
		
		swap(num1,num2);
		
		System.out.println("After invoking the swap method, num1 is "+ num1 + " and num2 is " + num2);
	}
	
	public static void swap(int n1, int n2) {
		System.out.println("\t Inside the swap method");
		System.out.println("\t\t Before invoking the swap method, n1 is "+ n1 + " and n2 is " + n2);
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("\t\t After invoking the swap method, n1 is "+ n1 + " and n2 is " + n2);
		
	}

}
