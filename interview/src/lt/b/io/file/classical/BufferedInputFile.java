package lt.b.io.file.classical;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

/**
 * 使用FileReader+BufferedReader来读取文件
 * 
 * 替代FileInputStream+BufferedInputStream
 * @author liutao
 *
 */
public class BufferedInputFile {
	public static String read(String fileName) throws IOException
	{
		BufferedReader reader=new BufferedReader(new FileReader(fileName));
		String s;
		StringBuilder sb=new StringBuilder();
		while((s=reader.readLine())!=null)
		{
			sb.append(s+"\n");
		}
		reader.close();
		return sb.toString();
	}
	public static List<String> read1() throws IOException
	{
		BufferedReader reader=new BufferedReader(new FileReader("/home/liutao/fileOp/Mutt.java"));
		String s;
		List<String> list=new ArrayList<String>();
		while((s=reader.readLine())!=null)
		{
			list.add(s);
		}
		reader.close();
		return list;
	}
}
