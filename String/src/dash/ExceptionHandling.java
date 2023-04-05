package dash;

public class ExceptionHandling {
  public static void main(String[] args) {
	  try {
		  int n=100/0;
		  System.out.println(n);
		  System.out.println("hello");
	  }
	  catch(Exception e) {
		  System.out.println("enter correct input");
	  }
  }
}
