package dash;

import java.util.Scanner;

public class Multiplcation {
    public static void main(String[] args) {
    	System.out.println("enter a number:");
    	Scanner scr=new Scanner(System.in);
    	int num=scr.nextInt();
    	scr.close();
    	int multi=0;
    	System.out.println("multiplication of "+ num +" is :");
    	for(int i=1;i<=10;i++) {
    		multi=num*i;
    		System.out.println(multi);
    	}
    	
    }
}
