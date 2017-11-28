package lt.z.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

import lt.b.io.file.classical.BufferedInputFile;


//使用最小堆来统计单词出现次数 有点麻烦
//直接使用最大堆来解决此问题 虽然构造函数没有PriorityQueue(Collection,comparator)
//但是可以创建一个Comparator在逐个添加元素


//最简单的方法还是直接Collections.sort
public class CountWords2 {
	public static void main(String[] args) throws IOException {
		String read = BufferedInputFile.read("/home/liutao/fileOp/Directory.java");
		String[] split = read.split("\\W+");
		//		System.out.println(read);
		//		System.out.println(split.length);
		Map<String, Integer> map=new HashMap<>();
		for (String s : split) {
			Integer num=map.get(s);
			map.put(s,num==null?1:num+1 );
		}
		PriorityQueue<Entry<String, Integer>> priorityQueue=new PriorityQueue<>(new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue()<o2.getValue()?1:(o1.getValue()==o2.getValue()?0:-1);
			}
		});
		//				Topk<Map.Entry<String, Integer>> topk=new Topk<>(10, new PriorityQueue<>(map));
		List<Entry<String, Integer>> list=new ArrayList<>(map.entrySet());
		priorityQueue.addAll(list);

		//		PriorityQueue<Entry<String, Integer>> priorityQueue=new PriorityQueue<>(new Comparator<Map.EntryS>() {
		//		});
		while(priorityQueue.peek()!=null)
		{
			System.out.println(priorityQueue.poll());
		}
		//		Topk<Map<String, Integer>> topk=new Topk<>(10, new PriorityQueue<>(list));
	}
}
