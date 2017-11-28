package hello;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class WildCard {
	@Test
	public void fun1()
	{
		Plate<Apple> plate=new Plate<Apple>(new Apple());
//		Plate<Fruit> plate2=new Plate<Apple>(new Apple());
	}
	
	@Test
	public void fun2()
	{
		Plate<? extends Fruit> plate=new Plate<Apple>(new Apple());
		Plate<? super Fruit> plate2=new Plate<Food>(new Food());
//		Plate<? ex Fruit> plate2=new Plate<Food>(new Food());
	}
	@Test
	public void fun3()
	{
		Plate<? extends Fruit> plate=new Plate<Apple>(new Apple());
		//上界通配符 只能取，不能放， 其实例化的基类也不行
		//且取出的东西只能用声明时的基类接受
		Fruit fruit=plate.get();
		Object object=plate.get();
//		Apple apple=plate.get();
	}
	@Test
	public void fun41()
	{
		List<?> list=new ArrayList<String>();
		list.add(null);
//		list.add("asd");
	}
	/**
	 * 霞姐 存入没有限制了
	 * 但是取出来的必须要用Object类型接受
	 */
	@Test
	public void fun4()
	{
		Plate<? super Fruit> p=new Plate<Fruit>(new Fruit());
		p.set(new Apple());
		Object fruit = p.get();
		System.out.println(fruit);
	}
}
class Food{}
class Fruit extends Food{}
class Meat extends Food{}	
class Apple extends Fruit{}
class Banana extends Fruit{}
class Pork extends Meat{}
class Beef extends Meat{}
class RedApple extends Apple{}
class GreenApple extends Apple{}
class Plate<T>{
	T value;

	public Plate(T value) {
		this.value = value;
	}

	public T get() {
		return value;
	}

	public void set(T value) {
		this.value = value;
	}
	
}