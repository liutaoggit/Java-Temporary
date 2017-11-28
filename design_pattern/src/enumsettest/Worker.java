package enumsettest;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Worker {
	String name;
	Set<Day> avaiableDays;
	public Worker(String name, Set<Day> avaiableDays) {
		this.name = name;
		this.avaiableDays = avaiableDays;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Day> getAvaiableDays() {
		return avaiableDays;
	}
	public void setAvaiableDays(Set<Day> avaiableDays) {
		this.avaiableDays = avaiableDays;
	}
	public static void main(String[] args) {
		Worker[] workers = new Worker[]{
				new Worker("张三", EnumSet.of(
						Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.FRIDAY)),
				new Worker("李四", EnumSet.of(
						Day.TUESDAY, Day.THURSDAY, Day.SATURDAY)),
				new Worker("王五", EnumSet.of(
						Day.TUESDAY, Day.THURSDAY)),
		};
		Enum enum1=Day.MONDAY;
		System.out.println(enum1.ordinal());
		
//		Set<Day> days = EnumSet.allOf(Day.class);
//		for(Worker w : workers){
//		    days.removeAll(w.getAvaiableDays());
//		}
		
//		Set<Day> days = EnumSet.noneOf(Day.class);
//		for(Worker w : workers){
//		    days.addAll(w.getAvaiableDays());
//		}
		
//		Set<Day> days = EnumSet.allOf(Day.class);
//		for(Worker w : workers){
//		    days.retainAll(w.getAvaiableDays());
//		}
//		System.out.println(days);
		
//		Set<Worker> availableWorkers = new HashSet<Worker>();
//		for(Worker w : workers){
//		    if(w.getAvaiableDays().containsAll(
//		            EnumSet.of(Day.MONDAY,Day.TUESDAY))){
//		        availableWorkers.add(w);
//		    }
//		}
//		for(Worker w : availableWorkers){
//		    System.out.println(w.getName());
//		}
		
//		Map<Day, Integer> countMap = new EnumMap<>(Day.class);
//		for(Worker w : workers){
//		    for(Day d : w.getAvaiableDays()){
//		        Integer count = countMap.get(d);
//		        countMap.put(d, count==null?1:count+1);
//		    }
//		}
//		Set<Day> days = EnumSet.noneOf(Day.class);
//		for(Map.Entry<Day, Integer> entry : countMap.entrySet()){
//		    if(entry.getValue()>=2){
//		        days.add(entry.getKey());
//		    }
//		}
//		System.out.println(days);
	}

}


enum Day {
	MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

