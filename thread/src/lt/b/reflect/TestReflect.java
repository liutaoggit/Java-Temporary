package lt.b.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

import org.junit.Test;

public class TestReflect {

	static {System.out.println("static code");}
	@Test
	public void fun1() throws Exception
	{
		int[] arr=new int[10];
		System.out.println(arr.getClass());
		String[] sArr=new String[10];
		//		sArr.get
		System.out.println(sArr.getClass());

	}
	@Test
	public void fun2()
	{
		String[] sArr=new String[10];
		Class<? extends String[]> class1 = sArr.getClass();
		String name = class1.getName();
		System.out.println(name+"     "+class1.getSimpleName());
		System.out.println(TestReflect.class.getName());
		System.out.println(String.class.getName());
		//		System.out.println();

		float []farr=new float[10];
		//		Object o;
		////		System.out.println(o.getClass());
		System.out.println(farr.getClass().getName());
		System.out.println(float[].class.getName());
	}

	@Test
	public void fun3()
	{
		Class<?> class1=Resume.class;
		Field[] fields = class1.getFields();
		Field[] declaredFields = class1.getDeclaredFields();
		System.out.println(fields.length+" "+declaredFields.length);
		//		class1.getField(name)
	}
	@Test
	public void fun4()
	{
		Class<?> class1=Children1.class;
		Object newInstance = null;
		try {
			newInstance = class1.newInstance();
			System.out.println(newInstance);
		} catch (InstantiationException | IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//		Field[] fields = class1.getFields();
		//		System.out.println(fields.length);
		//		Field[] declaredFields = class1.getDeclaredFields();
		//		System.out.println(declaredFields.length);
		try {
			Field field = class1.getDeclaredField("childrenFieldA");
			field.setAccessible(true);
			try {
				field.set(newInstance, 22);
				System.out.println(newInstance);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void fun5() throws Exception, SecurityException
	{
		Class<?> class1=Children1.class;
		Field declaredField = class1.getDeclaredField("number");
		declaredField.set(null, 33);
		System.out.println(Children1.number);
	}
	@Test
	public void fun6()
	{
		Class<?> class1= Resume.class;
		Field[] declaredFields = class1.getDeclaredFields();
		for (Field field : declaredFields) {
			int modifiers = field.getModifiers();
			String string = Modifier.toString(modifiers);
			System.out.print(string);
			System.out.println(" "+field.getType());
		}
	}
	/**
	 *反射获取类方法
	 */
	@Test
	public void fun7()
	{
		Class<?> class1=Collections.class;
		Method[] declaredMethods = class1.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method.getName()+" "+method.getModifiers()+" "+method.getParameterTypes()+" "+method.getReturnType());
		}
	}
	@Test
	public void fun8() throws Exception, SecurityException
	{
		Class<?> class1=Parent.class;
		Method declaredMethod = class1.getDeclaredMethod("fun1",null);
		declaredMethod.invoke(class1.newInstance(), null);
		System.out.println(Arrays.toString(declaredMethod.getParameterTypes()));
	}
	/**
	 * 利用反射调用Integer.parseInt(String)方法
	 * String -->int
	 * @throws Exception 
	 * @throws NoSuchMethodException 
	 */
	@Test
	public void fun9() throws Exception
	{
		//		Integer.pars
		Class<?> class1=Integer.class;
		Class<?> class12 = class1;
		Method declaredMethod = class12.getDeclaredMethod("parseInt", String.class);
		Object invoke = declaredMethod.invoke(null	, "2222");
		System.out.println((int)invoke);
	}

	@Test
	public void fun10() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
	{
		Class<?> class1=Parent.class;
		//		Object newInstance = class1.newInstance();
		//		Class<?> class12 = class1;
		//		Constructor<?> constructor = class1.getConstructor(String.class,String.class);
		//		Object newInstance = constructor.newInstance("123","abc");
		//		System.out.println(newInstance);
		System.out.println("-----------------");
		Constructor<?>[] constructors = class1.getConstructors();
		System.out.println(Arrays.toString(constructors));
	}
	/**
	 * 通过反射实现动态类型检查
	 * Class.forName()
	 * Class.isInstance()
	 * @throws ClassNotFoundException 
	 */
	@Test
	public void fun11() throws ClassNotFoundException
	{
		Class<?> class1=Class.forName("lt.b.reflect.Parent");
		Parent parent=new Parent();
		boolean instance = class1.isInstance(parent);
		System.out.println(instance);
		//		class1.is
	}
	/**
	 * 数组反射的相关方法
	 */
	@Test
	public void fun12()
	{
		Parent[] parents=new Parent[] {new Parent(),new Parent()};
		Class<?> componentType = parents.getClass().getComponentType();
		System.out.println(componentType);

		//使用反射创建的数组 是可以和泛型数组相互转换的
		Object newInstance = Array.newInstance(String.class, 10);
		String[] strings=(String[]) newInstance;
		System.out.println(Arrays.toString(strings)+" "+Array.getLength(strings));

	}
	
	/**
	 * 通过泛型获取类的泛型信息T，K,V  (类型参数)
	 */
	@Test
	public void fun13()
	{
		Class<?> class1=TreeMap.class;
		TypeVariable<?>[] typeParameters = class1.getTypeParameters();
		System.out.println(Arrays.toString(typeParameters));
		
		Class<?> class2=Comparable.class;
		System.out.println(Arrays.toString(class2.getTypeParameters()));
	}
	/**
	 * Field.getGenericType()
	 * 获取字段的参数化类型 
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 */
	@Test
	public void fun14() throws NoSuchFieldException, SecurityException
	{
		Class<?> class1=TreeMap.class;
		Field declaredField = class1.getDeclaredField("root");
		Type genericType = declaredField.getGenericType();
		System.out.println(genericType);
		ParameterizedType parameterizedType=(ParameterizedType) genericType;
//		genericType.
		//通过参数化类型--->类型参数
		Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
		System.out.println(Arrays.toString(actualTypeArguments));
		Type rawType = parameterizedType.getRawType();
		System.out.println("rawType:"+rawType);
	}
	@Test
	public void fun15() throws NoSuchMethodException, SecurityException
	{
		Class<?> class1=TreeMap.class;
		Method declaredMethod = class1.getDeclaredMethod("lowerEntry",Object.class);
		Type[] genericParameterTypes = declaredMethod.getGenericParameterTypes();
		System.out.println(Arrays.toString(genericParameterTypes));
//		lowerEntry
	}
	@Test
	public void fun16()
	{
		Class<?> class1=Parent.class;
//		Object newInstance = class1.newInstance();
		Field[] declaredFields = class1.getDeclaredFields();
		System.out.println(Arrays.toString(declaredFields));
	}
}
