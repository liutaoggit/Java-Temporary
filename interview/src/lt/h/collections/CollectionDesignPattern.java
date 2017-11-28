package lt.h.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import org.junit.Test;

public class CollectionDesignPattern {
	/**
	 * 适配器
	 * 空对象
	 */
	@Test
	public void fun1()
	{
		List<Object> emptyList = Collections.emptyList();
		System.out.println(emptyList);
		//		Arrays.asList();
	}
	/**
	 * 适配器
	 * 单一对象
	 * singleton
	 */
	@Test
	public void fun2()
	{
		Set<String> singleton = Collections.singleton("zhangsan");
		List<String> singletonList = Collections.singletonList("lisi");
		Map<Integer, String> singletonMap = Collections.singletonMap(1, "z");
		for (String string : singletonList) {
			System.out.println(string);
		}
		//		singleton.add("ccc");
	}
	/**
	 * Collections.unmodifiableCollection防止外部方法对容器进行就该
	 * 
	 * 确保容器只读　	
	 */
	@Test
	public void fun3()
	{
		List<String> list = new ArrayList<>(Arrays.asList(
				new String[]{"a", "b", "c", "d"}));
		thirdMethod(Collections.unmodifiableCollection(list));
//		Collections.unmodifiableCollection(c)
	}
	public static void thirdMethod(Collection <String> c){
		c.add("bad");
	}
	/**
	 * Collections的装饰器确保类型安全
	 * 
	 * 很少用
	 * 在jdk1.5之前用的到
	 * 原理Class<T> isInstanceof(obj)
	 */
	@Test
	public void fun4()
	{
//		List list = new ArrayList<Integer>();
//		list.add("hello");
//		System.out.println(list);
		List list = new ArrayList<Integer>();
		list = Collections.checkedList(list, Integer.class);
		list.add("hello");
	}
	@Test
	public void fun5()
	{
		Set<String> set=new HashSet<>();
//		set.add	
	}
	/**
	 * 装饰器返回一个线程安全的容器接口
	 * 目前用更好的替代方式解决该问题
	 */
//	PriorityQueue默认是最小堆
	//传递一个Compatator构建一个最大堆
	@Test
	public void fun6()
	{
//		PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
////				return o1<o2?-1:(o1==o2?0:1);
//				return o1<o2?1:(o1==o2?0:-1);
//			}
//		});
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Comparator.reverseOrder());
		priorityQueue.addAll(Arrays.asList(3,4,14,2,6));
		
		while(priorityQueue.peek()!=null)
		{
			System.out.println(priorityQueue.poll());
		}
//		for (Integer integer : priorityQueue) {
//			System.out.println(integer);
//		}
//		System.out.println(priorityQueue.);
	}
}
