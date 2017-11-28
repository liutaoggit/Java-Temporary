package lt.g.arraylist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
//map类的14个方法
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		//增加 2ge 
		map.put(1, "aaa");
		map.put(2, "bbb");
		Map<Integer, String> childMap= new TreeMap<>();
		childMap.put(3, "ccc");
		map.putAll(childMap);
		
		int size = map.size();
		boolean empty = map.isEmpty();
		System.out.println("size:"+size+"isEmpty:"+empty);
		
//		hashCode,equals
		boolean containsKey = map.containsKey(1);
		boolean containsValue = map.containsValue("a");
		System.out.println(containsKey+" "+containsValue);
		
		System.out.println(map.values());
		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer+" "+map.get(integer));
		}
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		map.remove(1);
		map.clear();
		System.out.println(map);
	}
}
