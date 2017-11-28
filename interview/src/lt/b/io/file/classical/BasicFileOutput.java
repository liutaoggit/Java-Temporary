package lt.b.io.file.classical;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * 使用PrintWriter进行文件复制
 * 使用了BufferWriter修饰类
 * @author liutao
 *
 */
public class BasicFileOutput {
	public static void main(String[] args) throws IOException {
		String file="/home/liutao/fileOp/8.txt";
		PrintWriter printWriter=new PrintWriter(new BufferedWriter(new FileWriter(file)));
		BufferedReader reader=new BufferedReader(new StringReader(BufferedInputFile.read("/home/liutao/fileOp/Mutt.java")));
		String s;
		while((s=reader.readLine())!=null)
		{
			printWriter.println(s);
		}
		printWriter.close();
		reader.close();
	}
}
