package lt.l.threadlocal;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * thread线程和main线程都拥有一份local变量的副本  --> ThreadLocal<Interger>
 * @author liutao
 *
 */
public class Demo2 {
	
	//匿名内部类复写initialValue方法
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {  
        public Integer initialValue() {  
            return 0;  
        }  
    };  
	public static ThreadLocal<Integer> local=new ThreadLocal<>();
//	ThreadLocal<Integer> local2=new ThreadL
	public static void main(String[] args) throws Exception {
		Thread thread=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("1---- "+local.get());
				local.set(200);
				System.out.println("2---- "+local.get());
			}
		});
		local.set(1000);
		thread.start();
		thread.join();
		System.out.println("main:"+local.get());
	}
	/**
	 * java Map如何根据key修改value put(key,value)
	 */
	@Test
	public void fun1()
	{
		Map<Integer, String> map=new HashMap<>();
//		map.get("")
	}
}
