package lt.g.arraylist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	//Set15个方法
public static void main(String[] args) {
	Set<Number> set=new HashSet<>();
	set.add(1);//1
	set.add(2);
	set.add(3);
	set.remove(1);//自动拆装箱 Number类及其子类都具备自动拆装箱 2
	set.clear();//3
	set.addAll(Arrays.asList(1,2,3,4));//4
	Iterator<Number> iterator = set.iterator();//5
	while(iterator.hasNext())
	{
		Number next = iterator.next();
		System.out.println(next);
	}
//	set.size() set.isEmpty set.hashCode set.equals//9
	boolean contains = set.contains(2);
	System.out.println(contains);//10
	//containsAll
	//removeAll
	//retainllAll//13
	Object[] array = set.toArray();
	System.out.println(array);
	Integer[] array2 = set.toArray(new Integer[0]);//这个功能和toArray差不多，原理上用到了反射技术
	System.out.println(Arrays.toString(array2));
	
}
}
