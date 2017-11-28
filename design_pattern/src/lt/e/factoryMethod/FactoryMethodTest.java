package lt.e.factoryMethod;

public class FactoryMethodTest {
public static void main(String[] args) {
	Factory factory=new UndergraduateFactory();
	LeiFeng student=factory.CreateLeiFeng();
	student.BuyRice();
	student.sweep();
	student.Wash();
}
}
