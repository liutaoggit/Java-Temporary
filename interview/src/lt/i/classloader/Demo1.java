package lt.i.classloader;

public class Demo1 {
	public static void main(String[] args) {
		ClassLoader classLoader = Demo1.class.getClassLoader();
		while(classLoader!=null)
		{
			System.out.println(classLoader.getClass());
			classLoader=classLoader.getParent();
		}
		System.out.println(String.class.getClassLoader());
	}
}
