package dash;

public class StringMethods {
public static void main(String[]args) {
	String s="Amaar";
	System.out.println(s.length());
	//System.out.println(s.charAt(3));
	System.out.println(s.concat("+"+"Dashrath"));
	System.out.println(s.endsWith("r"));
	System.out.println(s.equalsIgnoreCase("amar"));
	System.out.println(s.equals("amar"));
	System.out.println(s.isBlank());
	System.out.println(s.isEmpty());
	System.out.println(s.substring(1,4));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.contains("maa"));
	String[] str=s.split("m",2);
	for(String a:str) {
		System.out.println(a);
	}
}
}
