package lt.b.io.file.classical;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Ex12 {
	public static void main(String[] args) throws IOException {
		List<String> read =BufferedInputFile.read1();
		int count=1;
		PrintWriter printWriter=new PrintWriter("/home/liutao/fileOp/7.txt");
		for(String s:read)
		{
			printWriter.println((count++) +s);
		}
		printWriter.close();
	}
}
