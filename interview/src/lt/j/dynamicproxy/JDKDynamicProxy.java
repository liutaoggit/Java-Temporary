package lt.j.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 原理：将所有的代理类的request交给InvocationHandler的invoke（proxy,method,args）方法来处理
 * invoke（）方法调用RealObject的相对应的方法来处理请求
 * 局限：该目标类（扩展类）必须有一个接口
 * @author liutao
 *
 */
public class JDKDynamicProxy implements InvocationHandler{

	private ElectricCar obj;
	
	public JDKDynamicProxy() {
		super();
	}

	public JDKDynamicProxy(ElectricCar obj) {
		super();
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("method:"+method.getName()+"before invoke()---");
		method.invoke(obj, null);//obj.method()  这里是反射执行该方法
		System.out.println("method:"+method.getName()+"---after invoke()");
		return null;
	}
	
}
