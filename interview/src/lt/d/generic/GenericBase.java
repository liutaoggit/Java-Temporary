package lt.d.generic;

public class GenericBase <T>{
	private  T element;

	public void setElement(T element) {
		this.element = element;
	}

	public T getElement() {
		return element;
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Derived2 d2=new Derived2();
		Object element2 = d2.getElement();
		System.out.println(element2);
		//为什么会产生警告 将Object->T  Object[]->T[]都会产生
		d2.setElement(element2);
	}
}
class Derived2 extends GenericBase{}