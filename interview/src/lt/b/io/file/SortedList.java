package lt.b.io.file;

import java.io.File;
import java.util.Arrays;

public class SortedList {
	private File path;

	public SortedList(File path) {
		this.path = path;
	}
	
	public SortedList() {
		this.path=new File(".");
	}

	public String[] list(){
//		String[] list = path.list();
		Arrays.sort(path.list(),String.CASE_INSENSITIVE_ORDER);
		return path.list();
	}
	public String[] list(String regex)
	{
		return path.list(new DirFilter("\\w+.java"));
	}
	
	public static void main(String[] args) {
		String dir="/home/liutao/fileOp";
		SortedList sortedList=new SortedList(new File(dir));
		String[] list = sortedList.list();
//		System.out.println(Arrays.toString(list).replace(',', '\n'));
		int sum=0;
		for (String string : list) {
			File file=new File(dir, string);
			sum+=file.length();
		}
//		denoted指示
		//长度是byte
		System.out.println(sum);
		
	}
}
