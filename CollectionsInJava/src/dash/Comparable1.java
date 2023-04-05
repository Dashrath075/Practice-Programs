package dash;
import java.util.*;
public class Comparable1 {
	public static void main(String[] args) {
		List<Emp> emp1=new ArrayList<>();
		emp1.add(new Emp(12,"amma","capgemini"));
		emp1.add(new Emp(116,"appa","capgemini"));
		emp1.add(new Emp(11,"Bomma","Capgemini"));
		Collections.sort(emp1);
		System.out.println(emp1);
		
		List<Emp> emp2=new ArrayList<>(emp1);
		Collections.sort(emp2,new Comparator1());
		System.out.println(emp2);
		}

}
