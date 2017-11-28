package lt.a.rtti.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lt.a.rtti.Cat;
import lt.a.rtti.Cymric;
import lt.a.rtti.Dog;
import lt.a.rtti.Manx;
import lt.a.rtti.Mutt;
import lt.a.rtti.Pet;
import lt.a.rtti.Pug;
import lt.a.rtti.Rat;
import lt.a.rtti.Rodent;

public class LiteralPetCreator {
	//unmodifiableList（<? extends A>）简单理解就是对一个集合数组进行包装　此数组都的所有参数类型都是集成子Pet
	public static final java.util.List<Class<? extends Pet>> allTypes=Collections//
			.unmodifiableList(Arrays//
					.asList(Pet.class,Dog.class,Cat.class,Cymric.class,Manx.class,Mutt.class,//
							Pug.class,Rat.class,Rodent.class));

	private static final List<Class<? extends Pet>>  types=allTypes;
	public List<Class<? extends Pet>> types(){return types;}
	static String s1=fun1();
	static {
		//	／／静态代码快　是么时候会加载
		//	／／forName() 使用构造函数
		//使用.class不加载staitc成员和代码块

		System.out.println("静态代码块加载");
	}
	static String fun1()
	{
		System.out.println("fun1");
		return "fun1";}
	public static void main(String[] args) throws ClassNotFoundException {
		//	System.out.println(types);
			Class.forName("lt.a.rtti.test.LiteralPetCreator");

	}
}
