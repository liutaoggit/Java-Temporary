package lt.f.enumX;

enum Activity{
	LYING,STANDING,FLYING,FALLING
}
/**
 * 随机获取ACtivity枚举类型中的枚举常量
 * @author liutao
 *
 */
public class RandomTest_3 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			Activity random = Enums.random(Activity.class);
			System.out.println(random);
		}
	}
}
