package lt.b.io.file.classical;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.junit.Test;

public class Redirecting {
	public static void main(String[] args) throws IOException {
		BufferedInputStream in=new BufferedInputStream(new FileInputStream("/home/liutao/fileOp/Mutt.java"));
		//将标准输入接入到文件上
		System.setIn(in);
		//从输入读取文件
		BufferedReader bIn=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=bIn.readLine())!=null)
		{
			System.out.println(s);
		}
	}
	@Test
	public void fun1() throws IOException
	{
		PrintStream out=new PrintStream(new BufferedOutputStream(new FileOutputStream("/home/liutao/fileOp/1.txt")));
		//将标准输出定位到out上
		System.setOut(out);
		System.out.print("hello world 将标准输出定位文件中");
		out.close();
	}

}
