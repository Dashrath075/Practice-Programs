package dash;

public class CapgeminiDay1 {
      public static void main(String[] args) {
    	  int num=10;
    	  System.out.println("num is:"+num);
    	  //widening casting
    	  int a=20;
    	  long b=a;
    	  System.out.println("implicit casting:"+b);
    	  //narrowing casting
    	  int c= (int) b;
    	  System.out.println("long to int casting:"+c);
    	  //operators
    	  //postIncrement
    	  int num1=10;
    	  System.out.println("PostIncrement:"+num1++);
    	  System.out.println(num1);
    	  //preIncrement
    	  System.out.println("PreIncrement:" + ++num1);
    	  System.out.println(num1);
    	  //ternary operator
    	  int h=20,j=30;
    	  int max = (h>j) ? h:j;
    	  System.out.println(max);
    	  //logical and assignment operators
    	  int n1=100,n2=200;
    	  boolean d=true;
    	  boolean e=false;
    	  if(n1 != 0 && n2==200) {
    		  System.out.println(d);
    	  }
    	  else {
    		  System.out.println(e);
    	  }
      }
}
