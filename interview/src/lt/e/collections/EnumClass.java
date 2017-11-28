package lt.e.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

public class EnumClass {
	public static void main(String[] args) {
		for(Shrubbery s:Shrubbery.values())
		{
			System.out.println(s+"ordinal:"+s.ordinal());
			System.out.println(s.compareTo(Shrubbery.CRAWLING));
			System.out.println(s.equals(Shrubbery.CRAWLING));
			System.out.println(s==Shrubbery.CRAWLING);
			System.out.println(s.getDeclaringClass());
			System.out.println(s.name());
			System.out.println("----------");
		}
	}
	@Test
	public void fun1()
	{
		//		OSExecute
		B b=new B();
		b.fun(b);

	}
	@Test
	public void fun2() throws FileNotFoundException
	{
		InputStream in=new FileInputStream("/home/liutao/fileOp/Mutt.java");
		System.out.println(in.getClass());
	
	}
}
enum Shrubbery{
	GROUND,CRAWLING,HANGLING
}
class A<T extends A<T>>
{void fun(T t){}}
class B extends A<B>
{}
class C implements Comparable<C>{

	@Override
	public int compareTo(C o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
