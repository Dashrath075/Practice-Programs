package dash;
import java.util.Scanner;
public class StringLength {
	public static void main(String[] args) {
    //length
		Scanner scr=new Scanner(System.in);
	String s="Hello world";
	System.out.println("length:"+s.length());
	//UpperCase
	System.out.println("Uppercase:"+s.toUpperCase());
	//LowerCase
	System.out.println("Lowecase:"+s.toLowerCase());
	//trim
	System.out.println("trim:"+s.trim());//removes white spaces
    //reverse a string
	StringBuffer sb=new StringBuffer(s);
	System.out.println("reverse:"+sb.reverse());
	//String palindrome
	if(s.equals(sb)) {
	System.out.println("palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
	//large number in form of String check it is divisible by 7 if print 1 or 0
	String s1="1234567889";
	int a=Integer.parseInt(s1);
	System.out.println(a);
	if(a/7==0) {
		System.out.println("number is divisible by 7:"+1);
	}
	else {
		System.out.println("not divisible by 7:"+0);
	}
}
}
