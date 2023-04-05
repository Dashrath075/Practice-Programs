package dash;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class TraverseArrayList {
	public static void main(String[] a) {
           List<Integer> ar=new ArrayList<>();
           ar.add(1);
           ar.add(2);
           ar.add(3);
           ar.remove(1);
           ar.add(1, 3);
           System.out.println("ArrayList:"+ar);
           
           Iterator it=ar.iterator();
           while(it.hasNext()) {
        	   System.out.println(it.next());
           }
 	}

}
