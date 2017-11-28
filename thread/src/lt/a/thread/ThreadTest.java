package lt.a.thread;

/**
 * 多线程
 * 多个程序同事执行，客户不用关心CPU内部执行
 * @author liutao
 *
 */
public class ThreadTest {
	public static void main(String[] args) {
		HelloThread thread=new HelloThread();
		thread.start();
//		System.out.println("main:"+Thread.currentThread());
		
//		thread.start();
//		thread.run();
		
//		调用run()和start()区别
//		run()方法是在main线程中运行
//		start()表示的是开辟一个单独的执行流
	}
}
class HelloThread extends Thread{
	@Override
	public void run() {
		System.out.println(getId()+" "+getName()+" currentThread: "+Thread.currentThread().getId());
		System.out.println("hello world");
	}
}