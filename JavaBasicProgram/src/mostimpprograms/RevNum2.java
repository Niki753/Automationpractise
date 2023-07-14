package mostimpprograms;

import java.util.Scanner;

public class RevNum2 {


	static int reverse() {
		Scanner scn = new Scanner(System.in);
		int num;
		//int rev;
		//int rem;
	System.out.println("enter no. u wan to reverse");
	num= scn.nextInt();
			//rev = scn.nextInt();
		//System.out.println(" enter rev.");
		//rem = scn.nextInt();
		//System.out.println("enter remainder");
		int rev= 0,rem;
		for(;num>0;) {
			
			rem =num%10;
			rev= rev*10+rem;
			num=num/10;
			
		}
		return rev;
		
	}
	public static void main(String[] args) {
     // reverse();    
	System.out.println(reverse());
	   
}}

