package lt.g.arraylist;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

import lt.b.io.file.classical.BufferedInputFile;
import lt.b.io.file.tool.TextFile;

public class SortedMapTest {
	public static void main(String[] args) throws IOException {
		TreeMap<String, Integer> map=new TreeMap<>();
		String read = TextFile.read("/home/liutao/fileOp/Directory.java");
		
		String[] split = read.replaceAll("[\\u4e00-\\u9fa5]", "").split("\\W+");
		for (String s : split) {
			map.put(s, map.get(s)==null?1:map.get(s)+1);
		}
		//使用forEach遍历Set<Entry>
		for (Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}
		
//		map.firs
//		SortedSet四个方法
//		SortedMap<String, Integer> sortedMap=map;
		String firstKey = map.firstKey();
		String lastKey = map.lastKey();
		
//		sortedMap
		System.out.println(firstKey+" "+lastKey);
		
		SortedMap<String, Integer> tailMap = map.tailMap("tool");
		System.out.println(tailMap);
		
		SortedMap<String, Integer> headMap = map.headMap("File");
		System.out.println(headMap);
		
		//NavigableMap
		String lowerKey = map.lowerKey("File");
		String floorKey = map.floorKey("File");
		System.out.println(lowerKey+" "+floorKey);
		Entry<String, Integer> floorEntry = map.floorEntry("util");
		Entry<String, Integer> higherEntry = map.higherEntry("util");
		System.out.println(floorEntry+" "+higherEntry);
		
//		NavigableSet<String> descendingKeySet = map.descendingKeySet();
//		System.out.println(descendingKeySet);
		SortedSet<String> floor = map.descendingKeySet().headSet("pattern",true);
		System.out.println(floor);
		//		System.out.println(Arrays.toString(split));
//		String read = BufferedInputFile.read("/home/liutao/fileOp/Directory.java");
//		System.out.println(read);
	}
	
	
}
