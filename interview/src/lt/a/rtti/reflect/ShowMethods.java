package lt.a.rtti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
	private static Pattern pattern=Pattern.compile("\\w+\\.|native |(final )");
	public static void main(String[] args) throws Exception {
		outputMethodAndConstructor("lt.a.rtti.reflect.ShowMethods");
	}
	//	public ShowMethods() {
	//		// TODO Auto-generated constructor stub
	//	}

	/**
	 * public String replaceAll(String regex, String replacement) {

	return Pattern.compile(regex).matcher(this).replaceAll(replacement);
    }
	 * @param className
	 * @throws Exception
	 */
	public static void outputMethodAndConstructor(String className) throws Exception
	{
		
		Class<?> c=Class.forName(className);
		Method[] methods = c.getMethods();
		Constructor<?>[] constructors = c.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(pattern.matcher(constructor.toString()).replaceAll(""));
		}
		for (Method method:methods) {
			System.out.println(pattern.matcher(method.toString()).replaceAll(""));
		}

	}

}
