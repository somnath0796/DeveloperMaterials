package collectionstutorial;

import java.util.Properties;
import java.util.Set;

public class SysProp {

	public static void main(String[] args) {
		Properties p  = System.getProperties();
		System.out.println(p);
		
		Set<Object> keySet = p.keySet();
		for(Object key: keySet){
			System.out.println(key+" ----> "+p.get(key));
		}
	}

}
