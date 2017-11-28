package lt.b.generic;

import java.awt.CardLayout;
import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

import lt.a.rtti.Cat;
import lt.a.rtti.Pet;

public class Tessxx {
	public static <T extends Comparable> T max(T[] arr){
		T max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i].compareTo(max)>0){
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		//		Integer max = max(new Integer[] {new Integer(1),2,4,3});
		//		max(new CardLayout[] {new Pet(),new Pet()});
		//		System.out.println(max);

		//		T extends Comparable//限制传递的类型必须为实现Comparable的接口
	}
	@Test
	public void fun1()
	{
		DynamicArray<Number> numbers = new DynamicArray<>();
		DynamicArray<Integer> ints=new DynamicArray<>();
		ints.add(99);
		ints.add(100);
		DynamicArray<Double> doubles=new DynamicArray<>();
		doubles.add(Math.random());
		//		numbers.addAll(ints);
		//解决办法  将DynamicArray的T  定义为 T extennds E 
		//		E是DynamicArray的类型参数，T是addAll的类型参数，T的上界限定为E

		//但是这样个人觉得不是很好
		//		使用两个泛型 来解决父容器和子容器的不能转化问题
		//		调用者 是E,方法参数类型是T
		//		numbers.addAll(ints);
		//		numbers.addAll(doubles);
		for(int i=0;i<3;i++)
			System.out.println(numbers.get(i));
		//		System.out.println();


	}
	@Test
	public void fun3()
	{
		TB tb=new TB();
		Class<?>[] interfaces = TA.class.getInterfaces();
		System.out.println(Arrays.toString(interfaces));
		//		TB 虽然继承自TA,但是未实现IA接口
	}

	/**
	 * 测试下界通配符 ？ super E 注意此通配符 是不能用类型参数来替代的
	 * 应用场景 在泛型类内部使用E   常用语写和比较
	 * 在泛型类外部使用具体类	 ？ super Hasf
	 */


//	如果传递的Child类型
//	public static <Child extends Comparable<? super Child> >Child 
//	表示传递过来的类型可以是T及其父类\
//	使得对象可以写入父类型的容器，使得父类型的比较方法可以应用于子类对象。
//	<? extends E>用于灵活读取，使得方法可以读取E或E的任意子类型的容器对象。
 	public static <T extends Comparable<? super T>> T max(DynamicArray<T> arr)
	{
		return null;
	}
	@Test
	public void fun4()
	{	
		DynamicArray<Child> childs = new DynamicArray<Child>();
		DynamicArray<Base> bases=new DynamicArray<>();
// 		childs.add(new Child(20));
//		childs.add(new Child(80));
		//虽然Child继承了Base类，但是没有实现Comparablable接口，所以不能使用使用max方法
				Child maxChild = max(childs);
				max(bases);
		//		
		//		解决办法
	}



}
interface Ia{void fun1();}
class TA implements Ia{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		
	}}
class TB extends TA implements Ia{}
class A1 implements Iterable<A1>
{

	@Override
	public Iterator<A1> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	}
//class B1 extends A1 implements Iterable<B1>{
//	
//}

