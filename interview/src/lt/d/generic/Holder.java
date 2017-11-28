package lt.d.generic;

import lt.a.rtti.Cat;

public class Holder <T>{
	private T value;

	public Holder(T value) {
		this.value = value;
	}

	public Holder() {
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}


	public boolean equals(Object obj) {
		return value.equals(obj);
	}
	public static void main(String[] args) {
		Holder<Apple> holder=new Holder<Apple>(new Apple());
		Apple value2 = holder.getValue();
		holder.setValue(value2);
		
		Holder<? extends Fruit> fruit=new Holder<Apple>(new Apple());
//		fruit.setValue(value);
		fruit.equals(value2);
	}
}
class Fruit {}
class Apple extends Fruit{}
