package lt.b.io.file.ex;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAcessFile {
	public static void main(String[] args) throws IOException {
		RandomAccessFile file=new RandomAccessFile("/home/liutao/fileOp/3.txt", "rw");
		file.writeInt(1);
		file.seek(0);
		int readInt = file.readInt();
		System.out.println(readInt);
				
	}
}
