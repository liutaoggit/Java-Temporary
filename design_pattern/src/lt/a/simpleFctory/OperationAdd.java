package lt.a.simpleFctory;

public class OperationAdd extends Operation{
	public double getResult()
	{
		return getNumberA()+getNumberB();
	}

}
class OperationSub extends Operation
{
	public double getResult()
	{
		return getNumberA()-getNumberB();
	}
}
class OperationDiv extends Operation{
	public double getResult()
	{
		if(getNumberB()==0)
		{
			throw new RuntimeException("除数不能为0");
		}
		return getNumberA()/getNumberB();
	}

}
class OperationMul extends Operation{
	public double getResult()
	{
		return getNumberA()*getNumberB();
	}
}