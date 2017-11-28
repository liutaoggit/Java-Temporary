package lt.j.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Proxy.newProxyInstance原理 根据传入的参数
 * 按照.class的结构 生成字节码文件 该文件实现了的代码和静态代理代码几乎一样，实现了一样的功能
 * 根据字节码文件 -->Class对象->newInstance创建实例
 * @author liutao
 *
 */
public class JDKDynamicProxyTest {
	public static void main(String[] args) {
		ElectricCar car=new ElectricCar();
		Vehicle vehicle=(Vehicle) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(),new JDKDynamicProxy(car));
		vehicle.drive();
	}
}
