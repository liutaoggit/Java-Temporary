package lt.g.prototype;

import org.junit.Test;

public class PrototypeTest {
	public static void main(String[] args) {
		Resume resume=new Resume("zhangsan");
		resume.setWorkExperience("1990-2000", "xxxx");
		Resume resume2=(Resume) resume.clone();
		resume2.setName("lisi");
		resume2.setWorkExperience("2000-2012", "yyyyyy");
		
		System.out.println(resume);
		System.out.println(resume2);
	}
	@Test
	public void fun1()
	{
		Resume2 resume=new Resume2("zhangsan");
		resume.setWorkExperience("1990-2000", "xxxx");
		Resume2 resume2=(Resume2) resume.clone();
		resume2.setName("lisi");
		resume2.setWorkExperience("2000-2012", "yyyyyy");
		
		System.out.println(resume);
		System.out.println(resume2);
	}

}
