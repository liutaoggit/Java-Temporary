package lt.b.io.file.ex;

import java.io.File;
import java.io.IOException;

/**
 * File类 创建/删除文件
 *创建目录
 *获取父路径，父文件
 * @author liutao
 *
 */
public class FileExample {
	public static void main(String[] args) throws IOException {
//		String s="/home/liutao/fileOp/1.txt";
		//创建目录 包括不存在的父路径
//		File file=new File(s);
//		file.createNewFile();//如果路径下存在 则返回false
//		System.out.println(file.getParent());
		String s="hello你好";
		byte[] bytes = s.getBytes();
		System.out.println(s.length()+" "+bytes.length);
//		System.out.println();
//		file.mkdir();  
//		file.mkdirs();
//		file.createNewFile();
//		file.delete();
	
		}
	

}
