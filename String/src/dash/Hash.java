package dash;
import java.util.*;
public class Hash{
       public static void main(String[] args) {
    	HashMap<String, Integer> has=new HashMap<>();
    	Scanner scr=new Scanner(System.in);
    	System.out.println("enter some values:");
    	for(int i=0;i<3;i++) {
    		String a=scr.nextLine();
    		int b=scr.nextInt();
    		scr.nextLine();
    		scr.close();
    		has.put(a, b);
    	}
    	System.out.println(has);
       }
}
