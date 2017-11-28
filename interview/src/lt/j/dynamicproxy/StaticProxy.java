package lt.j.dynamicproxy;

public class StaticProxy implements Vehicle{
	Vehicle vehicle;

	public StaticProxy(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public StaticProxy() {
		super();
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("before vehicle drive");
		vehicle.drive();
		System.out.println("after vehicle drive");
	};

}
