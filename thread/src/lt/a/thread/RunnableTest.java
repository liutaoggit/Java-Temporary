package lt.a.thread;

/**
 * 为什么要用Runnable接口创建线程
 * 因为java只允许但继承 
 * @author liutao
 *Thread getPriority() 获取线程优先级默认为5  不过编程中一般不用
 */
public class RunnableTest {
public static void main(String[] args) {
	Thread thread=new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getPriority()+" "+Thread.currentThread().getState()+" "+Thread.currentThread().isAlive());
			// TODO Auto-generated method stub
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("runnable Test");
		}
	});
//	boolean alive = thread.isAlive();
//	System.out.println("alive  "+alive);
	thread.start();
	try {
		thread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("main结束---");
}
}
