package lt.b.generic;

public class LinkedStack<T>{
	private class Node{
		T item;//当然不能是静态的 静态类无法访问非静态成员变量
		Node next;//指向下一个节点
		public Node(T item,Node next) {
			this.item=item;
			this.next=next;
		}
		public Node() {
			item=null;
			next=null;
		}
		boolean end() {return item==null&&next==null;}
	}
	private Node top=new Node();
	public void push(T item)
	{
		top=new Node(item,top);
	}
	public T pop()
	{
		T result=top.item;
		if(!top.end())
		{
			top=top.next;
		}
		return result;
	}
	public static void main(String[] args) {
		String string="hello world zhang san";
		LinkedStack<String> linkedStack = new LinkedStack<String>();
		for (String string2 : string.split(" ")) {
			linkedStack.push(string2);
		}
		String ss=null;
//		ss=linkedStack.pop()
//		ss!=null
		//二者可以连写
		
//		while(linkedStack.pop()!=null)
//		如果要获取值直接加上=就行
//		while((ss=linkedStack.pop())!=null)
		//这样一来 即向下移动了一次 又把每次的结果记录下来了 
		while((ss=linkedStack.pop())!=null)
		{
			System.out.println(ss);
		}
	}
	public LinkedStack() {
		// TODO Auto-generated constructor stub
	}

}
