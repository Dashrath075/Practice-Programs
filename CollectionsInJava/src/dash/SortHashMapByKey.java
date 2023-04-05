package dash;
import java.util.*;
public class SortHashMapByKey {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(7, "dash");
		map.put(1, null);
		map.put(5, "hii");
		map.put(6, "hello");
		map.put(2, "amma");
		for(Map.Entry<Integer, String> es:map.entrySet()) {
			int key=es.getKey();
			System.out.print(map);
			break;
		}
		//after sorting
		System.out.println(" ");
		System.out.println("after sorting");
		TreeMap<Integer,String> tm=new TreeMap<>(map);
		Iterator it=map.keySet().iterator();
		while(it.hasNext()) {
			int key=(int) it.next();
			System.out.println(key+":"+map.get(key));
		
		}
	}
}

