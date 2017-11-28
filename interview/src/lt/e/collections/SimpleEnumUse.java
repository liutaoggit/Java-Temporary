package lt.e.collections;

import org.junit.Test;

public class SimpleEnumUse {
	public static void main(String[] args) {
		Spiciness howHOT=Spiciness.MEDIUM;
		System.out.println(howHOT);
	}
	
	@Test
	public void fun1()
	{
		for (Spiciness s : Spiciness.values()) {
			System.out.println(s+" "+s.ordinal());
		}
	}
	@Test
	public void fun2()
	{
		
	}
}
