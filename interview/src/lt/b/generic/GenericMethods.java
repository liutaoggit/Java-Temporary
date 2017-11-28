package lt.b.generic;

public class GenericMethods {
	public <T,U>  void f(T x,U u,String string) {
		System.out.println(x.getClass()+"   "+u.getClass()+" "+string);
	}
	/**
	 * 泛型方法调用前是不用指定类型参数的
	 * @param args
	 */
	public static void main(String[] args) {
		GenericMethods genericMethods=new GenericMethods();
//		genericMethods.f("hello world", 25);
//		genericMethods.f("hello world", 25.11);
		genericMethods.f(new GenericMethods(), 'c', "ppppp");
	}

}
