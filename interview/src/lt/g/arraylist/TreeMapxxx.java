package lt.g.arraylist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Map.Entry;
import java.util.SortedMap;

import org.junit.Test;

import java.util.TreeMap;

public class TreeMapxxx {

	public static void main(String[] args) {
		//		TreeMap<String, String> map=new TreeMap<>();
		//		map.put("a", "aaa");
		//		map.put("d", "ddd");
		//		map.put("b", "bbb");
		//		map.put("b", "bbb");
		//		map.put("w", "www");
		//		for (Entry<String, String> string : map.entrySet()) {
		//			System.out.println(string.getKey()+string.getValue());
		//		}

		//键必须实现Comparable接口
		//		TreeMap<Person, String> person1=new TreeMap<>();
		//		person1.put(new Person(1), "1");
		//		System.out.println(person1);

		//		TreeMap<String, String> map2=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		//		TreeMap<String, String> map2=new TreeMap<>(new Comparator<String>() {
		//
		//			@Override
		//			public int compare(String o1, String o2) {
		//				return o2.compareTo(o1);
		//			}
		//		});
		//		TreeMap<String, String> map2=new TreeMap<>(Collections.reverseOrder());

		//		逆序且忽略大小写

		//由于比较器忽略大小写 在存入ccc ,CCC时，两者的compareTo相等，所以只存一份
		TreeMap<String, String> map2=new TreeMap<>(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		map2.put("aaa", "aa");
		map2.put("CCC", "ccc");
		map2.put("sss", "sss");
		map2.put("bbb", "bbb");
		map2.put("ccc", "ccc");
		//		System.out.println(map2.toString());
		//		for (Entry<String, String> string : map2.entrySet()) {
		//		System.out.println(string.getKey()+" "+string.getValue());
		//		string.setValue("pppp");
		//	}
		System.out.println(map2);
	}
	@Test
	public void fun1()
	{
		//		List<String> list=new ArrayList<>();
		//		list.add("asd");
		//		list.add("ccc");
		//		for (String string : list) {
		//			string+="asd";
		//			System.out.println(string);
		//		}
		//		System.out.println(list);
		//		Integer[] integers= {new Integer(1),new Integer(2)};
		//		for (Integer integer : integers) {
		//			integer=10;
		//		}
		// for可以给集合或者数组的元素赋值，但是不能更改引用  会不起作用
		// for 修改数组不起作用
		//		for(int i=0;i<integers.length;i++)
		//			integers[i]=10;
		//		System.out.println(Arrays.toString(integers));
		Person[] persons= {new Person(1),new Person(2)};
		for (Person person : persons) {
			//			person=new Person(3);
			person.i=1000;
		}
		//for循环 只能读取，不能修改基本数据类型值 或者引用，可以给对象的属性赋值
		List<Person> persons2=new ArrayList<>(Arrays.asList(persons));
		for (Person person : persons2) {
			person.i=99;
		}

		System.out.println(persons2);
	}

	@Test
	public void fun2()
	{
		TreeMap<String, String> map=new TreeMap<>(new Comparator<String>() {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			@Override
			public int compare(String o1, String o2) {
				try {
					return sdf.parse(o1).compareTo(sdf.parse(o2));
				} catch (ParseException e) {
					throw new RuntimeException();
				}
			}
		});
		map.put("2012-12-6", "aaa");
		map.put("2012-12-10", "aaa");
		map.put("2012-12-03", "aaa");
		System.out.println(map);
		//		03--->03  1-->01  10--->10
	}


	@Test
	public void fun3()
	{
		Map<Person, String> map=new TreeMap<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return 1;
			}
		});
		map.put(new Person(3), "ccc");
		map.put(new Person(2), "vvv");
		System.out.println(map);

	}
	@Test
	public void fun11()
	{
		String string="111";
		String string2="222";
		int compareTo = string.compareTo(string2);
		System.out.println(compareTo);
	}
	@Test
	public void fun00()
	{
		Person person=new Person(1);
	}
	@Test
	public void fun13()
	{
		Person person=new Person(10);
		Person sPerson=new Person(20);
		person.i=sPerson.i;
		person=sPerson;
		System.out.println(person);
	}
	
	@Test
	public void fun14()
	{
		TreeMap<String, String> map=new TreeMap<>();
		map.put("111", "aaa");
		map.put("222", "ccc");
		map.put("333", "vvv");
//		SortedMap<String, String> subMap = map.subMap("111", "333");
		NavigableMap<String, String> descendingMap = map.descendingMap();
		//返回一个视图
		System.out.println(descendingMap);//逆序
	}
	@Test
	public void fun15()
	{
//		我懂了 这个Entry类是静态内部类。。。。。key/value只有一份
//		没有这两句代码    key/value值没变
//		TreeMap treeMap=new TreeMap();
		Inner inner=new Inner();
		inner.id=100;
		Inner inner2=new Inner();
		inner2.id=100000;
		inner2=inner;
		System.out.println(inner2.id);
	}
	 final static class Inner{
		int id;
	}
}
