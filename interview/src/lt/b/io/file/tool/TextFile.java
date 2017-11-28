package lt.b.io.file.tool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import lt.b.io.file.classical.StoringAndRecoveringData;

public class TextFile extends ArrayList<String>{
	public static String read(String fileName) 
	{
		StringBuilder sb=new StringBuilder();
		try {
			//如果创建时抛异常 则不用关闭 ，直接跳到最后
			BufferedReader in=new BufferedReader(new FileReader(new File(fileName).getAbsolutePath()));
			try {
				String s;
				while((s=in.readLine())!=null)
				{
					sb.append(s+"\n");
				}
			} catch (Exception e) {
				throw new RuntimeException();
				// TODO: handle exception
			}finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return sb.toString();
	}
	public static void write(String fileName,String text)
	{
		try {
			PrintWriter out=new PrintWriter(new File(fileName).getAbsolutePath());
			try {
				out.print(text);
			} catch (Exception e) {
				throw new RuntimeException();
				// TODO: handle exception
			}finally {
				out.close();
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		}
	}
	public TextFile(String fileName,String splitter)
	{
		super(Arrays.asList(read(fileName).split(splitter)));
		if(get(0).equals(""))remove(0);
	}
	public TextFile(String fileName)
	{
		this(fileName, "\n");
	}
	/**
	 * 将TextFile中的文件写入到 fileName文件中
	 * @param fileName
	 */
	public void write(String fileName)
	{
		try {
			PrintWriter out=new PrintWriter(new File(fileName).getAbsolutePath());
			try {
				for(String item:this)
				{
					out.println(item);
				}
			} catch (Exception e) {
			throw new RuntimeException();
			}finally {
				out.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
		
	}
	public static void main(String[] args) {
		//read
//		String read = read("/home/liutao/fileOp/Directory.java");
//		write("/home/liutao/fileOp/dir.txt", read);a
		TextFile textFile = new TextFile("/home/liutao/fileOp/dir.txt","W+");
		textFile.write("/home/liutao/fileOp/dir1.txt");
		//static write
		//constructor+write
		
	}
}
