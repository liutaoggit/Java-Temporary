package lt.c.decorate;

public class TestDecorate {
public static void main(String[] args) {
	Person xc=new Person("zhangsan");
//	Sneakers sneakers=new Sneakers();
//	BigTrouser bigTrouser=new BigTrouser();
//	TShirts tShirts=new TShirts();
//	
//	sneakers.Decorate(xc);
//	bigTrouser.Decorate(sneakers);
//	tShirts.Decorate(bigTrouser);
	Sneakers sneakers=new Sneakers(xc);
	TShirts tShirts=new TShirts(sneakers);
	tShirts.show();
//	sneakers.show();
//	sneakers.show();
//	bigTrouser.show();
	
}
}
