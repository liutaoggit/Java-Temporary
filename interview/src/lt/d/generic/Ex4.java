package lt.d.generic;

import org.junit.Test;

/**
 * 由于泛型擦除
 * 不能使用new T（）
 * new T[]
 * instance of
 *转型  T[]->Object[] T[]->Integer[]
 * @author liutao
 *
 */
public class Ex4 {
	@Test
	public void fun1()
	{
		Dog dog=new Dog();
		if(dog instanceof Dog)
		{
			System.out.println("aa");
		}
		/**
		 * 动态instanceof
		 */
//		Pet pet=new Pet();
		boolean instance = Dog.class.isInstance(dog);
		System.out.println(instance);
	}
}
class Pet{}
class Dog extends Pet{}