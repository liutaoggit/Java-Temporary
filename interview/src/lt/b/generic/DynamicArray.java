package lt.b.generic;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class DynamicArray<E> {
	private static final int DEFAULT_CAPACITY = 10;

	private int size;
	private Object[] elementData;

	public DynamicArray() {
		this.elementData = new Object[DEFAULT_CAPACITY];
	}

	private void ensureCapacity(int minCapacity) {
		int oldCapacity = elementData.length;
		if(oldCapacity>=minCapacity){
			return;
		}
		int newCapacity = oldCapacity * 2;
		if (newCapacity < minCapacity)
			newCapacity = minCapacity;
		//copyOf使用getClasss获取类型标签Class<? extends T[]>然后利用Arrays.newInstance()来创建数组
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	public void add(E e) {
		ensureCapacity(size + 1);
		elementData[size++] = e;
	}

	public E get(int index) {
		return (E)elementData[index];
	}

	public int size() {
		return size;
	}
	//	public E set(int index, E element) {
	public E set(int index, E element) {
		E oldValue = get(index);
		elementData[index] = element;
		return oldValue;
	}



public E[] toArray(){
    Object[] copy = new Object[size];
    System.arraycopy(elementData, 0, copy, 0, size);
    return (E[])copy;
}
//	public E[] toArray(Class<E> type){
//		Object copy = Array.newInstance(type, size);
//		System.arraycopy(elementData, 0, copy, 0, size);
//		return (E[])copy;
//	}
	
	//这只是创建 没有赋值 当然是null
public E[] toArray(Class<E> type) throws Exception, SecurityException{
	E[] copy = (E[]) Array.newInstance(type, size);
	Constructor<E> constructor = type.getConstructor(int.class);
	E newInstance = constructor.newInstance(1);
	copy[0]=newInstance;
	return copy;
}



	//	public <T extends E> void addAll(DynamicArray<T> c) {
	//		for(int i=0; i<c.size; i++){
	//			add(c.get(i));
	//		}
	//	}

	//上述T extends E的简洁写法
	//	public <T extends E>void addAll(DynamicArray<T> c) {
	//		for(int i=0; i<c.size; i++){
	//			add(c.get(i));
	//		}
	//	}

	public void set( E element) {
	}
	//static方法不能引用外部的类型参数
	//		public void addAll(DynamicArray<?> c) {
	//			set(c.get(0));
	//		}



	//	public void addAll(DynamicArray<E> c) {
	//		for(int i=0; i<c.size; i++){
	//			add(c.get(i));
	//		}
	//	}

	//	public  void swap( int i, int j){
	//		Object tmp = get(i);
	//		set(i, get(j));
	//		set(j, tmp);
	//	}




}