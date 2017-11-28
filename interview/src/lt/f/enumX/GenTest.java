package lt.f.enumX;

public class GenTest <K extends A>{
	K obj;
	public GenTest(K k){
		obj=k;
	}
	void fun1()
	{
		obj.get();
		System.out.println("fun1");
	}
	void fun2(K k)
	{
		obj.set(k);
		System.out.println("fun2");
	}
	
	public static void main(String[] args) {
		GenTest<A> genTest = new GenTest<A>(new A());
		genTest.fun1();
		genTest.fun2(new A());
	}
}
class A{
	A get() {return null;}
	void set(A a) {};
	
}