package randompractise1;

import java.util.Scanner;

public class Kcountnumber3 {

	public static void main(String[] args) {
 
		Scanner scn= new Scanner(System.in);
        int num,count=0;
        System.out.println("enter number to count the digits");
        num= scn.nextInt();
        for(;num!=0;count++) {
        	num=num/10;
        }
        System.out.println(count);
        }

}
