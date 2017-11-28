package lt.c.array;

import java.util.Arrays;

import org.junit.Test;

public class Ex20 {
	@Test
	public void fun1()
	{
		int[][] a= {{1,2,3},{2,3,4}};
		int[][] b= {{1,2,3},{2,3,4}};
		System.out.println(Arrays.deepEquals(a, b));
	}
}
