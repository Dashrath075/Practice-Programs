package dash;

import java.util.Scanner;

public class CapgeminiDay2 {
public static void main(String[] args) {
	int a=10,b=20,c=30;
	//Control statements
	if(a>b && a>c) {
		System.out.println(a);
	}
	else if(b>a && b>c) {
		System.out.println(b);
	}
	else {
		System.out.println(c);
	}
	//Switch statement
	int num=4;
	switch(num) {
	case 1:
		System.out.println("hello");
		break;
	case 2:
		System.out.println("hii");
		break;
	case 3:
		System.out.println("how are you");
	default:
		System.out.println("default case");
	}
	//while loop entry controlled
	int i=1;
	while(i<5) {
		System.out.println(i);
		i++;
	}
	//do while Exit controlled
	int num1=1;
	System.out.println("---------------do while------");
	do {
		System.out.println(num1);
		num1++;
	}while(num1<10);
	//for loop Entry controlled
	for(int j=0;j<5;j++) {
		System.out.println(j);
	}
	//String creation
	//using literal creation
	String s="hii";
	String s1="hlo";
	String s2="hii";
	if(s==s1) {
		System.out.println("s and s2 Strings matched");
	}
	else if(s==s2) {
		System.out.println("s and s2 strings matched");
	}
	else if(s1==s2) {
		System.out.println("s1 and s2 are matched");
	}
	else {
		System.out.println("pattern not matched");
	}
	//using new keyword
	String s3=new String("hii");
	String s4=new String("hlo");
	String s5=new String("hii");
	System.out.println(s3.equals(s4));
	System.out.println(s3.equals(s5));
	//difference b/n next() and nextLine();
    String s6="hello world";
    Scanner scr=new Scanner(s6);
    System.out.println("next():"+scr.next());//splits a word from sentence and returns
    System.out.println("nextLine():"+scr.nextLine());//returns whole sentence
    scr.close();
    
	}
}
