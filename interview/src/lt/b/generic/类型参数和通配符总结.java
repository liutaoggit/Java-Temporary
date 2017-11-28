package lt.b.generic;

import java.util.Arrays;

import org.junit.Test;

public class 类型参数和通配符总结 {
	//	由于addAll方法只能接受Number类型参数，所以无法将接受其子类型Integer的容器
	/*	public void addAll(DynamicArray<E> c) {
		for(int i=0; i<c.size; i++){
			add(c.get(i));
		}
	}
	 */	@Test
	 public void fun4()
	 {
		 DynamicArray<Number> numbers=new DynamicArray<>();
		 DynamicArray<Integer> ints=new DynamicArray<>();
		 ints.add(1);
		 ints.add(2);
		 //		numbers.add(ints);
	 }

	 //使用上界通配符 ？extends E 使addAll方法参数能够接受E及其子类型的容器
	 /*	public void addAll(DynamicArray<? extends E> c) {
			for(int i=0; i<c.size; i++){
				add(c.get(i));
			}
		}*/
	 //	 或者使用类型参数也行
	 /*	public <T extends E>void addAll(DynamicArray<T> c) {
			for(int i=0; i<c.size; i++){
				add(c.get(i));
			}
		}*/


	 @Test
	 public void fun5()
	 {
		 DynamicArray<Number> numbers=new DynamicArray<>();
		 DynamicArray<Integer> ints=new DynamicArray<>();
		 ints.add(1);
		 ints.add(2);
		 //		 numbers.addAll(ints);
	 }



	 //通配符的缺点 只能读 不能写
	 //	 public static <E> void swap(DynamicArray<? extends E> arr, int i, int j){
	 //		 Object tmp = arr.get(i);
	 ////		 arr.set(i, arr.get(j));
	 ////		 arr.set(j, tmp);
	 //	 }
	 //解决办法 使用通配符来调用类型参数--》一般公共的api是使用通配符的形式
	 private static <T> void swapInternal(DynamicArray<T> arr, int i, int j){
		 T tmp = arr.get(i);
		 arr.set(i, arr.get(j));
		 arr.set(j, tmp);
	 }
	 public static void swap(DynamicArray<?> arr, int i, int j){
		 swapInternal(arr, i, j);
	 }


	 @Test
	 public void fun6()
	 {
		 DynamicArray<Integer> ints=new DynamicArray<>();
		 ints.add(1);
		 ints.add(3);
		 ints.add(99);
		 Integer[] array = ints.toArray();
//		 Integer[] array = ints.toArray(Integer.class);
		 System.out.println(Arrays.toString(array));
	 }
	 @Test
	 public void fun7() throws SecurityException, Exception
	 {
		 DynamicArray<Integer> ints=new DynamicArray<>();
		 ints.add(new Integer(1));
//		 ints.add(3);
//		 ints.add(99);
		 Integer[] array = ints.toArray(Integer.class);
		 System.out.println(Arrays.toString(array));
	 }

}
