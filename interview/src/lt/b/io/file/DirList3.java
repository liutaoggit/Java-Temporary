package lt.b.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 更彻底的匿名内部类
 * 在方法内部实现匿名内部类返回一个FileNameFilter引用
 * @author liutao
 *
 */
public class DirList3 {
	public static void main(String[] args) {
		File path=new File("/home/liutao/fileOp");
		String regex="\\w+.java";
		String[] list=path.list(new FilenameFilter() {
			Pattern pattern=Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(name).matches();
			}
		});
		System.out.println(Arrays.toString(list));
	}
}
