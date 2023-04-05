package dash;


import java.util.Arrays;
import java.util.List;

public class Streamapi {
	public static void main(String args) {
		List<Integer> list = Arrays.asList(4, 3, 7, 8, 10, 1);
		for (int i:list) {
			if(i%2==0) {
				System.out.println(i);
		    }
		}
}
}