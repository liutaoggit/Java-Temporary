package lt.c.array;

import java.util.Arrays;

import lt.a.rtti.Cat;

public class Ex19 {
	public static void main(String[] args) {
//		Cat1 cat1=new Cat1(1);
//		Cat1 cat2=new Cat1(1);
//		System.out.println(cat1.equals(cat2));
		Cat1[] cat1s=new Cat1[5];
		Cat1[] cat2s=new Cat1[5];
		Arrays.fill(cat1s, new Cat1(1));
		Arrays.fill(cat2s, new Cat1(1));
		boolean equals = Arrays.equals(cat1s, cat2s);
		System.out.println(equals);
	}
	
}
class Cat1{
	private int i;

	public Cat1(int i) {
		super();
		this.i = i;
	}

	public Cat1() {
		super();
	}

	@Override
	public String toString() {
		return "Cat [i=" + i + "]";
	}


//	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat1 other = (Cat1) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
	
}
