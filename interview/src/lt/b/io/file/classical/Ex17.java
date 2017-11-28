package lt.b.io.file.classical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import lt.b.io.file.tool.TextFile;

public class Ex17 {
	/**
	 * 正则表达式统计不好实现
	 * 查找替换比较方便
	 */
	@Test
	public void fun1()
	{
		String read = TextFile.read("/home/liutao/fileOp/dir.txt");
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<read.length();i++)
		{
			char charAt = read.charAt(i);
			Integer freq=map.get(charAt);
			map.put(charAt, freq==null?1:freq+1);
		}
		Set<Character> keySet = map.keySet();
		for (Character character : keySet) {
			System.out.println(character+"=>"+map.get(character));
		}
	}
}
