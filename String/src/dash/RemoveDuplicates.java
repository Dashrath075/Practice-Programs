package dash;

public class RemoveDuplicates {
	public static void main(String[] args) {
		StringBuilder sbr=new StringBuilder();
		String d= "aabbcdef";
		int i;
		char[] result=d.toCharArray();
		for(i=0;i<d.length();i++) {
			boolean repeated=false;
			for(int j=i+1;j<d.length();j++) {
				if(result[i]==result[j]) {
				    repeated=true;
				    break;
				}
			}
			if(!repeated) {
			   sbr.append(result[i]);	
			}
	}
		System.out.println(sbr);
		}
}
