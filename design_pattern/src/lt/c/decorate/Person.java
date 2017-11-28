package lt.c.decorate;

public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public Person() {
	}
	public void show()
	{
		System.out.println("装扮的"+name);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
