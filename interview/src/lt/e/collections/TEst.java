package lt.e.collections;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TEst {

	
	public static void f()
	{
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("runtimeExceptionss"+e);
		}
		System.out.println("asdqwe");
	}
	public static void main(String[] args) {
		f();
	}
	@Test
	public void fun1()
	{
		List<String> list=new ArrayList<>();
		list.add("asd");
	}
}
