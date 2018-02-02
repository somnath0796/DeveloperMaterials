package objectserialization;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;



public class SerializerDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("mydata.ser");
		User u = new User("James","London","james@machar.com");
		new ObjectOutputStream(fos).writeObject(u);
		
	}
}
