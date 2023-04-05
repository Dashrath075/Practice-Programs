package dash;

import java.util.Scanner;

public class SumofEvenandOddIntegers {
   public static void main(String[] args) {
	   System.out.println("enter array size");
	   Scanner scr=new Scanner(System.in);
	   int number=scr.nextInt();
	   System.out.println("enter array elements:");
	   int[] a=new int[number];
	   for(int j=0;j<number;j++) {
		   a[j]=scr.nextInt();
	   }
	   scr.close();
	   int even=0;
	   int odd=0;
	   for(int i=0;i<a.length;i++) {
		   if(a[i]%2==0) {
			   even=even+a[i];
		   }
		   else if(a[i]!=0) {
			   odd=odd+a[i];
		   }
		 
	   }
	   System.out.println("sum of even numbers:"+even);
	   System.out.println("sum of odd numbers:"+odd);
   }
}
