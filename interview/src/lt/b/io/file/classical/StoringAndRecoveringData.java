package lt.b.io.file.classical;

import java.awt.event.MouseWheelEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 注意DataOutputStream不是用来读写对象的
 * 
 * 使用对象序列化和XMl方式更容易读写数据
 * @author liutao
 *
 */
public class StoringAndRecoveringData {
public static void main(String[] args) throws IOException {
	DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/home/liutao/fileOp/01.txt")));
	out.writeInt(1);
	out.writeFloat(1.1F);
	out.writeUTF("hello world");
	out.close();
	DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream("/home/liutao/fileOp/01.txt")));
	int readInt = in.readInt();
	float readFloat = in.readFloat();
	String readUTF = in.readUTF();
	System.out.println(readInt+" "+readFloat+" "+readUTF);
	in.close();
	
	
}
}
