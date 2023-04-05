package dash;
import java.util.*;
public class CheckHashSetElement {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(12);
		hs.add(14);
		hs.add(16);
		hs.add(18);
		int value=18;
		System.out.println(hs.contains(value));
	}
}
