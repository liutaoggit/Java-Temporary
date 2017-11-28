package lt.d.proxy;

public class ProxyTest {
public static void main(String[] args) {
	SchoolGirl mm=new SchoolGirl();
	mm.setName("aaaaaaa");
	Proxy proxy=new Proxy(mm);
	proxy.giveChocolate();
	proxy.giveDolls();
	
}
}
