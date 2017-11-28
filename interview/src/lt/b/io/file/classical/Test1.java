package lt.b.io.file.classical;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class Test1 {
	@Test
	public void fun1()
	{
		BufferedInputFile inputFile=new BufferedInputFile();
		String read;
		try {
			read = inputFile.read("aaa");
			//发生异常 直接跳到异常处理
			if(true)
				throw new IOException();
			System.out.println(read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	@Test
	public void test2()
	{
		try {
			List<String> read1 = BufferedInputFile.read1();
			ListIterator<String> iterator=read1.listIterator(read1.size());
			String words[]=new String[] {"public","String"};
			while(iterator.hasPrevious())
			{
				
				String s=iterator.previous();
				for (String temp : words) {
					if(s.indexOf(temp)!=-1)
					{
						System.out.println(s);
						break;
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void fun3()
	{
		int i=0;
		System.out.println((i++));
	}
//	FileReader和FileWriter底层都是由InputStream和File实现的
	//getAbsolutePath无论是相对路径还是绝对路径都能获得文件File
	@Test
	public void fun4() throws IOException
	{
		File file=new File("./1/1.txt");
		System.out.println(file.getAbsolutePath());
		BufferedReader in=new BufferedReader(new FileReader(file.getAbsolutePath()));
		String readLine = in.readLine();
		System.out.println(readLine);
	}
	@Test
	public void fun5()
	{
		String string="abcdabiodkjqwekl ascsa sadlqwia sasklqwe";
		Pattern pattern=Pattern.compile("a");
		 Matcher matcher = pattern.matcher(string);
		 int num=0;
		 while(matcher.find())
		 {
			 num++;
		 }
		 System.out.println(num);
	}
	@Test
	public void fun6() throws ClassNotFoundException
	{
		Class.forName("lt.b.io.file.classical.A");
		Class.forName("lt.b.io.file.classical.A");
	}
	@Test
	public void fun7()
	{
//		String[] arr=new String[10];
//		String[] b=arr;
//		System.out.println(arr+" "+b);
		char[] c=new char[10];
		System.out.println((int)c[0]);
	}
}
class A{
	static {
		System.out.println("A static code");
	}
}
