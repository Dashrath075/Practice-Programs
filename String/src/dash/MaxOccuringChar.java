package dash;

public class MaxOccuringChar {
	public static void main(String[] args) {
      String s="maammmmmaarrr";
      int i;
      int count=1;
      int maxcount=0;
      char maxChar=0;
      char[] a=s.toCharArray();
      for(i=0;i<s.length();i++) {
    	  for(int j=i+1;j<s.length();j++)
    	  if(a[i]==a[j]) {
    		  count++;
    	  }  	  
    	  else {
    	        if(count>maxcount){
    	            maxcount=count;
    	            maxChar=a[i-1];
    	        }
    	        count = 1;
    	    }
    	}
    	if(count>maxcount){
    	    maxChar=(char) count;
    	    maxChar=a[a.length-1];
    	}
    	System.out.println(maxChar);
      }
}
