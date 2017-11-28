package lt.b.generic.generator1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 * 泛型在这里的主要作用：限制每个容器的类型（通过参数化类型），使其只能持有同一个类型的对象，并且在编译时能够检查器安全性
 * 如果在这里不适用泛型 ，每个对象都必须继承一个类，或者实现一个接口，才能使用同一个方法
 *在这里泛型方法（泛型类）能够接受任何不确定的类型，大大增加了方法的可重用行
 * @author liutao
 *
 */
public class OceanTest18 {
	public static void bigEatLittle(BigFish bigFish,LittleFish littleFish)
	{
		System.out.println(bigFish+" eat "+littleFish);
	}
	
public static void main(String[] args) {
	Random random=new Random(47);
	List<BigFish> queue=new LinkedList<BigFish>();
	Generators.fill(queue, BigFish.genrator(), 5);
	
	LinkedList<LittleFish> list=new LinkedList<LittleFish>();
	Generators.fill(list, LittleFish.generator, 15);
	for (LittleFish littleFish : list) {
		bigEatLittle(queue.get(random.nextInt(queue.size())), littleFish);
	}
}
}
