package lt.a.rtti;

public class Dog extends Pet{

	public Dog() {
		super();
	}

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
	
	
}
