package dash;
final class Fin{//cannot inherit final class
	final void show() {
     System.out.println("i am final method");		
	}
}
class Finaal1 extends Fin{
	final void show() {//cannot override final method
		System.out.println("i am not final method");
	}
}
public class FinalKey {
       public static void main(String[] args) {
    	   Finaal1 a=new Finaal1();
    	   //a.show1();
    	   a.show();
    	   //final variable if declared final then it couldn't be assigned with new value
    	   final int num=300;
    	   num = 200;
    	   System.out.println(num);
       }
}
