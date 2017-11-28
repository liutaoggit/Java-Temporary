package lt.j.dynamicproxy;

/**
 * 静态代理
 * 局限性：对每个要增强的目标类 都要有一个接口，且必须要写一个代理类
 * 而且其代码冗余性太高
 * 
 * @author liutao
 *
 */
public class StaticProxyTest {
	public static void main(String[] args) {
//		StaticProxy
		Vehicle vehicle=new ElectricCar();
		StaticProxy staticProxy=new StaticProxy(vehicle);
		staticProxy.drive();
	}
}
