package lt.a.rtti;import javax.security.auth.kerberos.KerberosKey;

import org.omg.IOP.Codec;

public class ClassInitialization {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Class forName = Class.forName("lt.a.rtti.A");
//		System.out.println(forName);
//		Class aClass=A.class;
//		aClass.j;
//		int j=A.j;
//		System.out.println(j);
//		String fun2 = A.fun2();
//		Class<A> aClass=A.class;
//		A newInstance = aClass.newInstance();
//		Class<? super A> superclass = aClass.getSuperclass();
		A a=new A();
//		static 成员-》static 变量-》static Code 非static gouzao函数
	}
}
class A{
	static int i=10;
	public static final int j=0;
	static {
		System.out.println(i);
	}
	{
		System.out.println("instance");
	}
	private static String string=fun2();
	A(){
		System.out.println("constructor");
	
	}
	static void fun1()
	{
		System.out.println(i);
	}
	static String fun2()
	{
		System.out.println("fun2");
		return "123";
	}
}
