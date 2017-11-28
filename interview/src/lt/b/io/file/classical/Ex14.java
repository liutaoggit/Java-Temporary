package lt.b.io.file.classical;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

/**
 * 使用FileWriter和BufferedWriter来比较文件写入的性能
 * @author liutao
 *
 *使用BufferedWriter 165
 *使用FileBufferWriter 329
 */
public class Ex14 {
	public static void main(String[] args) throws IOException {
		long t=System.currentTimeMillis();
		String file="/home/liutao/fileOp/7.txt";
		PrintWriter printWriter=new PrintWriter(new BufferedWriter(new FileWriter(file)));
		for(int i=0;i<100000;i++)
		{
			printWriter.println(Math.random());
		}
		printWriter.close();
		System.out.println(System.currentTimeMillis()-t);
		long t1=System.currentTimeMillis();
		
		PrintWriter printWriter2=new PrintWriter(new FileWriter("/home/liutao/fileOp/9.txt"));
		for(int i=0;i<100000;i++)
		{
			printWriter.println(Math.random());
		}
		System.out.println(System.currentTimeMillis()-t1);
	}
	
	/**
	 * 当然缓冲流 只有在缓冲区和写入的数据特别大时 才会明显的起作用
	 * 否则和普通的不是用BufferedWriter没什么区别
	 * @throws IOException
	 */
	@Test
	public void fun1() throws IOException
	{
		FileWriter writer=new FileWriter("/home/liutao/fileOp/9.txt");
		writer.write("hello blue yello red");
		writer.close();
		String s=new String();
//		s.matches(regex)
	}
}
