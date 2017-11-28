package lt.b.strategy;

public class TestFactory {
public static void main(String[] args) {
//	CashSuper cs=CashFactory.createCashAccept("正常收费");
//	double acceptCash = cs.acceptCash(1000);
//	System.out.println(acceptCash);
	
	CashSuper cs=CashFactory.createCashAccept("打8折");
	double acceptCash = cs.acceptCash(2000);
	System.out.println(acceptCash);
	
	//商场促销卖东西有一个缺陷 就是每次添加一个促销模式，或者维护以前的都要对产生CashSuper的工厂进行重写编译部署，
	//根据 开发-封闭原则  代码应该多扩展，少修改
}
}
