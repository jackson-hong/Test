package august.twelveth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<String> set = new HashSet<String>();
//		
//		set.add("BDC");
//		set.add("EAS");
//		set.add("QWDFE");
//		set.add("GRWED");
//		set.add("EDC");
//		
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("BDC", 323);
		map1.put("ABC", 123);
		map1.put("DEF", 456);
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		
		map2.put("BDC", 243);
		map2.put("ABC", 123);
		map2.put("FED", 654);
		
		map1.keySet().retainAll(map2.keySet());
		
		System.out.println(map1);
		
		
		
		
	}

}
