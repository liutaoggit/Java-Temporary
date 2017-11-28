package lt.b.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Override 是多态，由运行时实际类决定，所以调用的是B类的方法而不是A类的方法。 
Overload 是由编译器在编译时决定的，因为 ab 的声明类型为 A，所以会调用 show(A obj) 方法，编译类型一致。
 * @author liutao
 *
 */
public class OverLoadTest {
	public static void fun1(List list) {
		System.out.println("list--");
	}
	public static void fun1(LinkedList list)
	{
		System.out.println("linkedList--");
	}
	public static void main(String[] args) {
//		LinkedList list=new LinkedList();
//		fun1(list);
//		fun1(list);
//		fun1(new ArrayList());
		fun1(new LinkedList());
		
	}
}
