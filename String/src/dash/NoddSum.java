package dash;
import java.util.*;
public class NoddSum {
	public static void main(String[] args) {
		int num,sum = 0;
		 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        num = in.nextInt();
 
        for(int i = 0; i <= num; i++){
            if((i%2) == 1){
            	System.out.println("odd numbers upto n:");
            	System.out.println(i);
                sum += i;
            }
        }
     
        System.out.print("sum of n odd numbers:"+ num + " = " + sum);
	}

}
