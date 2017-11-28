package lt.f.enumX;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

enum Explore{
	HERE,THERE
}
public class Reflection_1 {
	public static Set<String> analyze(Class<?> enumClass)
	{
		System.out.println("enumClass---"+enumClass);
		System.out.println("Interface---"+Arrays.toString(enumClass.getInterfaces()));
		System.out.println("SuperClass---"+enumClass.getSuperclass());

		Set<String> methods=new TreeSet<String>();
		for (Method method : enumClass.getMethods()) {
			methods.add(method.getName());
		}
		return methods;

	}
//	Explore  继承自Enum
	public static void main(String[] args) {
		Set<String> analyze = analyze(Explore.class);
//		System.out.println(analyze);
////		  返回带指定名称的指定枚举类型的枚举常量
//		Explore valueOf = Explore.valueOf("HERE");
		//根据枚举的名称返回枚举常亮  final Explore
//		System.out.println(valueOf);
		
//		注意values()和values(String)是编译器为Explore添加的静态方法
		Set<String> analyze1 = analyze(Enum.class);
//		System.out.println(analyze);
		boolean containsAll = analyze.containsAll(analyze1);
		System.out.println(containsAll);
		boolean removeAll = analyze.removeAll(analyze1);
		System.out.println(analyze);
		}
}
