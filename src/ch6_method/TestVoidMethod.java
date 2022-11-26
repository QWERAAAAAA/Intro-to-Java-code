package ch6_method;


// void方法的演示
/*
 * 	1. 对void方法对调用必须是一条语句
 *  2. void方法不需要return语句
 *  3. void方法中的return可以用于终止方法	return ;
 */

public class TestVoidMethod {
	public static void main(String[] args) {
		System.out.print("The grade is ");
		printGrade(78.5);
		
		System.out.print("The grade is ");
		printGrade(59.5);
		
		System.out.print("The grade is ");
		printGrade(92);
	}

	public static void printGrade(double score) {
		if(score < 0 || score > 100) {
			System.out.println("Invalid score");
			return ;
		}
		else if(score >= 90.0) {
			System.out.println('A');
		}
		else if(score >= 80.0) {
			System.out.println('B');
		}
		else if(score >= 70.0) {
			System.out.println('C');
		}
		else if(score >= 60.0) {
			System.out.println('D');
		}
		else
			System.out.println('F');
	}
}

/*
 * 	课本小练习：写出下列方法的方法头
    - 给定销售额和提成率，计算销售提成。
    	public static double pushMoney(double sell, double pushRate)
	• 给定月份和年份，打印该月的日历。
		public static void Date(int month, int year)
	• 计算一个数的平方根。
		public static double sqrt(double num)
	• 测试一个数是否是偶数，如果是，则返回true。
		public static boolean isEven(int num)
	• 按指定次数打印某条消息。
		public static void printNote(string message, int times)
	• 给定贷款额 、还款年数和年利率，计算月支付额。
		public static double monthPay(double loan, int year, double yearRate)
	• 对于给定的小写字母，给出相应的大写字母
		public static char Up(char letter)
 */
