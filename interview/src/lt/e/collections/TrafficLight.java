package lt.e.collections;

 class TrafficLight {
	Signal color=Signal.RED;
	public void change()
	{
		//switch中不用使用enum类型来修饰
		switch (color) {
		case RED:color=Signal.GREEN;break;
		case GREEN :color=Signal.YELLOW;break;
		case YELLOW:return;
		}
	}
	@Override
	public String toString() {
		return "the traffic light is"+color;
	}
	public static void main(String[] args) {
		TrafficLight trafficLight=new TrafficLight();
		for(int i=0;i<7;i++)
		{
			System.out.println(trafficLight);
			trafficLight.change();
		}
	}
}
