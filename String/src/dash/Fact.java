package dash;
class Hii1{
	int i;
	int fact=1;
  public void factorial(int n) {
	  for(i=1;i<=n;i++) {
		  fact=fact*i;
	  }
	  System.out.println("factorial of number:"+fact);
  }
}
public class Fact {
public static void main(String[] args) {
	Hii1 h=new Hii1();
	h.factorial(5);
}
}
