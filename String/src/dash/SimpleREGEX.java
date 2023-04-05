package dash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleREGEX {
	public static boolean pattern(String str) {
		String regExp="^[a-z]+ " +" [A-Z]+";
		Pattern pt=Pattern.compile(regExp);
		if(str==null) {
			return false;
		}
		Matcher mt=pt.matcher(str);
		boolean result=mt.matches();
		return result;
	}
	public static void main(String[] args) {
		String str="vikrant  VIKRANT";
		System.out.print(pattern(str));
}
}
