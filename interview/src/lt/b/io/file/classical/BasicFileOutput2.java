package lt.b.io.file.classical;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * 使用PrintWriter 的快捷方式进行复制 
 * 注意 使用完了流一定关闭 否则有可能写入不成功
 * @author liutao
 *
 */
public class BasicFileOutput2 {
	public static void main(String[] args) throws IOException {
		String file="/home/liutao/fileOp/8.txt";
		PrintWriter printWriter=new PrintWriter(file);
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
