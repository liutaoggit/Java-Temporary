package lt.k.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * 原理 代理类继承Programmer类
 * 任何对代理方法的调用 都会回调hacker->MethodInterceptor类的Intercept()方法
 * @author liutao
 *
 */
public class Test {
	public static void main(String[] args) {
		Programmer progammer = new Programmer(); //目标类 
		Hacker hacker = new Hacker(); //
		//cglib 中加强器，用来创建动态代理  
        Enhancer enhancer = new Enhancer();
        //设置要创建动态代理的类  
        enhancer.setSuperclass(progammer.getClass());   
        enhancer.setCallback(hacker);  //回调
        Programmer proxy =(Programmer)enhancer.create();
        proxy.code();//任何对代理方法的调用 都会回调
		
	}
}
