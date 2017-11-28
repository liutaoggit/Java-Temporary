package lt.d.generic;

import org.junit.Test;

public class Ex26 {
	//运行时异常 实际中更本不用捕获
	//如果捕获 不向上抛的化会继续向下运行
	@Test
	public void fun1()
	{
		Number[] numbers=new Integer[10];
		try {
			numbers[0]=1F;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		System.out.println("hello world");
//		numbers[1]=1.1F;
	}
}
