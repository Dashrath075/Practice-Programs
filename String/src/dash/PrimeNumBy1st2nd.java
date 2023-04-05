package dash;

import java.util.Scanner;

public class PrimeNumBy1st2nd {
	static boolean prime(int number) {
		if(number==0 || number==1) {
			return false;
		}
		else {
			for(int i=2;i<number;i++) {
				if(number%2==0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		//prime numbers by starting number and ending number
        int num1;
        int num2;
        Scanner scr=new Scanner(System.in);
        num1=scr.nextInt();
        num2=scr.nextInt();
        for(int j=num1; j<=num2; j++){
            if(prime(j)) {
                System.out.print(j + " ");
	}

}
}
}
