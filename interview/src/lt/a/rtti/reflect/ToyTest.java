package lt.a.rtti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ToyTest{
public static void main(String[] args) {
	Class<?> toy=Toy.class;
	try {
		
		Constructor<?> constructor = toy.getConstructor(int.class);
		try {
			Object newInstance = constructor.newInstance(10);
			System.out.println(newInstance);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (NoSuchMethodException | SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
class Toy{
	public Toy() {
		// TODO Auto-generated constructor stub
	}
	public Toy(int i) {
		System.out.println("非默认的构造器	"+i);
	}
}