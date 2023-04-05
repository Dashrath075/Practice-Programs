package dash;

public class MaxandMinNumber {
	public static void main(String[] args) {
		int[] a= {2,4,1,3,7,6,8};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
				if(a[i]>max) 
					max=a[i];
				if(a[i]<min) 
					min=a[i];
		}
				
		System.out.println("max is:"+max);
		System.out.println("min is:"+min);
	}

}

