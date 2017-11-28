package lt.b.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 
 * 使用外部类实现FileNameFilter接口
 * 
 * File 两个含义
 * 1 代表一个特定的文件
 * 2 代表一个目录下的一组文件
 * @author liutao
 *
 */

//list(FileNameFilter)内部很简单
//获取list
//遍历list依次调用accpet(this,name[i])
//public String[] list(FilenameFilter filter) {
//    String names[] = list();
//    if ((names == null) || (filter == null)) {
//        return names;
//    }
//    List<String> v = new ArrayList<>();
//    for (int i = 0 ; i < names.length ; i++) {
//        if (filter.accept(this, names[i])) {
//            v.add(names[i]);
//        }
//    }
//    return v.toArray(new String[v.size()]);
//}
public class DirList {
	public static void main(String[] args) {
		File path=new File("/home/liutao/fileOp");
//		System.out.println(path.getAbsolutePath());
//		System.out.println(Arrays.toString(path.list()));
		String[] list = path.list(new DirFilter("\\w+.java"));
		System.out.println(Arrays.toString(list).replace(',', '\n'));
	}
}
class DirFilter implements FilenameFilter
{
	private Pattern pattern;
	
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}

	@Override
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
}