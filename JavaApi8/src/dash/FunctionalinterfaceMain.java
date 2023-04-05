package dash;
public class FunctionalinterfaceMain implements NewFuncInterface1 {
       public static void main(String[] args) {
    	   FunctionalinterfaceMain fi=new FunctionalinterfaceMain();
    	   fi.hello();
    	   fi.print("print method");
    	   System.out.println(NewFuncInterface1.show1());
    	   System.out.println(NewFuncInterface1.show());
       }
	@Override
	public void print(String msg) {
		System.out.println(msg);
		
	}
}
