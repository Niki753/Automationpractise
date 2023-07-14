package scannerclass;

import java.util.Scanner;

public class Scannerclass3 {
	static void primeornot() {
// prime number or not using scanner class
		Scanner scn= new Scanner(System.in);
		int num;
		//int ct;
		System.out.println("enter number ");
		num = scn.nextInt();
		
		//System.out.println("enter count");
		
	//	ct = scn.nextInt();
			int ct=0;	
        for(int i =1;i<=num;i++) {
        	if(num%i==0) {
        		ct++;
        	}
        }
        if(ct==2) {
        	System.out.println("no. is prime");
        	
        }
        else {
        	System.out.println("no. is not prime");
        }
          		
	}

	public static void main(String[] args) {
        primeornot();
	}

}
