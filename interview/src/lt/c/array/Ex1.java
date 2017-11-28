package lt.c.array;

import java.util.Arrays;

import org.junit.Test;

import lt.a.rtti.Dog;

public class Ex1 {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5};//动态初始化
		int arr1[]= {1,2,3};//定义时初始化 一条语句
	}
	@Test
	public void fun1()
	{
//		testArray(new Dog[] {new Dog(),new Dog(),new Dog()});
		Integer[] testArray1 = testArray1(5);
		System.out.println(Arrays.toString(testArray1));
	}
	public static void testArray(Dog[] dog)
	{
		System.out.println(Arrays.toString(dog));
	}
	public static Integer[] testArray1(int i)
	{
		Integer[] arr=new Integer[i];
		return arr;
	}
}

