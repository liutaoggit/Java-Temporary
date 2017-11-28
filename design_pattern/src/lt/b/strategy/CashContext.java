package lt.b.strategy;

/**
 * 策略模式和简单工厂相结合
 * 
 * 策略模式思想，将算法封装(封装变化)  将变化封装到一个Context上下文类中
 * @author liutao
 *
 */
public class CashContext {
	CashSuper cs=null;//Strategy  strategy由外部传进来比较好
	public CashContext(String type)
	{
		switch (type) {
		case "正常收费":cs=new CahsNormal();break;
		case "满300返100":cs=new CashReturn(300, 100);break;
		case "打8折":cs=new CashRebate(0.8);break;
		}
	}
	public double getResult(double money)
	{
		return cs.acceptCash(money);
	}
}
