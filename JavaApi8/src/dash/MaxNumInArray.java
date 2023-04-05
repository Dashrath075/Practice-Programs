package dash;
//1st
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxNumInArray {
  public static void main(String[] args) {
	  List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,10,20);
	   
	   Optional<Integer> output =li.stream().reduce((n1,n2) -> n1 > n2 ? n1:n2);
	   if(output.isPresent()) {
		   System.out.print("bigger num:"+output.get());
	   }
	   //2nd
	   System.out.println(" ");
	   li.stream().filter(n->n%10==0).forEach(System.out::println);
	   //4th add duplicate elements
	   List<Integer> list=Arrays.asList(1,2,3,4,10,5,10,6,7,8,10);
	   Optional<Integer> out =list.stream().reduce((n1,n2) -> n1==n2 ? n1+n2:0);
	   if(out.isPresent()) {
	   System.out.println(out);
	   
	   //5th findfirst()
	   List<Integer> list2=Arrays.asList(1,2,3,4,10,5,10,6,7,8,10);
	   Optional<Integer> list3=list2.stream().findFirst();
	   System.out.println(list3);
	   //6th
	   List<Integer> list4=Arrays.asList(1,2,3,4,10,5,10,6,7,8,10);
	   int a=list4.size();
	   System.out.println("size is:"+a);
	   //7th
	   List<Integer> list5=Arrays.asList(1,2,3,4,10,5,10,6,7,8,10);
	   Optional<Integer> list6=list5.stream().reduce((n1,n2) -> n1>n2 ? n1:n2);
	   if(list6.isPresent()) {
		   System.out.println("maximum element: "+list6.get());
		   //8th
	   //10th Given a list of integers, sort all the values present in it.
		   List<Integer> list7=Arrays.asList(1,2,3,4,10,5,10,6,7,8,10);
		   Stream<Integer> list8=list7.stream().sorted();
		   System.out.println(list8);
	   //12th
		   List<Integer> list9=Arrays.asList(1,2,3,4,10,5,10,6,7,8,10);
		   System.out.println("first 6 elements:");
		   list9.stream().limit(6).forEach(System.out::println);
	   //13th skip 5 elements
		   List<Integer> list10=Arrays.asList(1,2,3,4,10,5,10,6,7,8,10);
		   System.out.println("Skip first limited elements:");
		   list10.stream().skip(5).forEach(System.out::println);
		   //14th
		   List<Integer> list11=Arrays.asList(1,2,3,4,10,5,10,6,7,8,10);
		   System.out.println("Distict elements are:");
		   list11.stream().distinct().forEach(System.out::println);
		   //15th
		   List<String> str=Arrays.asList("amar","Dasu","chandu","Raju");
		   
	   }
	   }	  
  }
}
