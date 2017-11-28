package lt.c.array;

import java.util.Arrays;

import lt.a.rtti.Dog;

/**
 * 数组方法
 * Arrays.fill()
 * System.arraycopy()
 * @author liutao
 *
 */
public class CopyArrays {
public static void main(String[] args) {
	int[] arr=new int[5];
	Arrays.fill(arr, 1);
	System.out.println(Arrays.toString(arr));
	int[] arr1=new int[10];
	Arrays.fill(arr1, 2);
	System.arraycopy(arr, 0, arr1, 0, arr.length);
	System.out.println(Arrays.toString(arr1));

	Integer[] arr3=new Integer[5];
	Integer[] arr4=new Integer[10];//如果是容器的化就可以直接输出了
	Arrays.fill(arr3, new Integer(47));
	Arrays.fill(arr4,new Integer(100));
	
	System.arraycopy(arr3, 0, arr4, 3, 3);
	System.out.println(Arrays.toString(arr4));
	
	for(int i=0;i<arr3.length;i++)
		System.out.println(arr3[i].hashCode());
	Dog[] dogs=new Dog[5];
	Dog[] dogs1=new Dog[5];
	Arrays.fill(dogs, new Dog("aaa"));
	System.arraycopy(dogs, 0, dogs1, 0, dogs.length);
//	System.out.println(dogs[0].hashCode());
//	System.out.println(dogs[0].hashCode());
	dogs[0].setName("bb");
	System.out.println(Arrays.toString(dogs));
	System.out.println(Arrays.toString(dogs1));
}
}
