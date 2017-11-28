package lt.i.observe;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observe> observes=new ArrayList<Observe>();
	
	public void attach(Observe observe)
	{
		observes.add(observe);
	}
	public void detach(Observe observe)
	{
		observes.add(observe);
	}
	public void notify1()
	{
		for (Observe observe : observes) {
			observe.update();
		}
	}
}
class ConcreteSubject extends Subject{
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	
}
