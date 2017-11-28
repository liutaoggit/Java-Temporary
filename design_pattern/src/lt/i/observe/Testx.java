package lt.i.observe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

import lt.c.decorate.Person;

public class Testx {
	public static void main(String[] args) {
		String s="12345";
		String s1="12345";
		Person p1=new Person();
		Person p2=new Person();
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}
	
	/**
	 * 使用迭代器尽然能突破无限定通配符的限制  。。可怕
	 */
	@Test
	public void fun1()
	{
		List<String> list=new ArrayList<>(Arrays.asList("aaa","bbb","ccc"));
//		Object[] array = list.toArray();
//		System.out.println(array[0].getClass());
//		arrar.
//		List<String> list2=new ArrayList<>();
//		list2.add(array[0]);
		funx(list);
		System.out.println(list);
	}
	public void funx(List<?> list)
	{
//		list.add(new Object());
//		list.add(new Integer(1));
//		Object[] array = list.toArray();
//		while()
//		Iterator<?> iterator = list.iterator();
//		iterator
		ListIterator it=list.listIterator();
		while(it.hasNext())
		{
//			it.set(new Integer(1));
//			it.add(new String("a"));
//			it.add
			it.add(new Person());
			it.next();
		}
	}
	@Test
	public void fun3()
	{
		List<Integer> asList = Arrays.asList(new Integer(1),new Integer(2));
		asList.add(4);
		System.out.println(asList);
	}
}
