package lt.c.array;

import java.util.ArrayList;

import org.junit.Test;

public class Ex9 {
	@Test
	public void fun1()
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
	}
	@Test
	public void fun2()
	{
		ArrayList<Peel<Banana>> arrayList=new ArrayList<Peel<Banana>>();
	}
}
class Peel<T> {
	T fruit;
	Peel(T fruit) { this.fruit = fruit; }
	void peel() { System.out.println("Peeling "+ fruit); }
}
class Banana {
	private final int id;
	Banana(int id) { this.id = id; }
	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}