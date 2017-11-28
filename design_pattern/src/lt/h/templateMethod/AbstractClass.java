package lt.h.templateMethod;

public abstract class AbstractClass {
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();

	public void TemplateMethod()
	{
		primitiveOperation1();
		primitiveOperation2();

	}
}
class ConcreteClassA extends AbstractClass
{

	@Override
	public void primitiveOperation1() {
		// TODO Auto-generated method stub
		System.out.println("AAAA primitiveOperation1");
	}

	@Override
	public void primitiveOperation2() {
		// TODO Auto-generated method stub
		System.out.println("AAAA primitiveOperation2");
	}
}
class ConcreteClassB extends AbstractClass
{

	@Override
	public void primitiveOperation1() {
		// TODO Auto-generated method stub
		System.out.println("BBBB primitiveOperation1");
	}

	@Override
	public void primitiveOperation2() {
		// TODO Auto-generated method stub
		System.out.println("BBBB primitiveOperation2");
	}
}