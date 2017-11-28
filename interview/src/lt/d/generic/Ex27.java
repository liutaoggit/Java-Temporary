package lt.d.generic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Ex27 {

	/**
	 * 容器使用通配符 ？ extends 基类不能调用任何含有参数类型的方法
	 * 但是可以调用参数类型为Object的方法  也可以调用返回值类型为基类的方法
	 */
	@Test
	public void fun1()
	{
		List<? extends Number> list=new ArrayList<Integer>();
		
//		list.add(1, null);
//		list.add(null);
//		list.get(0);
	}
}
