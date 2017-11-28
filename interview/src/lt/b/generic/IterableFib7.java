package lt.b.generic;

import java.util.Iterator;

public class IterableFib7 implements Generator<Integer>,Iterable<Integer>{

	//n 为fib数
	private int n;
	
	private int count=0;
	
	public IterableFib7(int n) {
		this.n = n;
	}
	
	public IterableFib7() {
	}
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				return n>0;
			}

			@Override
			public Integer next() {
				n--;
				return IterableFib7.this.next();
			}
		};
	}
	public Integer next() {
		return fib(count++);
	}
	private int fib(int n)
	{
		if(n<2)return 1;
		return fib(n-2)+fib(n-1);
	}
	public static void main(String[] args) {
		IterableFib7 iterableFib7=new IterableFib7();
		for(int i=0;i<18;i++)
		{
			System.out.print (iterableFib7.next()+" ");
		}
		Iterator it=new IterableFib7(20).iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
