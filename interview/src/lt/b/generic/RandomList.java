package lt.b.generic;

import java.util.ArrayList;
import java.util.Random;

/**
 * 泛型类
 * @author liutao
 *
 * @param <T>
 */
/**
 * 使用类 里面包括一个List集合 add方法存储元素 select方法随机取元素
 * @author liutao
 *
 * @param <T>
 */
public class RandomList <T>{
	private ArrayList<T> storage=new ArrayList<T>();
	private Random rand=new Random(47);
	public void add(T item)
	{
		storage.add(item);
	}
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	public static void main(String[] args) {
//		RandomList<String> randomList=new RandomList<String>();
//		String s="hello world aaa bbb ccc";
//		for (String string : s.split(" ")) {
//			randomList.add(string);
//		}
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(randomList.select());
//		}
		
		
		RandomList<Integer> randomList=new RandomList<Integer>();
		for(int i=0;i<10;i++)
		randomList.add(i);
		for(int i=0;i<10;i++)
		{
			System.out.println(randomList.select());
		}
	}
	
}
