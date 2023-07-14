package randompractise1;

import java.util.Scanner;

public class Gcheckposnegnumber {

	public static void main(String[] args) {
 
		Scanner scn= new Scanner(System.in);
 
		int num;
		System.out.println("Enter number you want to check if its  pos or neg");
		num= scn.nextInt();
		if(num>0) {
			System.out.println("no. is positive");
		}
		else if(num<0) {
			System.out.println("no. is negative");
		}
		else {
			System.out.println("no. is zero");
		}
		
		
	}

}
