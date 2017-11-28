package lt.b.generic;
class Base implements Comparable<Base>{
    private int sortOrder;
    
    public Base(int sortOrder) {
        this.sortOrder = sortOrder;
    }
    
    
    public Base() {
		super();
	}


	@Override
    public int compareTo(Base o) {
        if(sortOrder < o.sortOrder){
            return -1;
        }else if(sortOrder > o.sortOrder){
            return 1;
        }else{
            return 0;
        }
    }
}

/**
 * 如果父类没有默认构造函数
 * 则子类构造函数需要强制调用父类的非构造函数
 * 
 * 父类Base实现了Comparable接口
 * 实现了compareTo()方法
 * 
 * 子类继承了Base类，也自动实现了所有父类的Compare方法，当然也可进行比较了
 * 
 * java中父类实现了Comparable接口，子类不能在实现Comparable接口，？？？？？
 * @author liutao
 *
 */
class Child extends Base{

//	public Child(int sortOrder) {
//		super(sortOrder);
//		// TODO Auto-generated constructor stub
//	}
	
}
//class Child extends Base implements Comparable<Child>{
////    public Child(int sortOrder) {
//////        super(sortOrder);
////    }
//
//	public Child(int sortOrder) {
//		super(sortOrder);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public int compareTo(Child o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}

