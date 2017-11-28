package lt.i.classloader;

public class Demo2 {
	
	private static int num=1;
	private static String msg="static String field";
	static {
		System.out.println(num+" "+msg);
	}
	
	
//	public static void main(String[] args) throws ClassNotFoundException {
//		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//		System.out.println(systemClassLoader);
//		Class<?> loadClass = systemClassLoader.loadClass("java.lang.String");
////		loadClass.getClass()
//		System.out.println(loadClass);
//		System.out.println(loadClass.getClassLoader());
//	}
}
