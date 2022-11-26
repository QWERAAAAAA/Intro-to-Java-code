package ch_12;

/*
 * 	文本I/O —— 3.使用try-with-resources自动关闭资源
 * 		程序猿经常忘记关闭文件 —— 自动关闭文件
 * 		try(声明和创建资源){
 * 			使用资源来处理文件;
 * 		}
 */

public class WriteDataWithAutoClose {
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("grade.txt");
		if(file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		try(java.io.PrintWriter output = new java.io.PrintWriter(file);){
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
		}
	}
}

/*
 * 	try中的资源必须是AutoCloseable的子类型，具有一个close()方法
 * 	块结束后，资源的close()方法自动调用以关闭资源。
 */
