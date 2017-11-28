package lt.d.generic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 泛型数组 推荐使用泛型补偿方式来产生，这样就能返回T[]
 * Array.newInstance(kind,size) +类型标签
 * @author liutao
 *
 * @param <T>
 */
public class ArrayMaker3 <T>{
	private Class<T> kind;

	public ArrayMaker3(Class<T> kind) {
		this.kind = kind;
	}
	@SuppressWarnings("unchecked")
	T[] create(int size)
	{
		return (T[]) Array.newInstance(kind, size);
	}
	public static void main(String[] args) {
		ArrayMaker3<String> arrayMaker3=new ArrayMaker3<String>(String.class);
		String[] stringArray=arrayMaker3.create(10);
		System.out.println(Arrays.toString(stringArray));
	}
	
}
