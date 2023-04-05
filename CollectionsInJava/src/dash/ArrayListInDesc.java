package dash;
import java.util.*;
public class ArrayListInDesc {
    public static void main(String[] arg) {
    	List<Integer> li=new ArrayList<>();
    	li.add(10);
    	li.add(20);
    	li.add(30);
    	li.add(50);
    	Collections.sort(li, Collections.reverseOrder());
    	System.out.println("ArrayList in Decreasing order:");
    	for(Integer i: li){
    	      System.out.println(i);
    }
}
}
