package lt.b.io.file.classical;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BinaryFile {
	public static byte[] read(File bFile) throws IOException
	{
		BufferedInputStream in=new BufferedInputStream(new FileInputStream(bFile));
		byte[] b=new byte[in.available()];
		in.read(b);
		in.close();
		return b;
	}
	public static void main(String[] args) throws IOException {
		byte[] read = BinaryFile.read(new File("/home/liutao/fileOp/dir.txt"));
		Map<Byte, Integer> map=new HashMap<Byte, Integer>();
		for(int i=0;i<read.length;i++)
		{
			Integer integer = map.get(read[i]);
			map.put(read[i], integer==null?1:integer+1);
		}
		for (Byte b : map.keySet()) {
			System.out.println(b+"=>"+map.get(b));
			
		}
	}
}
