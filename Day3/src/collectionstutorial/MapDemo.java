package collectionstutorial;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> stateCodes = new HashMap<>();
				
		stateCodes.put("AP", "Andhra Pradesh");
		stateCodes.put("TS", "Telegana");
		stateCodes.put("KL", "Kerala");
		stateCodes.put("GA", "Goa");
		stateCodes.put("DM", "Daman");
		stateCodes.put("PY", "Pondicherry");
		stateCodes.put("TN", "Tamil Nadu");
		stateCodes.put("JH", "Jharkhand");
		System.out.println(stateCodes);
		
		
		Set<String> keySet = stateCodes.keySet();
		for(String key: keySet){
			System.out.println(key+" ----> "+stateCodes.get(key));
		}
		
		Collection<String> c = stateCodes.values();
		for(String v: c){
			System.out.println(v);
		}
	}
}
