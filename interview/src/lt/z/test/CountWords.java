package lt.z.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import lt.b.io.file.classical.BufferedInputFile;

/**
 * 统计单词出现次数步骤
 * 
 * 1 使用HashMap<Integer,String>计数 
 * 2 将Entry<Integer,String>存入List中
 * 3 使用Collections.sor(list,comparator)方法进行排序
 * @author liutao
 *
 */

public class CountWords {
	public static void main(String[] args) {
		try {
			String read = BufferedInputFile.read("/home/liutao/fileOp/Directory.java");
			String[] split = read.split("\\W+");
//			System.out.println(read);
			//		System.out.println(split.length);
			Map<String, Integer> map=new HashMap<>();
					for (String s : split) {
						Integer num=map.get(s);
						map.put(s,num==null?1:num+1 );
					}
			List<Entry<String, Integer>> list=new ArrayList<>(map.entrySet());
			
			Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					// TODO Auto-generated method stub
					return o1.getValue()<o2.getValue()?1:(o1.getValue()==o2.getValue()?0:-1);
				}
			});
			System.out.println(list);
//			TreeMap<String, Integer> treeMap=new TreeMap<>(new Comparator<String>() {
//
//				@Override
//				public int compare(String o1, String o2) {
//					// TODO Auto-generated method stub
//					return 0;
//				}
//			});
//			System.out.println(treeMap);
			//		System.out.println(map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
