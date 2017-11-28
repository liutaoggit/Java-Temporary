package lt.j.dynamicproxy;

public class ElectricCar implements Rechargable,Vehicle{

	

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		System.out.println("electricCar recharge---");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("electricCar dirve---");
	}
}
