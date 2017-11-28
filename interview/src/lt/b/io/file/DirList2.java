package lt.b.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 实现一个filter方法 返回一个引用 指向一个FileNameFilter引用
 * @author liutao
 *
 */
public class DirList2 {
	public static FilenameFilter filter(final String regex)
	{
//		 String regex="\\w+.java";
		return new FilenameFilter() {
			
			Pattern pattern=Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		};
	}
public static void main(String[] args) {
	File path=new File("/home/liutao/fileOp");
	String []list;
	list=path.list(filter("P\\w+.java"));
	Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
	System.out.println(Arrays.toString(list).replace(',', '\n'));
}
}
