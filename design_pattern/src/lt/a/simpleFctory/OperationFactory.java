package lt.a.simpleFctory;

/**
 * 抽取出抽象类
 * 封装加减乘除四个类
 * 让运算工厂根据 字符串产生出相应的对象
 * @author liutao
 *
 */

//jdk 1.8后switch中能放string了
public class OperationFactory {
	public static Operation createOperation(String type)
	{
		if(type.length()>1)
		{
			throw new RuntimeException("请输入正确的运算符");
		}
		int parseInt = type.charAt(0);
		Operation operation=null;
		switch(parseInt)
		{
		case '+':operation=new OperationAdd();break;
		case '-':operation=new OperationSub();break;
		case '*':operation=new OperationMul();break;
		case '/':operation=new OperationDiv();break;
		default:throw new RuntimeException("请输入正确的运算符");
		}
		return operation;
	}
}
