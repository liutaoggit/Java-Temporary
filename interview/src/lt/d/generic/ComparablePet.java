package lt.d.generic;

import lt.a.rtti.Cat;

/**
 * 让ComparableCat和ComparableCat及其子类比较是有意义的
 * 
 * 
 * 两个不同的对象比较是没有任何实际意义
 * @author liutao
 *
 */
public class ComparablePet implements Comparable<Cat>{

	@Override
	public int compareTo(Cat o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
