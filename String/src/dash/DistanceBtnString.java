package dash;
public class DistanceBtnString{
	public static void main(String[] args) {
		String s[]= {"the", "quick1","brown","fox","quick"};
		String w1="the",w2="fox";
		int count=0,d1=0,d2=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]==w1) {
				d1=count;
			}
			if(s[i]==w2) {
				d2=count;
			}
			count++;
		}
		System.out.println("distance between two strings:"+(d2-d1));
	}
}