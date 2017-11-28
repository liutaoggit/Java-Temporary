package lt.a.rtti.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyHandler implements InvocationHandler{

	private Object proxied;
	public static int num=0;
	public  DynamicProxyHandler(Object proxied) {
		// TODO Auto-generated constructor stub
		this.proxied=proxied;
	}
	/**
	 *  proxy:　　指代我们所代理的那个真实对象   没有用
		method:　　指代的是我们所要调用真实对象的某个方法的Method对象
		args:　　指代的是调用真实对象某个方法时接受的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
//		System.out.println("proxy: "+proxy+proxy.getClass()+" method:"+method+"args:"+args);
	System.out.println(method+"	"+args+"	"+proxy.getClass());
		num++;
		return method.invoke(proxied, args);
	}
}
class SimpleDynamicProxy{
	public static void consumer(Iface iface)
	{
		iface.doSomething();
		iface.someThingElse("动态代理");
	}
	public static void main(String[] args) {
		RealObject real=new RealObject();
		consumer(real);
		Iface iface=(Iface) Proxy.newProxyInstance(Iface.class.getClassLoader()//
				, new Class[] {Iface.class},new DynamicProxyHandler(real));
		consumer(iface);
		System.out.println("方法调用的次数："+DynamicProxyHandler.num);
	}
}
interface Iface{
	void doSomething();
	void someThingElse(String arg);
}
class RealObject implements Iface{
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("doSomething");
	}

	@Override
	public void someThingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("someThingElse");
	}
	
}
