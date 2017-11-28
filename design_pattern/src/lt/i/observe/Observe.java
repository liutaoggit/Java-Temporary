package lt.i.observe;

public abstract class Observe {
	public abstract void update();
}
class ConcreteObserve extends Observe{
	private String name;
	private String observeState;
	private ConcreteSubject subject;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getObserveState() {
		return observeState;
	}
	public void setObserveState(String observeState) {
		this.observeState = observeState;
	}
	public ConcreteSubject getSubject() {
		return subject;
	}
	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
	public ConcreteObserve(String name, ConcreteSubject subject) {
		this.name = name;
		this.subject = subject;
	}
	@Override
	public void update() {
		observeState=subject.getSubjectState();
		// TODO Auto-generated method stub
		System.out.println("观察者的状态为"+observeState);
	}
	
	
}