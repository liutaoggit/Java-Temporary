package lt.c.array;

import org.junit.Test;

public class Ex11 {
	//	@Test
	//	
	//	public void fun1()
	//	{
	//		Integer[] arr= {new Integer(1),new Integer(2)};
	////		int arr2=arr;
	//	}
	@Test
	public void fun2()
	{
		A<String> sA=new A<String>();
		//		String string = sA.get();
		//		不能用String来接受 只能用Object来接受 
		//		或者就用类型标签来实现
//		System.out.println(string);
	}
}
class A<T>
{
	public T get()
	{
		return (T) new Object();
	}
}
