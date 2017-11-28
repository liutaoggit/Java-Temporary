package lt.b.generic;

public class BasicGenerator<T> implements Generator<T>{

	private Class<T> type;
	
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}
	public T next() {
		try {
			return type.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException();
		}
	}
	

}
