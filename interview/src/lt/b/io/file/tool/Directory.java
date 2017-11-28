package lt.b.io.file.tool;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class Directory {
	public static File[] locale(File dir,final String regex)
	{
		return dir.listFiles(new FilenameFilter() {
			Pattern pattern=Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(new File(name).getName()).matches();
			}
		});
	}
	public static File[] locale(String path,final String regex)
	{
		return locale(new File(path), regex);
	}
	/**
	 * 嵌套类 用以保存文件中的目录和文件
	 * @author liutao
	 *
	 */
	public static class TreeInfo implements Iterable<File>
	{

		public List<File> files=new ArrayList<File>();
		public  List<File> dirs=new ArrayList<File>();
		@Override
		public Iterator<File> iterator() {
			// TODO Auto-generated method stub
			return files.iterator();
		}
		public void addAll(TreeInfo treeInfo)
		{
			files.addAll(treeInfo.files);
			dirs.addAll(treeInfo.dirs);
		}
		@Override
		public String toString() {
			return "TreeInfo [files=" + files.toString().replace(',', '\n') + "\n dirs=" + dirs + "]";
		}
		//walk  遍历一个文件以及其子文件夹下的所有文件和目录	
	}
	public static TreeInfo walk(String start,String regex)
	{
		return recurseDirs(new File(start), regex);
	}
	public static TreeInfo walk(File start,String regex)
	{
		return recurseDirs(start, regex);
	}
	public static TreeInfo walk(File start)
	{
		return recurseDirs(start, ".*");
	}
	public static TreeInfo walk(String start)
	{
		return recurseDirs(new File(start), ".*");
	}
	static TreeInfo recurseDirs(File startDir,String regex)
	{
		TreeInfo result=new TreeInfo();
		for(File item:startDir.listFiles())
		{
			if(item.isDirectory())
			{
				result.dirs.add(item);
				result.addAll(recurseDirs(item, regex));
			}else {
				if(item.getName().matches(regex))
				{
					//在方法外计算长度 在这里面太不合理了
					result.files.add(item);
				}
			}
		}
		return result;
	}
}
