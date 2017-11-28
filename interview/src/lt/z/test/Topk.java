package lt.z.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

import javax.swing.text.html.HTMLDocument.HTMLReader;

public class Topk <E>{
	private int k;
	private PriorityQueue<E> p;
	private Comparator comparator;
	//	PriorityQueue aPriorityQueue=new 
	public Topk(int k, PriorityQueue<E> p) {
		this.k = k;
		this.p = p;
	}
	public Topk(int k, PriorityQueue<E> p,Comparator comparator) {
		this.k = k;
		this.p = p;
		this.comparator=comparator;
	}
	public void add(E e)
	{
		if(p.size()<k)
		{
			p.add(e);
			return ;
		}
		if (p.peek() instanceof Comparable) {
			Comparable<? super E> head = (Comparable<? super E>)p.peek();
			if(head.compareTo(e)>0)
				return;
		}else if(comparator!=null)
		{
			if(comparator.compare(e, p.peek())<0)
			{
			return;
			}
		};
		//		Comparable<? super E> head = (Comparable<? super E>)p.peek();

		//小于栈顶元素 直接退出
		//		if(head.compareTo(e)>0)
		//			return;
		//新元素替换掉原来最小的元素 成为栈顶元素
		p.poll();
		p.add(e);
	}
	public void addAll(Collection<? extends E> c)
	{
		for (E e : c) {
			p.add(e);
		}
	}
	public <T>T[] toArray(T[] a)
	{
		return p.toArray(a);
	}
	public E getKth()
	{
		return p.peek();
	}
}
