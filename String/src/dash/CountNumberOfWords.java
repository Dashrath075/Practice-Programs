package dash;

public class CountNumberOfWords {
 public static void main(String[] args) {
	 String s="amar dasu bhanu ganesh";
	 int count=0;
	 char[] a=s.toCharArray();
	 for(int i=0;i<s.length();i++) {
		      if((i>0)&&(a[i]!=' ')&&(a[i-1]==' ')|| ((a[0]!=' ')&&(i==0))){
		    	 count++; 
		      }
		 }
	 System.out.println(count);
	 }
 }