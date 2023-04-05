package dash;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;
public class NumberStartswith1 {
	
     public static void main(String[] args) {
    	 int[] array = {2135,1234,1243,67987,8987};
    	     Arrays.stream(array)
    	     .filter(p -> String.valueOf(p).startsWith("1")).forEach(System.out::println);

    	 }
     }

