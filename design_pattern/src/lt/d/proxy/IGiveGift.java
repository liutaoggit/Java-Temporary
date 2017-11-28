package lt.d.proxy;

public interface IGiveGift {
	void giveDolls();
	void giveFlowers();
	void giveChocolate();
}
class SchoolGirl{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
class Persuit implements IGiveGift{
	SchoolGirl mm;

	public Persuit(SchoolGirl mm) {
		this.mm = mm;
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"送你洋娃娃");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"送你鲜花");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"送你巧克力");
	}
}
class Proxy implements IGiveGift
{
	Persuit gg;
	public Proxy(SchoolGirl mm) {
		gg=new Persuit(mm);
	}

	public void giveDolls() {
		// TODO Auto-generated method stub
		gg.giveDolls();
	}

	public Proxy() {
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		gg.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		gg.giveChocolate();
	}
}