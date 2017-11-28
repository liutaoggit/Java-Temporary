package lt.a.rtti.test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.omg.CORBA.StructMember;

import lt.a.rtti.Pet;

/**
 * 使用动态的instanceof代替　instanceof
 * @author liutao
 *
 */
public class PetCount3 {
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer>{
		public PetCounter() {
//			super(arg0)
			// TODO Auto-generated constructor stub
			
		}

		public void count(Pet pet)
		{
			for (Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()) {
				if(pair.getKey().isInstance(pet))
				{
					put(pair.getKey(),pair.getValue()+1);
				}
			}
		}
		public String toString() {
			StringBuilder result=new StringBuilder("{");
			for ( Map.Entry<Class<? extends Pet>, Integer> pair: entrySet()) {
				result.append(pair.getKey().getSimpleName());
				result.append("=");
				result.append(pair.getValue());
				result.append(",");
			}
			String substring = result.substring(0, result.length()-1);
			return substring;
		}
		
	}
}
