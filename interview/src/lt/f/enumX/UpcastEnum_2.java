package lt.f.enumX;
enum Search{HITHER,YON}
public class UpcastEnum_2 {
public static void main(String[] args) {
	Search[] values = Search.values();
	Enum enum1=Search.HITHER;
	//Enum实例是调用不了values方法
	for(Enum en:enum1.getClass().getEnumConstants())
	{
		System.out.println(en);
	}
}
}
