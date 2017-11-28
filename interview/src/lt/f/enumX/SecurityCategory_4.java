package lt.f.enumX;

/**
 * 使用enum 来 管理 enum
 * 区别与用 interface来管理enum
 * 这种方式更简洁,使代码结构更加清晰
 * @author liutao
 *
 */
enum SecurityCategory_4 {
	STOCK(Security.Stock.class),BOND(Security.Bond.class);
	Security[] values;
	private SecurityCategory_4(Class<? extends Security> kind) {
		values=kind.getEnumConstants();
		//为什么要手动给values赋值，因为values()方法只有在编译时才会生成
	}
	;
	interface Security{
		enum Stock implements Security{SHOERT,LONG,MARGIN}
		enum Bond implements Security{MUNICIPAL,JUNK}
	}
	public Security randomSelection()
	{
		return Enums.random(values);
	}
public static void main(String[] args) {
	for(int i=0;i<10;i++)
	{
		SecurityCategory_4 category_4=Enums.random(SecurityCategory_4.class);//随机生成一盒SC类型的枚举常量
		Security randomSelection = category_4.randomSelection();
		System.out.println(category_4+":"+randomSelection);
	}

}
}
