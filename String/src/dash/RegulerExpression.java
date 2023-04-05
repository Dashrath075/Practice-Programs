package dash;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegulerExpression{
	public static boolean pattern(String str) {
		String regExp="^4[0-9]{12}(?:[0-9]{3})?$";
		Pattern pt=Pattern.compile(regExp);
		if(str==null) {
			return false;
		}
		Matcher mt=pt.matcher(str);
		boolean result=mt.matches();
		return result;
	}
	public static void main(String[] args) {
		String str="45679832134567";
		System.out.print(pattern(str));
	}
}

