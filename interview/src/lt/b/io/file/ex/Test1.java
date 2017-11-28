package lt.b.io.file.ex;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

/**
 * 测试InputStream方法的mark和reset方法
 * 可以实现一个InputStream读多次的功能
 * @author liutao
 *
 */
public class Test1 {
	@Test
	public void fun1() throws IOException
	{
		//BufferInputstream默认长度4096*2
		InputStream inputStream=new BufferedInputStream(new ByteArrayInputStream("hello".getBytes()));
			inputStream.mark(2);//5代表mark以后可以读多少个字节数据  但是是在BufferedInputStream和readlimit两者之间取最大值
			int b=-1;//局部变量 不初始化 只能声明，不能使用
			while((b= inputStream.read())!=-1)
			{
				System.out.print((char)b);
			}
			System.out.println();
			inputStream.reset();
			while((b= inputStream.read())!=-1)
			{
				System.out.print((char)b);
			}
	}
	@Test
	public void fun2() throws IOException
	{
		//BufferInputstream默认长度4096*2
//		InputStream inputStream=new BufferedInputStream(new ByteArrayInputStream("hello".getBytes()));
		InputStream inputStream=new ByteArrayInputStream("hello".getBytes());
		inputStream.mark(5);//5代表mark以后可以读多少个字节数据  但是是在BufferedInputStream和readlimit两者之间取最大值
			int b=-1;//局部变量 不初始化 只能声明，不能使用
			while((b= inputStream.read())!=-1)
			{
				System.out.print((char)b);
			}
			System.out.println();
			inputStream.reset();
			while((b= inputStream.read())!=-1)
			{
				System.out.print((char)b);
			}
	}
	@Test
	public void fun3() throws IOException
	{
		//BufferInputstream默认长度4096*2
		InputStream inputStream=new BufferedInputStream(new ByteArrayInputStream("hello".getBytes()),2);
		inputStream.mark(1);//5代表mark以后可以读多少个字节数据  但是是在BufferedInputStream和readlimit两者之间取最大值
			int b=-1;//局部变量 不初始化 只能声明，不能使用
//			while((b= inputStream.read())!=-1)
//			{
//				System.out.print((char)b);
//			}
			System.out.println(inputStream.read());
			System.out.println(inputStream.read());
			System.out.println(inputStream.read());
			System.out.println(inputStream.read());
//			System.out.println();
			//当读取字节数超过readlimit和Buffer缓冲区 reset就会出错
			inputStream.reset();
//			System.out.println(inputStream.read());
//			System.out.println(inputStream.read());
//			System.out.println(inputStream.read());
//			while((b= inputStream.read())!=-1)
//			{
//				System.out.print((char)b);
//			}
	}
}
