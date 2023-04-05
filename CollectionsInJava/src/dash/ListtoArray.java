package dash;
import java.util.*;
public class ListtoArray {
       public static void main(String[] a) {
    	   List<Integer> li=new ArrayList<>();
    	   li.add(10);
    	   li.add(20);
    	   li.add(30);
    	   li.add(40);
    	   Object[] obj=li.toArray();
    	   for(Object ob:obj) {
    		   System.out.println(ob);
    	   }
       }
}
