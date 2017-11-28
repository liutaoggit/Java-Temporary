package lt.g.arraylist;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListxxx {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		Random random=new Random(47);
		//LinkedList不可以随机访问 	不能按索引方式查询，可以从头尾查找
		//在两端查找，删除，效率很高
		//在中间查找，删除 查找效率低，但是删除，插入效率高
		
		//LinkedList实现Stack功能 
		for(int i=0;i<10;i++)
		{
			list.push(random.nextInt(100));
		}
		while(list.peek()!=null)
		{
			System.out.print(list.pop()+" ");
		}
		//LinkedList实现Queue的6个功能
//		add,offer,element,peek,remove,poll
//		LinkedList实现Deque的8个方法 主要是xxFirst,xxLast
		
//		LinkList内部实现是使用了一个Node<E>节点
	}
}
