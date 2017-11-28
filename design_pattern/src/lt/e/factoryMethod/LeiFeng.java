package lt.e.factoryMethod;

public class LeiFeng {
	public void sweep() {
		System.out.println("扫地");
	}
	public void Wash()
	{
		System.out.println("洗衣");
	}
	public void BuyRice()
	{
		System.out.println("买米");
	}
}
class Undergraduate extends LeiFeng
{}
class Volunteer extends LeiFeng
{}
interface Factory{
	LeiFeng CreateLeiFeng();
}
class UndergraduateFactory implements Factory{

	@Override
	public LeiFeng CreateLeiFeng() {
		return new Undergraduate();
	}
}
class VolunteerFactory implements Factory
{

	@Override
	public LeiFeng CreateLeiFeng() {
		return new Volunteer();
	}
	}