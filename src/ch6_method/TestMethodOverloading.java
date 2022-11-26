package ch6_method;

/*
 * 	重载方法
 * 	1. 被重载的方法必须具有不同的参数列表。不能基于不同修饰符或返回值类型来重载方法。
 * 		如：void method(int x) 和 int method(int y) 是不能区分的。
 * 	
 *	重载方法的一些情况：
 *	1. 自动转换：
 *		int max(int n1, int n2);	double max(double n1, double n2); 
 *		max(2, 3.5)调用那个重载方法？	调用第二个，int类型会自动转换为double值
 *
 *	2. 最精确匹配：
 *		double m(double x, double y);
 *		double m(int x, double y);
 *		m(4,5)调用哪个方法？	第二个。第二个更加精确。
 *
 *	3. 歧义调用：
 *		double max(int n1, double n2);	double max(double n1, int n2);
 *		max(1,2)调用那个重载方法？		编译错误！
 *	
 */

public class TestMethodOverloading {
	public static void main(String[] args) {
		System.out.println("The maximum of 3 and 4 is " + max(3, 4));
		System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
		System.out.println("The maximum of 3.0, 5.4 and 10.14 is " + max(3.0, 5.4, 10.14));
	}

	public static int max(int n1, int n2) {
		if(n1 > n2)
			return n1;
		else
			return n2;
	}
	
	public static double max(double n1, double n2) {
		if(n1 > n2)
			return n1;
		else
			return n2;
	}
	
	public static double max(double n1, double n2, double n3) {
		return max(max(n1,n2),n3);
	}
}
