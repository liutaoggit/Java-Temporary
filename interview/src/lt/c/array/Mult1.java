package lt.c.array;

import java.util.Arrays;

import org.junit.Test;

public class Mult1 {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(a));
	}

	@Test
	public void fun1()
	{
		
	}
	public double[][] getTwoDoubleArray(int x,int y,double min,double max)
	{
		double[][] d=new double[x][y];
		double increment = (max-min)/(x * y);
		double start=min;
		for(int i=0;i<x;i++)
		for(int j=0;j<y;j++)
		{
			d[i][j]=start;
			start+=increment;
		}
		return d;
	}
}
