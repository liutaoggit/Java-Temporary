package lt.g.arraylist;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjClone {
	/**
	 * 将对象写入到ByteArrayOutputStream中，用以实现深复制
	 * @param obj
	 * @return
	 */
	public static <T> T cloneObj(T obj)
	{

        T retVal = null; 
		ByteArrayOutputStream bais1=new ByteArrayOutputStream();
		try {
			ObjectOutputStream outputStream=new ObjectOutputStream(bais1);
			
			ByteArrayInputStream bais2=new ByteArrayInputStream(bais1.toByteArray());
			ObjectInputStream objectInputStream=new ObjectInputStream(bais2);
				retVal= (T) objectInputStream.readObject();
		} catch (IOException e) {
			throw new RuntimeException();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
		
		
	}

}
