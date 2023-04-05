package dash;

public class RemoveDuplicate {
public static void main(String[] args) {
	StringBuffer sbr1=new StringBuffer();
	String d= "aabbcdef";
	int i;
	char[] result=d.toCharArray();
	//print the duplicate characters from a string
			for(i=0;i<d.length();i++) {
				boolean repeated=false;
				for(int j=i+1;j<d.length();j++) {
					if(result[i]==result[j]) {
						repeated=true;
						break;
					}
				}
				if(repeated) {
					sbr1.append(result[i]);
				}
			}
			System.out.println(sbr1);

}
}
