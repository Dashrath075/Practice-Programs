package dash;

import java.util.Scanner;

public class RemoveAgivenChar {
	public static void main(String[] args) {
		//remove a given character from a string
		StringBuffer sbr=new StringBuffer();
		int i;
		String s[]={"abcdefghijklmnopqrstuvwxyz"};
		Scanner scr=new Scanner(System.in);
		String s1=scr.next();
		scr.close();
		for(i=0;i<s.length;i++) {
			if(s[i]==s1) {
				s[i]=s[i].replace(s1, null);
				break;
			}
			sbr.append(s[i]);
			System.out.println(s[i]);
	}
}
}