package dash;
import java.util.*;
public class RightAngle {
	public static void main(String[] args) {
		int num;
		System.out.println("right angled triangle:");
		Scanner scr=new Scanner(System.in);
		num=scr.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) 
				System.out.print(j);
				System.out.println("");
		}
	}

}
