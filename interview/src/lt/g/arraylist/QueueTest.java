package lt.g.arraylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.id<o2.id?-1:(o1.id==o2.id?0:1);
			}
		});
		//		pq.add(new Student("s",1));
		pq.add(new Student("3",133));
		pq.add(new Student("2",2333));
		pq.add(new Student("1",333));
		System.out.println(pq);
		//		pq.add(new Student("2",4));//Queue要求元素必须实现Comparable接口或者传递comparator参数
		//		pq.addAll(Arrays.asList(11,33,12,45,2123));
		//		System.out.println(pq);

		//		Arrays.copyOf(original, newLength)
		//		底层用到了Arrays.newInstace和System.arrayCopy
		//		while(pq.peek()!=null)
		//		{
		//			//poll返回病移除队头元素
		//			//默认会排序
		//			System.out.print(pq.poll()+" ");
		//		}

	}
	@Test
	public void fun1()
	{
		Person[] persons= {new Person(1),new Person(2),new Person(3)};
		Person[] copyOf = Arrays.copyOf(persons, 5);
		//数组扩容
		System.out.println(Arrays.toString(copyOf));

	}
	@Test
	public void fun2()
	{
		Person[] persons= {new Person(1),new Person(2)};
		Person p=persons[0];
		persons[0]=new Person(3);
		System.out.println(p);
	}
}
