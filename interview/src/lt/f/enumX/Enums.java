package lt.f.enumX;

import java.util.Random;

import org.junit.Test;

import lt.e.collections.Signal;

public class Enums {
	private static Random random=new Random(47);
	//将类型标签作为参数 就能得到T[] values数组了
	//否则就会由于泛型擦除，无法获得T[]
	public static <T extends Enum<T>> T random(Class<T> ec)
	{
		return random(ec.getEnumConstants());
	}
	public static <T> T random(T[] values)
	{
		return values[random.nextInt(values.length)];
	}
	@Test
	public void fun4()
	{
//		System.out.println("fun4");
		Size<Signal> size=new Size<Signal>();
		size.fun1();
	}
}
class Size<T extends Enum<T>>
{
//	T t=new Object();
	public void fun1()
	{
//		System.out.println(t.getClass());
//		Class <T> entityClass =getClass().getTypeParameters()
		
	}
}
