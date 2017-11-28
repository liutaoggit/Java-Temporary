package lt.c.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.Test;

public class Ex22 {
	@Test
	public void fun1()
	{
		Random rand=new Random();
		Integer[] a=new Integer[10];
		for(int i=0;i<10;i++)
		{
			a[i]=rand.nextInt(47);
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		//Arrays.binarySearch（）找到的话返回值大于等于0
		//没找到 =-插入值-1
		int binarySearch = Arrays.binarySearch(a, 6);
		System.out.println(binarySearch);
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
	}
}
