package lt.b.generic.generator1;

import lt.b.generic.Generator;

/**
 * Generator 对象生成器 使用泛型可以方便快速生成任何类 （根据类型参数）
 * Generators.fll 对象集合生成器 使用泛型快速生成一组制定类型的集合
 * @author liutao
 *
 */
public class EatFishExample18 {

}
class BigFish{
	private static long counter=0;
	private final long id=counter++;
	@Override
	public String toString() {
		return "BigFish [id=" + id + "]";
	}
	public BigFish() {
		// TODO Auto-generated constructor stub
	}
	public static Generator<BigFish> genrator(){
		return new Generator<BigFish>() {

			@Override
			public BigFish next() {
				return new BigFish();
			}
		};
	}
}
class LittleFish{
	private static long counter=0;
	private final long id=counter++;
	@Override
	public String toString() {
		return "LittleFish [id=" + id + "]";
	}
	public LittleFish() {
	}
	public static Generator<LittleFish> generator=new Generator<LittleFish>() {

		@Override
		public LittleFish next() {
			// TODO Auto-generated method stub
			return new LittleFish();
		}
	};
	
	
}
