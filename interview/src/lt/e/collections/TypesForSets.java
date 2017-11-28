package lt.e.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TypesForSets {
	public static<T> Set<T> fill(Set<T> set,Class<T> type){
		try {
			for(int i=0;i<10;i++)
			{
				set.add(type.getConstructor(int.class).newInstance(i));
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return null;
	}
	static <T> void testSet(Set<T> set,Class<T> type)
	{
		System.out.println("set"+set);
		fill(set, type);
		fill(set, type);
		System.out.println(set);
	}
	//类型标签T在方法返回值前面
	public static void main(String[] args) {
//		System.out.println("asd");
		testSet(new HashSet<HashType>(), HashType.class);
		testSet(new LinkedHashSet<HashType>(), HashType.class);
		testSet(new TreeSet<TreeType>(), TreeType.class);
		
	}
}
class SetType{
	int i;
	public SetType(int i) {
		this.i = i;
	}
	public boolean equals(Object obj) {
		return obj instanceof SetType &&(i==((SetType)obj).i);
	}
	@Override
	public String toString() {
		return "i=" + i + "";
	}
	
}
class HashType extends SetType{
	public HashType(int n) {super(n);}
	public int hashCode() {return i;}
}
class TreeType extends SetType implements Comparable<TreeType>{

	public TreeType(int i) {
		super(i);
	}
	//不能用return o.i-i来搞
	public int compareTo(TreeType o) {
		return i>o.i?-1:(i==o.i?0:1);
	}
}