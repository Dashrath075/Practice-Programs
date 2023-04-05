package dash;

   abstract class AbsClass1 {
   public void show() {
	   System.out.println("this is abstract class:");
   }
}
class Hello1 extends AbsClass1{
	void show1() {
		System.out.println("Sub class:");
	}
}
public class AbsClass{
	public static void main(String[] args) {
		Hello1 h=new Hello1();
		h.show();
		h.show1();
		
	}
	
}