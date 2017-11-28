package lt.a.simpleFctory;

public class TestSimpleFactory {
	public static void main(String[] args) {
		Operation operation=OperationFactory.createOperation("-");
		operation.setNumberA(100);
		operation.setNumberB(99);
		double result = operation.getResult();
		System.out.println(result);
	}
	
}
