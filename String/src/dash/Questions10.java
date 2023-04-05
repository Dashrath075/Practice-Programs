package dash;
import java.util.*;
public class Questions10 {
	public static void main(String[] args) {
		//numbers equal or not 
		System.out.println("---number is equal or not---");
		int num1,num2,num3,num4;
		Scanner scr=new Scanner(System.in);
		num1=scr.nextInt();
		num2=scr.nextInt();
		num3=scr.nextInt();
		num4=scr.nextInt();
		if(num1==num2 && num1==num3 && num1==num4) {
			if(num2==num3 && num2==num4) {
				if(num3==num4) {
					System.out.println("all are equal");
				}
			}
		}
		else {
			System.out.println("not equal");
		}
		//Check Double between 0 and 1
		double a=scr.nextDouble();
		double b=scr.nextDouble();
		if(a>0 && a<1) {
			if(b>0 && b<1) {
				System.out.println("True");
			}
		}
		else {
			System.out.println("false");
		}
		//java code read 0 to 1000 and add those together
		int num=1000;
		int sum=0;
		for(int i=0;i<num;i++) {
		sum=sum+i;
		}
		System.out.println("sum of 0 to 1000:"+sum);
		//operations
		int n1=100,n2=200;
		int sum1=n1+n2;
		int diff=n1-n2;
		float prod=n1*n2;
		float div=n1/n2;
		float average=(n1+n2)/2;
		System.out.println("sum:"+sum1);
		System.out.println("diff:"+diff);
		System.out.println("prod:"+prod);
		System.out.println("div:"+div);
		System.out.println("average:"+average);
		if(n1>n2) {
			System.out.println("larger:"+n1);
		}
		else {
			System.out.println("larger:"+n2);
		}
		if(n1<n2) {
			System.out.println("smaller:"+n1);
		}
		else {
			System.out.println("smaller:"+n2);
		}
		//greatest of three numbers
		int n3=300;
		if(n1>n2 && n1>n3) {
			System.out.println("greatest:"+n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("greatest:"+n2);
		}
		else if(n3>n1 && n3>n2) {
			System.out.println("gretaest:"+n3);
		}
		//positive or negative number
		int number;
		Scanner sscr=new Scanner(System.in);
		number=sscr.nextInt();
		if(number>0) {
			System.out.println("positive");
		}
		else {
			System.out.println("Negetive");
		}
		//program to display days
		int day=scr.nextInt();
		for(int i=1;i<=7;i++) {
			if(i==day) {
				switch(i) {
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("tuesday");
					break;
				case 3:
					System.out.println("wednesday");
					break;
				case 4:
					System.out.println("thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
				default:
					System.out.println("Hii");
				}
			}
		}
	}

}
