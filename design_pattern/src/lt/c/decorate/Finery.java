package lt.c.decorate;
/**
 * Decorate
 * @author liutao
 *
 */
public class Finery extends Person{
	protected Person component;//对该component对象进行装饰
	public void Decorate(Person component)
	{
		this.component=component;
	}
	
	public Finery(Person component) {
		this.component = component;
	}

	public void show()
	{
		if(component!=null)
		{
//			System.out.println(component.getClass());
			component.show();
		}
	}
}
class TShirts extends Finery
{
	public TShirts(Person component) {
		super(component);
	}

	public void show()
	{
		System.out.println("大T恤");
		super.show();
	}
}
class BigTrouser extends Finery{
	public BigTrouser(Person component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public void show()
	{
		System.out.println("垮裤");
		super.show();
	}
}
class Sneakers extends Finery{
	public Sneakers(Person component) {
		super(component);
	}

	public void show()
	{
		System.out.println("破球鞋");
		super.show();
	}
}