package randompractise1;

import java.util.Scanner;

public class JReversenumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("enter no. you want to reverse");
		num = scn.nextInt();

		for (; num > 0;) {

			int rem, rev = 0;

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

			System.out.print(rev);

		}

	}

}
