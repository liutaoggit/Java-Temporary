package lt.b.generic;

/**
 * 使用显示构造函数创建Generator
 * Generator使用泛型产生对象
 * 任何类继承Generator都能成为一个工厂 使用next函数产生特定的对象
 * @author liutao
 *
 */
public class BAsicGeneratorDemo14 {
	public static void main(String[] args) {
		BasicGenerator<CountedObject> basicGenerator = new BasicGenerator<CountedObject>(CountedObject.class);
		for(int i=0;i<5;i++)
		{
			CountedObject next = basicGenerator.next();
			System.out.println(next);
		}
	}
}
