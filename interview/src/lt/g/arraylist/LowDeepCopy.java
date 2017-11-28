package lt.g.arraylist;

import org.junit.Test;

public class LowDeepCopy {
	public static void main(String[] args) {
		Student s1=new Student("zhangsan",10);
		Student s2=s1;
		s2.id=100;
		System.out.println(s1);
		s1.name="lisi111";
		System.out.println(s2);

	}
	//浅复制
	@Test
	public void fun1()
	{
		Student s1=new Student("lisi",1);
		Student clone = (Student) s1.clone();
		s1.id=10;
		System.out.println(clone);
	}
	
	
	//浅拷贝 两个对象的引用指向的是同一个对象
	@Test
	public void fun2()
	{
		Student s1=new Student("lisi",1);
		s1.setIdCard(new Id("id1",1));
		Student clone = (Student) s1.clone();
		//		s1.id=10;
//		clone.id=100;
//		clone.setIdCard(new Id("id2",2));
		clone.idCard.name="idssss";
		System.out.println(clone);
		System.out.println(s1);
	}
	
	//深复制
//	设置对象中的对象时，传递一个新的对象即可
	//只需在复制时，让引用指向一块新的空间即可
	@Test
	public void fun3()
	{
		Student s1=new Student("lisi",1);
		s1.setIdCard(new Id("id1",1));
		Student s2=(Student) s1.clone();
		s1.setIdCard(new Id("idssasd", 13213));
		System.out.println(s1);
		System.out.println(s2);
	}
	
	@Test
	public void fun4()
	{
		Student s1=new Student("zhangsan1", 1);
		Student s2=(Student) s1.clone();
		s2.name="lisi";
		System.out.println(s1+" ");
	}

}
class Student  implements Cloneable{
	public String name;
	public int id;
	Id idCard;
	
	public Id getIdCard() {
		return idCard;
	}
	public void setIdCard(Id idCard) {
		this.idCard = idCard;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", idCard=" + idCard + "]";
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Student() {
		super();
	}
	public Object clone() {  
		try {  
			return (Student)super.clone();  
		} catch (Exception e) {  
			e.printStackTrace();  
			return null;  
		}  
	}  
}
class Id
{
	public String name;
	private int id;
	@Override
	public String toString() {
		return "Id [name=" + name + ", id=" + id + "]";
	}
	public Id(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Id() {
		super();
	}
	
}
