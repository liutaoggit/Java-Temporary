package lt.g.arraylist;

import java.util.Arrays;

public class ToArrayTest {
	static<T> T toArray(T[] t)
	{
		
		Class<?> componentType = t.getClass().getComponentType();
		System.out.println(componentType);
		System.out.println(t.getClass());
		return null;
		
	}
	static<T> T toArray(T t)
	{
		
//		Class<?> componentType = t.getClass().getComponentType();
//		System.out.println(componentType);
		System.out.println(t.getClass());
		return null;
		
	}
public static void main(String[] args) {
	//得到数组的具体类型
	toArray(new Integer[0]);
	toArray(new String());
//	Arrays.copy
}
}
