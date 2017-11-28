package lt.b.strategy;

public class CahsNormal extends CashSuper{
	@Override
	public double acceptCash(double money) {
		return money;
	}

}
class CashRebate extends CashSuper
{
	private double moneyRebate=1;

	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}

	public double acceptCash(double money) {
		return money*moneyRebate;
	}
}
class CashReturn extends CashSuper
{
	//需要返利条件和返回值

	private double moneyCondition;
	private double moneyReturn;
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	@Override
	public double acceptCash(double money) {
		double result=money;
		if(money>=moneyCondition)
		{
			result=money-Math.floor(money/moneyCondition)*moneyReturn;
		}
		return result;
	}
	}