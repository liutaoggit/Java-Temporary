package lt.b.generic.generator1;

import java.util.Collection;

import lt.b.generic.Generator;


/**
 * 使用泛型填充某个Collection
 * @author liutao
 *
 */
public class Generators {
	public static <T> Collection<T> fill(Collection<T> collection,Generator<T> generator,int n){
		for(int i=0;i<n;i++)
		{
			collection.add(generator.next());
		}
		return collection;
	}
}
