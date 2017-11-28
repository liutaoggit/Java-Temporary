package lt.b.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 程序在运行时，所有泛型的参数化类型信息都会被擦除
 * 即List<String>和List<Integer>是相同的Class对象
 * @author liutao
 *
 */
public class LostInformation {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<Integer, String>();
	List<String> list=new ArrayList<String>();
	Set<Double> set=new HashSet<Double>();
	System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
	System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
	System.out.println(Arrays.toString(set.getClass().getTypeParameters()));
}
}
