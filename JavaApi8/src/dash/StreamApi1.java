package dash;
import java.util.*;
import java.util.stream.Collectors;
public class StreamApi1 {
       public static void main(String[] args) {
    	   List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8);
    	   
    	   List<Integer> newli=li.stream().filter(n->n%2==0).collect(Collectors.toList());
    	   System.out.println(newli);
    	   
    	   li.stream().filter(n->n%2==0).forEach(System.out::println);
    	   
    	   long count=li.stream().filter(n->n%2==0).count();
    	   System.out.println("count:"+count);
    	   //
    	   List<String> str=Arrays.asList("amar","Dasu","chandu","Raju");
    	   str.stream().filter(s->s.startsWith("D")).forEach(System.out::println);
    	   //reduce method
    	   Optional<String> output =str.stream().reduce((n1,n2) -> n1.length() > n2.length() ? n1:n2);
    	   if(output.isPresent()) {
    		   System.out.println("more alphabets word:"+output.get());
    	   }
    	   else {
    	   System.out.println("output is empty:");
       }
}
}
