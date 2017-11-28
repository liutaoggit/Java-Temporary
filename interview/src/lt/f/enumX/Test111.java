package lt.f.enumX;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class Test111<E> {
//	public void fun1(ArrayList<? extends E> n,T e)
//	{
//		n.add(e);
////		n.set
//	}
	public <T extends E> void fun2(ArrayList<T> n,T e)
	{
		n.add(e);
//		n.get
	}
	static <E> E fun3(E obj)
	{
		Object object=new String("123");
		return (E)object;
	}
	
	
	//toArray用的就是这原理
	 <E> E[] fun4(E obj)
	{
		Object[] object= {new String("123")};
		Class<? extends Object> class1 = obj.getClass();
		Object newInstance = Array.newInstance(class1, 10);
//		Arrays.copyOf(, newLength)
		System.arraycopy(object, 0, newInstance, 0, 1);
		return (E[])newInstance;
	}
//	static <E> E[] fun4(E obj)
//	{
//		String[] object= {new String("123")};
//		Class<? extends Object> class1 = obj.getClass();
////		Object newInstance = Array.newInstance(class1, 10);
////		Arrays.copyOf(, newLength)
//		return (E[])obj;
//	}
	public static void main(String[] args) {
		Test111<Integer> sTest111=new Test111<>();
//		sTest111.fun2(new ArrayList<Integer>(), 1);
//		System.out.println("hello world");
////		sTest111.fun3();
//		String fun3 = fun3(new String("123456"));
//		System.out.println(fun3);
		String[] fun4 = sTest111.fun4(new String());
		System.out.println(Arrays.toString(fun4));
//		String[] fun4 = fun4(new String());
//		System.out.println(fun4);
	}
	@Test
	public void fun1()
	{
		String string="10";
		int parseInt = Integer.parseInt(string);
		int i=100;
		
//		int->String
//		string.valueOf(b)
//		i+"";产生两个String对象
		
//		String->int
//		Integer.parseInt(s)
//		Integer.valueOf()  String->integer
//		Integer.valueOf(i).intValue();
//		string.valueOf(i);
	}
}
