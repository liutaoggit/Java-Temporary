package lt.d.generic;
import static lt.e.collections.Signal.*;
import java.util.ArrayList;

import org.junit.Test;

import lt.e.collections.Signal;

public class Test1 {
	/**
	 * 基本数据类型的包装类是不能使用newInstance来初始化的
	 */
	@Test
	public void fun1()
	{
		Class aClass=Integer.class;
	}
	@Test
	public void fun2()
	{
		ArrayList<String> list=new ArrayList<String>();
	}
	@Test
	public void fun3()
	{
//		YELLOW
	}
}
