package lt.b.io.file.classical;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import lt.b.io.file.tool.Directory;
import lt.b.io.file.tool.Directory.TreeInfo;

public class Ex20 {

	@Test
	public void fun1() throws IOException
	{
		//将16进制转换为字节 再比较
		final  byte[] signature =
			{(byte)202, (byte)254, (byte)186, (byte)190};
		
		TreeInfo walk = Directory.walk("./bin/lt/a/rtti", "\\w+\\.class$");
		List<File> list=walk.files;
		for (File file : list) {
			byte[] read = BinaryFile.read(file);
			for(int i=0;i<4;i++)
			{
				if(read[i]!=signature[i])
				{
					System.out.println(file.getName()+"不以cafebabe开头");
					break;
				}
					
			}
		}
//		System.out.println();
//		File file = new File("./bin/lt/a/rtti");
//		System.out.println(file.list().length);
		
	}
	@Test
	public void fun3()
	{
		DataInputStream in=new DataInputStream(System.in);
	}
}
