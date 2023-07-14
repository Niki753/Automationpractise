package sunday2;

import java.util.Scanner;

public class Scannerpalindrome {

	static void palin() {
		Scanner scn= new Scanner (System.in); 
		int rev=0,rem,temp;
		
		int num;System.out.println("Enter no. to check if its palin or not");
        num= scn.nextInt();
		
        
		temp=num;
		for(;num>0;) {
			rem=num%10;
			rev= rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("no. is palin");
			
		}else {
			System.out.println("no. is not palin");
		}
	}
	
	
	
	public static void main(String[] args) {
		palin();
	}

}
