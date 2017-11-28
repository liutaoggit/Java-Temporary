package lt.h.templateMethod;

public class TemplateMethodTest {
public static void main(String[] args) {
	AbstractClass class1;
	class1=new ConcreteClassA();
	class1.TemplateMethod();
	
	//父类方法中的方法有子类实现 因为其是变化的
	class1=new ConcreteClassB();
	class1.TemplateMethod();
}
}
