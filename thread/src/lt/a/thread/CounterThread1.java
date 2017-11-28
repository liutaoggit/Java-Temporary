package lt.a.thread;
public class CounterThread1 extends Thread {
    Counter counter;
Object object=new Object();
    public CounterThread1(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 10));
        } catch (InterruptedException e) {
        }
        counter.incr();
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 100;
        Counter counter = new Counter();
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThread1(counter);
            threads[i].start();
        }
        for (int i = 0; i < num; i++) {
            threads[i].join();
        }
        System.out.println(counter.getCount());
    }
}
 class Counter {
    private int count;
Object object=new Object();
    public  void incr(){
    	count++;
//    	synchronized(object) {
//        count ++;}
    }
    
    public synchronized int getCount() {
        return count;
    }
}