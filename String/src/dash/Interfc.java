package dash;
interface Fello{
	abstract void show();
}
class Hell implements Fello{
	String show1() {
		return "subclass";
	}
	@Override
	public void show() {
		System.out.println("Hello ");
		
	}
}
public class Interfc {
	public static void main(String[] args) {
  Hell a=new Hell();
  a.show();
}
}