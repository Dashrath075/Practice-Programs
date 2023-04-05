package dash;

import java.util.Scanner;

public class First20PrimeNumbers{
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
		//prime numbers upto 20
		int num = 20; 
        for(int i=1; i<=num; i++){
            if(prime(i)) {
                System.out.print(i + " ");
            }
 
                }
	}
}
