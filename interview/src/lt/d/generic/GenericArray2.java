package lt.d.generic;

import java.util.Arrays;

public class GenericArray2 <T>{
	private Object[] array;
	public GenericArray2(int size)
	{
		array=new Object[size];
	}
	public void put(int index,T item)
	{
		array[index]=item;
	}
	@SuppressWarnings("unchecked")
	public T[] rep()
	{
		return (T[]) array;
	}
	//由于泛型泛型信息擦除 Integer[] rep = array2.rep(); classCasrException
	//Object[]->Integer[]出错  
//	解决方案 两种
	//1 用Object[]接受
	//2 使用推荐的 Array.newInstance(kind,size)初始化泛型数组 +类型标签
	
	public static void main(String[] args) {
		GenericArray2<Integer> array2=new GenericArray2<Integer>(5);
		for(int i=0;i<5;i++)
		{
			array2.put(i, i);
		}
		Object[] a=array2.rep();
		System.out.println(Arrays.toString(a));
		
	}

}
