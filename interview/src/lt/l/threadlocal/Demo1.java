package lt.l.threadlocal;

public class Demo1 {
	public static void main(String[] args) {
		ThreadLocal<Integer> local=new ThreadLocal<>();
		local.set(100);
		local.remove();
		System.out.println(local.get());
		
		Class<?> class1=Demo1.class;
		int x=1,y=2;
		System.out.println(x+y);
	}

}
