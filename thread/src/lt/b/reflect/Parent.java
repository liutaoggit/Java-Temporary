package lt.b.reflect;

public class Parent {
	public String fieldA;
	public String fieldB;
	int in;
	public void fun1() {
		System.out.println("parent-----");
	}
	public Parent(String fieldA, String fieldB) {
		super();
		this.fieldA = fieldA;
		this.fieldB = fieldB;
	}
	public Parent() {
		super();
	}
	@Override
	public String toString() {
		return "Parent [fieldA=" + fieldA + ", fieldB=" + fieldB + "]";
	}
	
	

}
class Children1 extends Parent
{
	private int childrenFieldA;
	public static int number;
	@Override
	public String toString() {
		return "Children1 [childrenFieldA=" + childrenFieldA + "]";
	}
}

