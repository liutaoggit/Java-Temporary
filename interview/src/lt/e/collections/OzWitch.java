package lt.e.collections;

public enum OzWitch {
	WEST("AAA"),
	EAST("zBBB"),
	NORTH("CCC"),
	SOUTH("DDD");
	private String description;
	//Enum中使用构造函数
	private OzWitch(String description)
	{
		this.description=description;
	}
	//Enum中复写toString()方法
	
	public String toString() {
		return name().charAt(0)+name().substring(1).toLowerCase();
	}
	public static void main(String[] args) {
		for (OzWitch s : OzWitch.values()) {
			System.out.println(s+" "+s.getDeclaringClass()+" ");
		}
//		OzWitch.valueOf(enumType, name)
	}
}
