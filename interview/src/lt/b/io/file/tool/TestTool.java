package lt.b.io.file.tool;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Dictionary;
import java.util.List;

import org.junit.Test;

import lt.b.io.file.tool.Directory.TreeInfo;

public class TestTool {
	public static void main(String[] args) throws IOException {
		//1
		//遍历更目录下所有文件（项目根目录）
		//		File file=new File(".");
		//		System.out.println(file.getName());
		//		System.out.println(Arrays.toString(file.list()));

		//2 getName有什么用
		//获取文件名称
		String name="/home/liutao/fileOp";
		//		System.out.println(new File(name).getName());

		//3 getAbsolutePath  获取的是全路径  如果构造函数是相对路径 则=绝对+构造
		System.out.println(new File(name).getAbsolutePath());
		//4 getCanonicalFile（） 得到的是标准全路径 会去掉多余的字符  如果构造函数是相对路径 则=绝对
		System.out.println(new File(name).getCanonicalPath());
		//5 getPath() 获取的是构造参数路径 一般不用
		System.out.println(new File(name).getPath());

		//区别File.list 和File.listFiles俩个方法
		String[] list = new File(name).list();
		File[] listFiles = new File(name).listFiles();
		System.out.println(list[0]);
	}

	@Test
	public void testLocale()
	{
		File[] locale = Directory.locale(".", "");
		System.out.println(Arrays.toString(locale));
	}

	@Test
	public void testWalk()
	{
		//		System.out.println(Directory.walk("."));
		//		System.out.println(Directory.walk("/home/liutao/fileOp"));
		TreeInfo treeInfo=Directory.walk("/home/liutao/fileOp","\\w+\\.java");
		List<File> files=treeInfo.files;
		int total=0;
		for (File file : files) {
			total+=file.length();
		}
		System.out.println("长度为："+total);
		System.out.println(files.size());
	}
	@Test
	public void testGetName()
	{
		String file="/home/liutao/fileOp/Cymric.java";
		System.out.println(new File(file).getName());
	}
	
	@Test
	public void testProcessFile()
	{
		try {
			long time=new Date().getTime();
			new ProcessFiles(new ProcessFiles.Strategy() {
				public void process(File file) {
//					System.out.println(file);
					if(file.lastModified()>time)
					{
						System.out.println(file);
					}
				}
			}, "\\w+\\.java").start(new String[] {"/home/liutao/fileOp"});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
