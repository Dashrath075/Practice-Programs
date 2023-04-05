package dash;
import java.util.*;
public class IterateHashSet {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(80);
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
