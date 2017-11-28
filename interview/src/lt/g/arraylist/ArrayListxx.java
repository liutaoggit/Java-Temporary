package lt.g.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class ArrayListxx {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();

		//增加
		arrayList.add(2);
		arrayList.add(0, 33);
		System.out.println(arrayList);

		List<Integer> c=new LinkedList<>();
		c.add(22);
		c.add(99);
		c.add(0);
		arrayList.addAll(c);
		System.out.println(arrayList);
		//删除
		Integer remove = arrayList.remove(1);
		System.out.println(remove);
		arrayList.remove(new Integer(22));
		System.out.println(arrayList);
		//修改

		Integer set = arrayList.set(2, 55);
		System.out.println(set+" "+arrayList);
		//查询
		arrayList.indexOf(new Integer(33));
		arrayList.lastIndexOf(new Integer(33));
		
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(new Integer(1),new Integer(2)));
	System.out.println("list"+list);
	}
	
	/**
	 * 迭代器
	 */
	@Test
	public void fun1()
	{
//		使用迭代器进行删除
		ArrayList<Integer> a=new ArrayList<>();
		Random rand=new Random(47);
		
		for(int i=0;i<10;i++)
		{
			int nextInt = rand.nextInt(100);
			a.add(nextInt);
		}
		System.out.println(a);
		
		for (Integer integer : a) {
			System.out.print(integer);
		}
		System.out.println();
		Iterator<Integer> it=a.iterator();
		Integer[] s = new Integer[10];
		a.toArray(s);
		System.out.println(s.length+" "+Arrays.toString(s));
//		while(it.hasNext())
//		{
//			//在迭代器中使用remove方法
//			System.out.print(it.next()+" ");
//			it.remove();
//		}
//		System.out.println(a);
	}
	@Test
	public void fun0()
	{
		Person p=new Person(1);
		Person p1=p;
		p1.i=10;
		
//		p=null;
		System.out.println(p1);
		System.out.println(p);
	}
}
class Person{
	int i;

	public Person(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Person [i=" + i + "]";
	}
	
}
