package lt.a.rtti.reflect;

import java.lang.reflect.Field;

public class TestPrivateFields {
	public static void main(String[] args) throws Exception {
		Class<?> aClass=A.class;
//		Field field = aClass.getField("string");
		Field field=aClass.getDeclaredField("string");
//		field.setAccessible(true);
		System.out.println(field);
		A a=(A) aClass.newInstance();
//		A a=new A();
		field.set(a, "protected string");
		
		System.out.println(field.get(a));
		
		System.out.println("----------------------");
		Field field2=aClass.getDeclaredField("num");
		//如果要通过反射获取private值 必须要设置访问权限
		field2.setAccessible(true);
		field2.set(a, 22);
		System.out.println(field2.get(a));
		System.out.println(a);
		System.out.println(field2.get(a));
		
	}
}
class A{
	private int i=1;
	protected String string="hello world";
	private final int num=0;
	@Override
	public String toString() {
		return "A [i=" + i + ", string=" + string + ", num=" + num + "]";
	}
	
}