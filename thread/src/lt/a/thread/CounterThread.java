package lt.a.thread;

public class CounterThread extends Thread{
	public static int counter=0;
	@Override
	public void run() {
		for(int i=0;i<1000;i++)
			increment();
//			synchronized () {
//				counter++;
//			}
			
	}
	public synchronized void increment()
	{
		synchronized (CounterThread.class) {
			counter++;
		}
		
	}
	public static void main(String[] args) {
		int num=1000;
		Thread[] threads=new Thread[num];
		for(int i=0;i<1000;i++)
		{
			threads[i]=new CounterThread();
			threads[i].start();
//			thread.start();
		}
		
		for(int i=0;i<1000;i++)
		{
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(counter);
	}

}
