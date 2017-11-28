package lt.g.prototype;

/**
 * 浅复制 并不调用类的构造函数
 * 
 * 而是复制类的当前状态
 * 并且只复制引用，不复制实例 
 * @author liutao
 *
 */
public class Resume implements Cloneable{
	private String name;
	private String age;
	private String sex;
	
	private WorkExperience workExperience;
	
	public Resume(String name) {
		this.name = name;
		workExperience=new WorkExperience();
	}
	public Resume(String name, WorkExperience workExperience) {
		this.name = name;
		this.workExperience = workExperience;
	}
	public Resume() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setWorkExperience(String workDate,String company)
	{
		workExperience.setWorkDate(workDate);
		workExperience.setCompany(company);
	}
	public void setPersonalInfo(String age,String sex)
	{
		this.age=age;
		this.sex=sex;
	}
	@Override
	public String toString() {
		return "Resume [name=" + name + ", age=" + age + ", sex=" + sex + ", workExperience=" + workExperience + "]";
	}
	@Override
	protected Object clone() {
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException();
		}
	}
	
	
}
