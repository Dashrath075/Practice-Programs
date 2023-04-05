package dash;

import java.util.HashMap;
import java.util.Scanner;

public class AddElementsInHashMap {
	public static void main(String[] args) {
	HashMap<Integer, String> has=new HashMap<>();
	Scanner scr=new Scanner(System.in);
	System.out.println("enter some values:");
	for(int i=0;i<3;i++) {
		int b=scr.nextInt();
		scr.nextLine();
		String a=scr.nextLine();
		has.put(b, a);
	}
	System.out.println(has);
	scr.close();

}
}
