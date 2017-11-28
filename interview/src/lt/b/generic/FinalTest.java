package lt.b.generic;

public class FinalTest {
	public static void main(String[] args) {
		B b=new B();
		b.fun1();
	}
}
/**
 * final修饰字段 不可修改
 * final修饰方法 此方法不可被派生类方法覆盖重写
 * @author liutao
 *
 */
abstract class A{
	public final int num=0;
	final int key=1;
	public final  void funx() {}
}
class B extends A{
	public  void fun1()
	{
		System.out.println(num);
		System.out.println(key);
	}
//	public void funx() {}
}