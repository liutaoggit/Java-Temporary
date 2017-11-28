package lt.lambda;

import java.io.File;
import java.util.regex.Pattern;

import org.junit.Test;

public class Test1 {

	public static void factory(Generator generator)
	{
		generator.next();
	}
	@Test
	public void fun1()
	{
		factory(()->System.out.println("hello world"));
		
	}
	@Test
	public void fun2()
	{
		File path=new File("/home/liutao/fileOp");
		String regex="\\w+.java";
//		return pattern.matcher(name).matches();
//		boolean accept(File dir, String name);
//		path.list((dir,name)->return name;);
	}
}
