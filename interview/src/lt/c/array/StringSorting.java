package lt.c.array;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lt.b.io.file.classical.BufferedInputFile;

/**
 * 字符串排序
 * 
 * java中的排序算法
 * 基本类型-->快排
 * 对象-->归并
 * @author liutao
 *
 */
public class StringSorting {
	public static void main(String[] args) throws IOException {
		String read = BufferedInputFile.read("/home/liutao/fileOp/Mutt.java");
		String[] split = read.split("\\W+");
		
		
		System.out.println("Before Sort："+Arrays.toString(split));
//		Arrays.sort(split);
//		Arrays.sort(split,String.CASE_INSENSITIVE_ORDER);
		Arrays.sort(split,Collections.reverseOrder());
		System.out.println("After Sort："+Arrays.toString(split));
		//读取文件 用BufferedInputStream或者用BufferedReader都行
		//写文件 用 BufferedOutputStrema或者用PrintWriter都行
		//当然用字符流效率更高
		
//		两种方式都行  
//		Pattern pattern=Pattern.compile("\\w+");
//		Matcher matcher = pattern.matcher(read);
//		while(matcher.find())
//		{
//			System.out.println(matcher.group());
//		}
	}
}
