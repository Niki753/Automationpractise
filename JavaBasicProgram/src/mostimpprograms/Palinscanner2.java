package mostimpprograms;

import java.util.Scanner;

public class Palinscanner2 {

	static void palinscan() {
		Scanner scr=new Scanner(System.in);
		int num;
		System.out.println("enter the number to check if its palindrome");
		num=scr.nextInt();
		int temp= num,rev=0,rem;
		for(;num>0;) {
		 rem= num%10;
		 rev= rev*10+rem;
		 num=num/10;
		}
		if (temp==rev) {
			System.out.println("number is palindrome");
			
		}
		else {
			System.out.println("number is not palindrome");
		}
	}
	public static void main(String[] args) {
		palinscan();
	}

}
