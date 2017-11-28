package lt.i.observe;

public class ObservetTest {
	public static void main(String[] args) {
		ConcreteSubject subject=new ConcreteSubject();
		subject.attach(new ConcreteObserve("aa", subject));
		subject.attach(new ConcreteObserve("bb", subject));
		subject.setSubjectState("ABC");
		subject.notify1();
	}
}
//通知者含有观察者索引聚集  可以添加和移除观察者
//当通知者变化时，通知所有观察者

//观察者含有通知者的索引，通知者变化时，观察者更新自身

//什么时候用 当一个对象变化时，影响对象的具体数目不清楚时，
//让耦合的双发都依赖抽象
