package lt.d.generic;

public class Ex2 {
public static void main(String[] args) {
}
}
class HasF{
	public void f() {System.out.println("HasF.f()");}
}
/**
 * 使用边界
 * 虽然擦除了泛型，但是泛型的边界是没有被擦除的
 * @author liutao
 *
 * @param <T>
 */
class Manipulator<T extends HasF>{
	private T obj;
	public Manipulator(T obj) {
		this.obj = obj;
	}
	//由于T信息被擦除，因此这里无法调用f方法
	public void manipulate()
	{
		obj.f();
	}
	
}
