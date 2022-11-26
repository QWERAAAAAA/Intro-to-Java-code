package ch_12;

/*
 * 	文本I/O —— 1.File类
 * 		File类包含获得一个文件/目录的属性，以及对文件/目录进行改名和删除的方法
 * 
 * 	两个概念：绝对文件名、相对文件名
 * 	程序猿编写代码时使用的是相对文件名，File类为其提供了一种抽象。
 * 
 * 	文件名是一个字符串。File类是文件名及其目录路径的一个包装类。
 * 	
 * 	File类中常用的方法：
 * 	
 */
public class TestFileClass {
	public static void main(String[] args) {
		java.io.File file = new java.io.File("image/us.gif");
		System.out.println("Does it exist? 	" + file.exists());
		System.out.println("The file has 	" + file.length() + " bytes");
		System.out.println("Can it be read? 	" + file.canRead());
		System.out.println("Can it be written? 	" + file.canWrite());
		System.out.println("Is it a directory? 	" + file.isDirectory());			// 判断是否为目录
		System.out.println("Is it a file? 	" + file.isFile());					// 判断是否为文件
		System.out.println("Is it absolute? 	" + file.isAbsolute());				// 判断是否采用绝对路径名创建
		System.out.println("Is it hidden? 	" + file.isHidden());					// 判断File对象代表的文件是否隐藏
		System.out.println("Absolute path is 	" + file.getAbsolutePath());
		System.out.println("Last modified on 	" + new java.util.Date(file.lastModified()));		
		// lastModified()返回文件最后被修改的日期和时间，从UNIX时间开始的毫秒数
		// Date()类用一种易读的格式显示它
	
		System.out.println("Return file path: 	" + file.getPath());
		System.out.println("Return file name: 	" + file.getName());
	}

}
