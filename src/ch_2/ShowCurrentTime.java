package ch_2;

// 示例学习：显示当前时间
// 可以调用System.currentTimeMillis()返回当前时间
// 开发一个以格林威治标准时间来显示当前时间的程序
// currentTimeMillis()返回从GMT 1970年1月1日00:00:00到当前时刻的毫秒数。

// 调用currentTimeMillis()方法获取当前时间，通过取整/和取余%，把他们转换为小时、分钟和秒数。

public class ShowCurrentTime {
	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;
		
		System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
		
	}
}

// GMT时间比北京时间晚8小时