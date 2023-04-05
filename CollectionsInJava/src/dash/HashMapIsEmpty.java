package dash;
import java.util.*;
public class HashMapIsEmpty {
       public static void main(String[] args) {
    	   HashMap<Integer,String> hm=new HashMap<>();
    	   hm.put(1, "dash");
    	   hm.put(2, "hello");
    	   hm.put(3,"mello");
    	   //iterating throgh iterator hashmap
    	   Iterator it=hm.entrySet().iterator();
    	   while(it.hasNext()) {
    		   System.out.println(it.next());
    	   }
    	   System.out.println("iteration completed through iterator:");
    	   //through loop
    	   for(Map.Entry<Integer, String> mpe:hm.entrySet()) {
               int key=mpe.getKey();
          	 String value=mpe.getValue();
          	System.out.println(key+":"+value);
          }
    	   System.out.println(hm.isEmpty());
       }
}
