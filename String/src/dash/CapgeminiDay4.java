package dash;
//Single inheritance
class Hii{
	void display1() {
		System.out.println("I Said Hii");
	}
}
class Hello extends Hii{
	void display() {
		System.out.println("I said Hello");
	}
}
//Multilevel inheritance
class Bye extends Hello{
    void bye() {
    	System.out.println("multilevel inhertance");
    }
}
public class CapgeminiDay4 {
	public static void main(String[] args) {
		Bye h=new Bye();
		h.display();
		h.display1();
		h.bye();
	}

}
//multiple Inheritance Not supported
class a{
	void display() {
		System.out.println("Hello");
	}
}
class b {
	void display() {
		System.out.println("Hii");
	}
}
class c extends a //,b
{
	
}
//Hierarchical Not supported
