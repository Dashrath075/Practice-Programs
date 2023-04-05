package dash;
class NegativeException1 extends Exception{
	String msg;
	public NegativeException1(String msg) {
		super(msg);
	}
}
public class NegetiveException {
	public static void checkNumber(int number) throws NegativeException1 {
		if(number<0) {
			throw new NegativeException1("enter positive correct numnber:");
		}
	}
    public static void main(String[] args) {
    	try {
    		checkNumber(-1);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
   }

