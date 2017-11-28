package lt.b.io.file.ex;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjetStream {
	
	
	//向一个文件中写入一个类
	public static void main(String[] args) {
		ObjectInputStream in=null;
		ObjectOutputStream out=null;
		try {
			out=new ObjectOutputStream(new FileOutputStream("/home/liutao/fileOp/1.txt"));
			out.writeObject(new Studnet(1,"zhangsan","Beijing"));
			out.writeObject(new Studnet(2,"AAA","NanJing"));
			out.writeObject(new Studnet(3,"lisi","TianJing"));
			
			in=new ObjectInputStream(new FileInputStream("/home/liutao/fileOp/1.txt"));
//EOFException
			//			Object obj;
//			try {
//				while (( obj=in.readObject())!) {
//					System.out.println(obj);
//				}
//			} catch (ClassNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			
			
//			for(int i=0;i<3;i++)
//			{
//				try {
//					System.out.println(in.readObject());
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
/**
 * 将对象写进IO流，必须要将对象序列话
 * @author liutao
 *
 */
class Studnet implements Serializable{
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Studnet(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Studnet() {
		super();
	}
	@Override
	public String toString() {
		return "Studnet [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}