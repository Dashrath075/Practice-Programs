package dash;

public class CapsRegex {
    public static boolean detectCapitalUse(String word) {
        int n = word.length();
        for(int i=0;i<n;i++) {
        	if(Character.isUpperCase(word.charAt(i))) {
        	   	return true;
        	}
        	if(Character.isUpperCase(0)) {
        		return true;
        	}
        	if(Character.isLowerCase(word.charAt(i))) {
        		return true;
        	}
        }
		return false;
}
    public static void main(String[] args) {
    	String word="";
    	System.out.println(detectCapitalUse(word));
    }
}