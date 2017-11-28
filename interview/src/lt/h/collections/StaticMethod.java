package lt.h.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class StaticMethod {
	@Test
	public void fun1()
	{
		//		List<Integer> list=new ArrayList<>(Arrays.asList(new Integer[]{
		//		        35, 24, 13, 12, 8, 7, 1
		//		}));

		List<Integer> list=new ArrayList<>(Arrays.asList(
				35, 24, 13, 12, 8, 7, 1
				));
		//		List<Integer> list=new ArrayList<>(Arrays.asList(
		//		        35, 24, 13, 12, 8, 7, 1
		//		));
		//		int binarySearch = Collections.binarySearch(list, 3);
		//		System.out.println(binarySearch);
		//二分法查找　要求集合必须有序
		int binarySearch2 = Collections.binarySearch(list,1,Collections.reverseOrder());
		System.out.println(binarySearch2);

		//		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{
		//		        35, 24, 13, 12, 8, 7, 1
		//		}));
		//		System.out.println(Collections.binarySearch(list, 7, Collections.reverseOrder()));
	}
	@Test
	public void fun2()
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(
				35, 24, 13, 12, 8, 7, 1
				));
		Integer max = Collections.max(list);
		System.out.println(max);
	}
	/**
	 * frequency查找元素出现次数
	 */
	@Test
	public void fun3()
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(
				35, 24, 13, 12, 8, 7, 1,1,2,2,1,1
				));
		int frequency = Collections.frequency(list, 1);

		int indexOfSubList = Collections.indexOfSubList(list, Arrays.asList(13,12));
		System.out.println(frequency);
		System.out.println(indexOfSubList);
		//		Object object=1;
	}
	/**
	 * disjoint判断两个集合是否有相同元素
	 */
	@Test
	public void fun4()
	{
		boolean disjoint = Collections.disjoint(Arrays.asList(1,2), Arrays.asList(22,22));
		System.out.println(disjoint);
	}
	/**
	 * replaceAll
	 */
	@Test
	public void fun5()
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(
				35, 24, 13, 12, 8, 7, 1,1,2,2,1,1
				));
		boolean replaceAll = Collections.replaceAll(list, 1, 3333);
		System.out.println(list+" "+replaceAll);
	}
	@Test
	public void fun6()
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(
				35, 24, 13, 12, 8, 7, 1,1,2,2,1,1
				));
		Collections.sort(list);
		System.out.println(list);
	}
	/**
	 * swap和reverse方法
	 */
	@Test
	public void fun7()
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(
				35, 24, 13,1
				));
		Collections.swap(list, 0, 3);
		System.out.println(list.toString());
		
		Collections.reverse(list);
		System.out.println(list);
	}
	/**
	 * shuffle
	 * rotate
	 */
	@Test
	public void fun8()
	{
		List<Integer> list=new ArrayList<>(Arrays.asList(
				35, 24, 13,1
				));
//		Collections.shuffle(list);
//		System.out.println(list);
		Collections.rotate(list, 2);
		System.out.println(list);
	}
	/**
	 * addAll
	 * fill
	 */
	@Test
	public void fun9()
	{
		List<String> list=new ArrayList<>();
		list.add("z");
		list.add("c");
//		Collections.addAll(list, "aaa","bbb","ccc");
//		System.out.println(list);
		Collections.fill(list, "aaa");
		System.out.println(list);
	}
	/**
	 * copy
	 * 拷贝的前提是list已开辟空间
	 */
	@Test
	public void fun10()
	{
		List<String> list=new ArrayList<>();
		list.add(null);
		list.add(null);
		List<String> list2=new ArrayList<>();
		list2.add("ccc");
		list2.add("bbb");
		Collections.copy(list, list2);
		System.out.println(list);
	}
}
