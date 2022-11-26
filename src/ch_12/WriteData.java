package ch_12;
import java.io.*;

/*
 * 	文本I/O —— 2.使用PrintWriter写数据
 * 		java.io.PrintWrite类可用来创建一个文件并向文件写入数据。
 * 
 * 	首先必须为一个文本文件创建一个PrintWriter对象：
 * 		PrintWrite output = new PrintWriter(filename);
 * 		- 可以调用PrintWriter类的方法print,printf,println向方法写入数据。
 * 
 */

/*
 * 		向文件score.txt写入两行数据
 */

public class WriteData {
	public static void main(String[] args) throws IOException{
		File file = new File("scores.txt");
		if(file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		PrintWriter output = new PrintWriter(file);
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		output.close();		// 必须使用close()方法关闭文件，否则数据就不能正确的保存在文件中
	}
}
